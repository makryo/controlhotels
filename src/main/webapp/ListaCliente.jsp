<%-- 
    Document   : ListaCliente
    Created on : 21-mar-2019, 15:31:34
    Author     : iUser
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="./css/bootstrap.min.css" rel="stylesheet">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Clientes</title>
    </head>
    <div class="alert alert-success" role="alert">
        <h2 align="center"><font color="orange" ><font color="orange" face="Castellar"</font>Clientes</font></h2>
    </div>
    <div class="progress">
        <div class="progress-bar progress-bar-warning" role="progressbar" aria-valuenow="40" aria-valuemin="0" aria-valuemax="100" style="width: 100%">
            <span class="sr-only">100% Complete (success)</span>
        </div>
    </div>
    <body>
    <body align="center" style="background-color: skyblue">
        <ul class="nav nav-pills">
            <li role="presentation" class="active btn btn-warning"><a href="Principal.jsp">REGRESAR</a></li>
            <li role="presentation" class="active btn btn-warning"><a href="RegistroCliente.jsp">NUEVO</a></li>
        </ul>
    </body>
    <div align="center">

        <section class="col-md-12" >
            <h2 align="center">Listado de Clientes</h2>
            <br>
            <table class="table table-striped" border="5">
                <tr>
                    <th>ID</th>
                    <th>Nombre</th>
                    <th>telefono</th>
                    <th>direccion</th>
                    <th>estado</th>
                    <th>Opciones</th>
                </tr>

                <c:forEach items="${lista}" var="li">

                    <tr>
                        <td>${li.id}</td>
                        <td>${li.nombre}</td>
                        <td>${li.telefono}</td>
                        <td>${li.direccion}</td>
                        <td>${li.estado}</td>

                        <td>
                            <a class="btn btn-light" href="SerId?id=${li.id}">Editar</a>
                            <a class="btn btn-light" href="SerDelete?id=${li.id}">Borrar</a>
                        </td>
                    </tr>
                </c:forEach>
            </table>
            <footer>&copy; Copyright 2019 SoftDragon</footer>
        </section>
    </div>
</body>
</html>


