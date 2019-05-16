<%-- 
    Document   : ListaHabitacion
    Created on : 24-mar-2019, 21:44:25
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
        <h2 align="center"><font color="orange" ><font color="orange" face="Castellar"</font>Habitaciones</font></h2>
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
            <li role="presentation" class="active btn btn-warning"><a href="RegistroHabitacion.jsp">NUEVO</a></li>
        </ul>
    </body>
    <div align="center">

        <section class="col-md-12" >
            <h2 align="center">Listado de Habitaciones</h2>
            <br>
            <table class="table table-striped" border="5">
                <tr>
                    <th>Id</th>
                    <th>Numero</th>
                    <th>Tipo</th>
                    <th>Estado</th>
                    <th>Precio</th>
                    <th>Opciones</th>
                </tr>

                <c:forEach items="${lista}" var="has">

                    <tr>
                        <td>${has.id}</td>
                        <td>${has.numero}</td>
                        <td>${has.tipo}</td>
                        <td>${has.estado}</td>
                        <td>${has.precio}</td>

                        <td>
                            <a class="btn btn-light" href="SerIdHab?id=${has.id}">Editar</a>
                            <a class="btn btn-light" href="SerDeleteHab?id=${has.id}">Borrar</a>
                        </td>
                    </tr>
                </c:forEach>
            </table>
            <footer>&copy; Copyright 2019 SoftDragon</footer>
        </section>
    </div>
</body>
</html>

