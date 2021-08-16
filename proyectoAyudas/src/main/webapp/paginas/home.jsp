<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<html>
    <head>
        <title> HOME </title>
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
            <div class="container-md">
                <c:if test = "${tipoUser == 1}">
                    <h3 class="text-center"> PANEL DE CONTROL - ALUMNO </h3>
                </c:if>
                <c:if test = "${tipoUser == 2}">
                    <h3 class="text-center"> PANEL DE CONTROL - ALUMNO </h3>
                </c:if>

                <br>
                <div class="row">
                    <div class="col col-6 border">
                        <h5 class="text-center"> MIS TRABAJOS </h5>
                        <!-- Columna de trabajos -->
                        <table class="table">
                            <thead>
                                <tr>
                                    <th scope="col">Token</th>
                                    <th scope="col">Asignatura</th>
                                    <th scope="col">Precio</th>
                                    <th scope="col">Fecha de Entrega</th>
                                    <th scope="col">Estado</th>
                                    <th scope="col">Accion</th>
                                </tr>
                            </thead>
                            <tbody>
                                <c:forEach var="trabajos" items="${trabajos}">
                                    <tr>
                                        <td>${trabajos.token}</td>
                                        <td>${trabajos.asignatura}</td>
                                        <td>${trabajos.precio} </td>
                                        <td>${trabajos.fechaEntrega} </td>
                                        <td>${trabajos.estado} </td>
                                <td>
                                    <a href="#"
                                       class="btn btn-secondary">
                                        <i class="fas fa-angle-double-right"></i> Ir
                                    </a>
                                </td>
                                </tr>
                            </c:forEach>
                            </tbody>

                        </table>
                    </div>


                    <!-- Columna de acciones -->
                    <div class="col col-3">
                        <h5 class="text-center">ACCIONES</h5>
                        <br>
                        <div class="text-center">
                            <a href="#" class="btn btn-danger"> NUEVO TRABAJO </a>
                        </div>
                    </div>
                    <!-- Columna de perfil -->
                    <div class=" border col col-lg-3" style="background-color: aliceblue;">
                        <h5 class="text-center"> MI PERFIL </h5>
                        <br>
                        <div class="text-center">
                            <img src="recursos/user.png" alt="" width="100" >
                        </div>
                        <br>
                        <div class="text-center">
                            <h6 style="font-size: 12px;">${usuario.nombre} ${usuario.apellido} </h6>
                            <h6 style="font-size: 12px; font-style: italic;"> ${usuario.programa}</h6>
                            <h6 style="font-size: 12px;">${usuario.universidad}</h6>
                            <h6 style="font-size: 12px;"> ${usuario.user} </h6>
                            <br>
                            <div class="text-center">
                                <a href="#" class="btn btn-success"> EDITAR PERFIL </a>
                            </div>
                            <br>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>