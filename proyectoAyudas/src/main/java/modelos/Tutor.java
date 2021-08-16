package modelos;

public class Tutor {
    
    private int idTutor; 
    private String nombre;
    private String apellido;
    private String telefono;
    private String profesion; 
    private String user;
    private String password; 
 
    public Tutor() {
    }

    public Tutor(String user, String password) {
        this.user = user;
        this.password = password;
    }

    public Tutor(int idTutor, String nombre, String apellido, String profesion, String user, String password) {
        this.idTutor = idTutor;
        this.nombre = nombre;
        this.apellido = apellido;
        this.profesion = profesion;
        this.user = user;
        this.password = password;
    }

    public Tutor(String nombre, String apellido, String telefono, String profesion, String user, String password) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.profesion = profesion;
        this.user = user;
        this.password = password;
    }


    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

        
    public int getIdTutor() {
        return idTutor;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setIdTutor(int idTutor) {
        this.idTutor = idTutor;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }
    
    
}
