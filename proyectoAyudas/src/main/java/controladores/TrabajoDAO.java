package controladores;

import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import modelos.Alumno;
import modelos.Trabajo;
import modelos.Tutor;

public class TrabajoDAO implements Itrabajo {
    
    private static final String sql_select_trabajo_by_alumno= "SELECT * from trabajo where idAlumno = ? ";
    private static final String sql_select_trabajo_by_tutor= "SELECT * from trabajo where idTutor = ? ";
    
    private static final String sql_nuevo_trabajo = "INSERT INTO trabajo(idAlumno, idTutor, asignatura, precio, fechaEntrega, estado, token)" + 
            "values(?,?,?,?,?,?,?)"; 

    @Override
    public List<Trabajo> listarTrabajos_Alumno(int idAl) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Trabajo trabajo = null; 
        List<Trabajo> listaTrabajos = new ArrayList<>();
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(sql_select_trabajo_by_alumno);
            stmt.setInt(1, idAl);
            rs = stmt.executeQuery();
            while (rs.next()) {
                int idTrabajo = rs.getInt("idTrabajo");
                // idAlumno, idTutor, asignatura, precio, fechaEntrega, estado, token
                int idAlumno = rs.getInt("idAlumno"); 
                int idTutor = rs.getInt("idTutor"); 
                String asignatura = rs.getString("asignatura");
                double precio = rs.getDouble("precio"); 
                Date fechaEntrega = rs.getDate("fechaEntrega");
                String estado = rs.getString("estado");
                String token = rs.getString("token");

                trabajo = new Trabajo(idAlumno, idTutor, asignatura, precio, estado, fechaEntrega, token);
                listaTrabajos.add(trabajo);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return listaTrabajos;

    }

    @Override
    public List<Trabajo> listarTrabajos_Tutor(Tutor tutor) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Trabajo trabajo = null; 
        List<Trabajo> listaTrabajos = new ArrayList<>();
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(sql_select_trabajo_by_tutor);
            stmt.setInt(1, tutor.getIdTutor());
            rs = stmt.executeQuery();
            while (rs.next()) {
                int idTrabajo = rs.getInt("idTrabajo");
                // idAlumno, idTutor, asignatura, precio, fechaEntrega, estado, token
                int idAlumno = rs.getInt("idAlumno"); 
                int idTutor = rs.getInt("idTutor"); 
                String asignatura = rs.getString("asignatura");
                double precio = rs.getDouble("precio"); 
                Date fechaEntrega = rs.getDate("fechaEntrega");
                String estado = rs.getString("estado");
                String token = rs.getString("token");

                trabajo = new Trabajo(idAlumno, idTutor, asignatura, precio, estado, fechaEntrega, token);
                listaTrabajos.add(trabajo);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return listaTrabajos;
    }
    
    
    
}
