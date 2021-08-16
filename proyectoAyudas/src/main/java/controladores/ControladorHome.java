package controladores;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import modelos.Alumno;
import modelos.Trabajo;
import modelos.Tutor;

@SuppressWarnings("serial")
@WebServlet("/ControladorHome")
public class ControladorHome extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String accion = request.getParameter("accion");
        if (accion != null) {

            switch (accion) {
                case "login":
                    response.sendRedirect(request.getContextPath() + "/paginas/login.jsp");
                    break;
                case "register":
                    response.sendRedirect(request.getContextPath() + "/paginas/reg_tab.jsp");
                    break;
            }

        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String accion = request.getParameter("accion");
        if (accion != null) {
            switch (accion) {
                case "regAlumno":
                    this.registrarAlumno(request, response);
                    break;
                case "regTutor":
                    this.registrarTutor(request, response);
                    break;
                case "loginUser":
                    this.loginUser(request, response);
                    break;
            }
        }
    }

    private void registrarAlumno(HttpServletRequest request, HttpServletResponse response) throws IOException {
        //recuperamos los valores del formulario agregarCliente
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String telefono = request.getParameter("telefono");
        String universidad = request.getParameter("universidad");
        String programa = request.getParameter("programa");
        String user = request.getParameter("user");
        String password = request.getParameter("password");

        //Creamos el objeto de cliente (modelo)
        Alumno alumno = new Alumno(nombre, apellido, telefono, universidad, programa, user, password);

        //Insertamos el nuevo objeto en la base de datos
        int registrosModificados = new UsuarioDAO().registrarAlumno(alumno);
        System.out.println("registrosModificados = " + registrosModificados);

        response.sendRedirect(request.getContextPath() + "/paginas/login.jsp");

    }

    private void registrarTutor(HttpServletRequest request, HttpServletResponse response) throws IOException {
        //recuperamos los valores del formulario agregarCliente
        String nombre = request.getParameter("nombre_tutor");
        String apellido = request.getParameter("apellido_tutor");
        String telefono = request.getParameter("telefono_tutor");
        String profesion = request.getParameter("profesion_tutor");
        String user = request.getParameter("user_tutor");
        String password = request.getParameter("password_tutor");

        //Creamos el objeto de cliente (modelo)
        Tutor tutor = new Tutor(nombre, apellido, telefono, profesion, user, password);

        //Insertamos el nuevo objeto en la base de datos
        int registrosModificados = new UsuarioDAO().registrarTutor(tutor);
        System.out.println("registrosModificados = " + registrosModificados);

        response.sendRedirect(request.getContextPath() + "/paginas/login.jsp");
    }

    private void loginUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String option = request.getParameter("tipoUsuario");
        String user = request.getParameter("user");
        String password = request.getParameter("password");
        System.out.println("Está ingresando un " + option);
        switch (option) {
            case "alumno":
                Alumno alumno = new Alumno();
                UsuarioDAO usuario = new UsuarioDAO();
                alumno.setUser(user);
                alumno.setPassword(password);
                System.out.println(alumno.getUser());
                alumno = usuario.loginAlumno(alumno);
                System.out.println("Encontrado = " + alumno.getUser());
                if (alumno != null) {
                    HttpSession sesion = request.getSession();
                    System.out.println(sesion);

                    this.accionDefault(alumno, request, response);

                } else {
                    response.sendRedirect(request.getContextPath() + "/paginas/login.jsp");
                }
                break;
            case "tutor":
                break;
        }
    }

    private void accionDefault(Alumno alumno, HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String tipoUser = request.getParameter("tipoUsuario");
        System.out.println("Generando home para " + tipoUser);
        System.out.println("El alumno que inicia sesion es " + alumno.getNombre());
        List<Trabajo> trabajos_alumno = new TrabajoDAO().listarTrabajos_Alumno(alumno.getIdAlumno());
        System.out.println("los trabajos son para el id " + alumno.getIdAlumno() + "son "  + trabajos_alumno);
        HttpSession sesion = request.getSession();
        sesion.setAttribute("usuario", alumno);
        sesion.setAttribute("tipoUser", 1);
        sesion.setAttribute("trabajos", trabajos_alumno);
        response.sendRedirect(request.getContextPath() + "/paginas/home.jsp");
//            case "tutor":
//                Tutor tutor = (Tutor) sesion.getAttribute("tutor");
//                System.out.println("El alumno que inicia sesion es " + tutor.getNombre());
//                List<Trabajo> trabajos_tutor = new TrabajoDAO().listarTrabajos_Tutor(tutor);
//                sesion.setAttribute("trabajos", trabajos_tutor);
//                break;
    }
    //request.getRequestDispatcher("clientes.jsp").forward(request, response);

}

