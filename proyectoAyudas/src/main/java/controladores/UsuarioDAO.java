package controladores;

import config.Conexion;
import modelos.Alumno;
import modelos.Tutor;
import java.sql.*;
import java.util.*;

public class UsuarioDAO {

    private static final String sql_login_tutor = "SELECT * from tutor where user = ? and password = ?";
    private static final String sql_login_alumno = "SELECT * from alumno where user = ? and password = ?";
    private static final String sql_nuevo_alumno = "INSERT INTO alumno(nombre, apellido, telefono, universidad, programa, user, password)"
            + " VALUES(?, ?, ?, ?, ?, ?, ?)";
    private static final String sql_nuevo_tutor = "INSERT INTO tutor(nombre, apellido, telefono, profesion, user, password)"
            + " VALUES(?, ?, ?, ?, ?, ?)";
    private static final String sql_select_tutor = "SELECT * from tutor where user = ? and password = ?";
    private static final String sql_select_alumno = "SELECT * from alumno where user = ? and password = ?";

    // CLASE PARA HACER LA VALIDACIÓN DE CONTRASEÑA O INDICAR QUE NO ESTÁ REGISTRADO 
    public Tutor loginTutor(Tutor tutor) {
        int r = 0;
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {

            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(sql_login_tutor);
            stmt.setString(1, tutor.getUser());
            stmt.setString(2, tutor.getPassword());
            rs = stmt.executeQuery();
            rs.absolute(1);//nos posicionamos en el primer registro devuelto
            while (rs.next()) {
                r = r + 1;
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                String telefono = rs.getString("telefono");
                String profesion = rs.getString("profesion");
                String user = rs.getString("user");
                String password = rs.getString("password");
                System.out.println("ha iniciado sesion");

                tutor.setNombre(nombre);
                tutor.setApellido(apellido);
                tutor.setTelefono(telefono);
                tutor.setProfesion(profesion);
                tutor.setUser(user);
                tutor.setPassword(password);

            }

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        if (r == 1) {
            return tutor;
        } else {
            return null;
        }
    }

    // CLASE PARA HACER LA VALIDACIÓN DE CONTRASEÑA O INDICAR QUE NO ESTÁ REGISTRADO 
    public Alumno loginAlumno(Alumno alumno) {
        int r = 0;
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {

            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(sql_login_alumno);
            stmt.setString(1, alumno.getUser());
            stmt.setString(2, alumno.getPassword());
            rs = stmt.executeQuery();
            while (rs.next()) {
                r = r + 1;
                int idAlumno = rs.getInt("idAlumno");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                String telefono = rs.getString("telefono");
                String universidad = rs.getString("universidad");
                String programa = rs.getString("programa");
                String user = rs.getString("user");
                String password = rs.getString("password");
                System.out.println("ha iniciado sesion");

                alumno.setIdAlumno(idAlumno);
                alumno.setNombre(nombre);
                alumno.setApellido(apellido);
                alumno.setTelefono(telefono);
                alumno.setPrograma(programa);
                alumno.setUniversidad(universidad);
                alumno.setUser(user);
                alumno.setPassword(password);
            }

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        if (r == 1) {
            return alumno;
        } else {
            return null;
        }
    }

    public int registrarAlumno(Alumno alumno) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(sql_nuevo_alumno);
            stmt.setString(1, alumno.getNombre());
            stmt.setString(2, alumno.getApellido());
            stmt.setString(3, alumno.getTelefono());
            stmt.setString(4, alumno.getUniversidad());
            stmt.setString(5, alumno.getPrograma());
            stmt.setString(6, alumno.getUser());
            stmt.setString(7, alumno.getPassword());

            rows = stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return rows;
    }

    public int registrarTutor(Tutor tutor) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(sql_nuevo_tutor);
            stmt.setString(1, tutor.getNombre());
            stmt.setString(2, tutor.getApellido());
            stmt.setString(3, tutor.getTelefono());
            stmt.setString(4, tutor.getProfesion());
            stmt.setString(5, tutor.getUser());
            stmt.setString(6, tutor.getPassword());

            rows = stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return rows;
    }

}
