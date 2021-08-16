package modelos;

import java.util.Date;

/**
 *
 * @author ingfa
 */
public class Trabajo {
        
    private String idTrabajo;
    private int idAlumno;
    private int idTutor;
    private String asignatura; 
    private double precio; 
    private String estado;
    private Date fechaEntrega; 
    private String token; 

    public Trabajo() {
    }

    public Trabajo(int idAlumno, int idTutor, String asignatura, double precio, String estado, Date fechaEntrega, String token) {
        this.idAlumno = idAlumno;
        this.idTutor = idTutor;
        this.asignatura = asignatura;
        this.precio = precio;
        this.estado = estado;
        this.fechaEntrega = fechaEntrega;
        this.token = token;
    }

    public Trabajo(String idTrabajo) {
        this.idTrabajo = idTrabajo;
    }

    public Trabajo(String idTrabajo, int idAlumno, int idTutor, String asignatura, double precio, String estado, Date fechaEntrega, String token) {
        this.idTrabajo = idTrabajo;
        this.idAlumno = idAlumno;
        this.idTutor = idTutor;
        this.asignatura = asignatura;
        this.precio = precio;
        this.estado = estado;
        this.fechaEntrega = fechaEntrega;
        this.token = token;
    }

    public String getIdTrabajo() {
        return idTrabajo;
    }

    public void setIdTrabajo(String idTrabajo) {
        this.idTrabajo = idTrabajo;
    }

    public int getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

    public int getIdTutor() {
        return idTutor;
    }

    public void setIdTutor(int idTutor) {
        this.idTutor = idTutor;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
    

    
    
}
