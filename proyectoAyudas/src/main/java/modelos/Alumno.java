package modelos;


public class Alumno {
    
    /* declaramos las variables que serán los atributos de la clase
    corresponden a los campos de la tabla en la BBDD 
    */
    
    private int idAlumno; 
    private String nombre;
    private String apellido;
    private String telefono;
    private String universidad;
    private String programa; 
    private String user;
    private String password; 

    public void setUser(String user) {
        this.user = user;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }


    public int getIdAlumno() {
        return idAlumno;
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

    public String getUniversidad() {
        return universidad;
    }

    public String getPrograma() {
        return programa;
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

    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }

    public Alumno() {
    }

    public Alumno(String user, String password) {
        this.user = user;
        this.password = password;
    }

    public Alumno(String nombre, String apellido, String telefono, String universidad, String programa, String user, String password) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.universidad = universidad;
        this.programa = programa;
        this.user = user;
        this.password = password;
    }

    public Alumno(int idAlumno, String nombre, String apellido, String telefono, String universidad, String programa, String user, String password) {
        this.idAlumno = idAlumno;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.universidad = universidad;
        this.programa = programa;
        this.user = user;
        this.password = password;
    }



}
