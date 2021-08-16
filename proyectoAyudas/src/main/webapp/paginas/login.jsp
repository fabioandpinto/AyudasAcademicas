<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title> MI PRIMER HTML </title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
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
                <div class="container-sm col-md-3 border border-primary" style="border: 20px; border: #4b4b4b;">
                    <div class="card-body text-center">
                        <img src="recursos/user.png" width="100" height="100" > 
                    </div>
                    <form method = "POST" action="${pageContext.request.contextPath}/ControladorHome?accion=loginUser">
                        <div class="form-group">
                            <label for="email">Correo electrónico</label>
                            <select name="tipoUsuario">
                                <option value="alumno">Alumno</option> 
                                <option value="tutor">tutor</option>
                            </select>
                        </div>
                        <div class="form-group">
                            <label for="email">Correo electrónico</label>
                            <input type="email" class="form-control" name="user" aria-describedby="emailHelp" placeholder="Ingresa tu correo">
                        </div>
                        <div class="form-group">
                            <label for="password">Password</label>
                            <input type="password" class="form-control" name="password" placeholder="Ingresa tu contraseña">
                        </div>
                        <br>
                        <button type="submit" class="btn btn-primary">Ingresar</button>
                        <br>
                        <br>
                        <h6> ¿No te encuentras registrado?</h6>
                        <h6> <a href="${pageContext.request.contextPath}/ControladorHome?accion=register" >
                                Regístrate aquí 
                            </a></h6>
                    </form>
                </div>

            </div>
        </div>

    </body>
</html>