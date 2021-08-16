<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
            <div class="container-sm col-md-3 border border-primary" style="border: 20px; border: #4b4b4b;">
                <br>
                <h5 class="h5 text-center"> BIENVENIDO A NUESTRO SISTEMA </h5>
                <br>
                <a href="${pageContext.request.contextPath}/ControladorHome?accion=register" class="btn btn-primary btn-lg btn-block col-12">
                    SOY NUEVO USUARIO
                </a>
                <br>
                <br>
                <a href="${pageContext.request.contextPath}/ControladorHome?accion=login" class="btn btn-danger btn-lg btn-block col-12">
                    YA ESTOY REGISTRADO
                </a>
                <br><br>

            </div>

        </div>
    </div>

</body>

</html>