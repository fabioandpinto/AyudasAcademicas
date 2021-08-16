<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

    <head>
        <title> MI PRIMER HTML </title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
              integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    </head>

    <body>
        <!-- HEADER DE LA PÁGINA -->
        <header>
            <jsp:include page="/snippets/header.jsp"/>
        </header>
        <br>
        <!-- REALIZAREMOS EL DIV DEL BODY -->
        <div class="container-lg">
            <div class="container-md" style="background-color: rgb(249, 255, 253);">
                <h3 class="text-center col-111"> Registro de Usuarios</h3>
                <br>

                <ul class="nav nav-tabs" id="myTab" role="tablist">
                    <li class="nav-item">
                        <a class="nav-link active" id="home-tab" data-toggle="tab" href="#home" role="tab"
                           aria-controls="home" aria-selected="true">SOY ALUMNO</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" id="profile-tab" data-toggle="tab" href="#profile" role="tab"
                           aria-controls="profile" aria-selected="false">SOY TUTOR</a>
                    </li>
                </ul>
                <div class="tab-content" id="myTabContent">
                    <div class="tab-pane fade show active" id="home" role="tabpanel" aria-labelledby="home-tab">
                        <br>
                        <form method="POST" action="${pageContext.request.contextPath}/ControladorHome?accion=regAlumno">
                            <div class="form-group">
                                <label for="name"> NOMBRE </label>
                                <input class="form-control" type="text" name="nombre" placeholder="Escribe tu nombre">
                            </div>
                            <br>
                            <div class="form-group">
                                <label for="lastname"> APELLIDO </label>
                                <input class="form-control" type="text" name="apellido" placeholder="Escribe tu apellido">

                            </div>
                            <br>
                            <div class="form-group">
                                <label for="email"> TELÉFONO </label>
                                <input class="form-control" type="number" name="telefono" placeholder="Escribe tu telefono">
                            </div>
                            <br>
                            <div class="form-group">
                                <label for="telefono"> UNIVERSIDAD </label>
                                <input class="form-control" type="text" name="universidad" placeholder="Escribe tu Universidad">
                            </div>
                            <br>
                            <div class="form-group">
                                <label for="programa"> PROGRAMA </label>
                                <input class="form-control" type="text" name="programa" placeholder="Escribe tu programa">
                            </div>
                            <div class="form-group">
                                <label for="programa"> CORREO </label>
                                <input class="form-control" type="email" name="user" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2, 4}$" placeholder="Escribe tu programa">
                            </div> 
                            <div class="form-group">
                                <label for="programa"> CONTRASEÑA </label>
                                <input class="form-control" type="password" name="password" placeholder="Escribe tu programa">
                            </div>
                            <br>
                            <button type="submit" class="btn btn-danger">
                                REGISTRARME
                            </button>
                        </form>
                    </div>
                    <div class="tab-pane fade" id="profile" role="tabpanel" aria-labelledby="profile-tab">
                        <br>
                        <form method="POST" action="${pageContext.request.contextPath}/ControladorHome?accion=regTutor">
                            <div class="form-group">
                                <label for="name"> NOMBRE </label>
                                <input class="form-control" type="text" name ="nombre_tutor" placeholder="Escribe tu nombre">
                            </div>
                            <br>
                            <div class="form-group">
                                <label for="lastname"> APELLIDO </label>
                                <input class="form-control" type="text" name = "apellido_tutor" placeholder="Escribe tu apellido">

                            </div>
                            <br>
                            <div class="form-group">
                                <label for="email"> TELÉFONO</label>
                                <input class="form-control" type="number" name ="telefono_tutor" placeholder="Escribe tu telefono">
                            </div>
                            <br>
                            <div class="form-group">
                                <label for="telefono"> PROFESIÓN </label>
                                <input class="form-control" type="texto" name ="profesion_tutor" placeholder="Escribe tu profesión">
                            </div>
                            <br>
                            <div class="form-group">
                                <label for="universidad"> CORREO </label>
                                <input class="form-control" type="text" name = "user_tutor" placeholder="Escribe tu correo">
                            </div>
                            <br>
                            <div class="form-group">
                                <label for="programa"> CONTRASEÑA </label>
                                <input class="form-control" type="text" name ="password_tutor" placeholder="Escribe tu contraseña">
                            </div>
                           <button type="submit" class="btn btn-danger">
                                REGISTRARME
                            </button>
                        </form>
                    </div>
                </div>
            </div>
        </div>


        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
                integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
        crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
                integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
        crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
                integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
        crossorigin="anonymous"></script>
    </body>

</html>