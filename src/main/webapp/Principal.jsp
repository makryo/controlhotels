<%-- 
    Document   : Principal
    Created on : 22-mar-2019, 0:48:30
    Author     : iUser
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="./css/bootstrap.min.css" rel="stylesheet">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"><title>PRINCIPAL</title>
    </head>
    <div class="alert alert-success" role="alert">
        <h1 align="center">
            <font color="black" >
            <font color="black" face="Castellar">ControlHotels</font>
        </h1>
    </div>
    <div class="progress">
        <div class="progress-bar progress-bar-warning" role="progressbar" aria-valuenow="40" aria-valuemin="0" aria-valuemax="100" style="width: 100%">
            <span class="sr-only">100% Complete (success)</span>
        </div>
    </div>
    <br>
    <br>
    <body align="center" style="background-color: skyblue"> 
     <ul class="nav nav-pills">
            <li role="presentation" class="active btn btn-warning"><a href="http://localhost:8080/ControlHotels/SerClose">Cerrar Sesion</a></li>
        </ul>
    <center> 
        <a href="http://localhost:8080/ControlHotels/SerClientTab">
            <button type="button" class="btn btn-group">
                <font color="black" face="Arial Black">Control de clientes</font>
            </button> 
        </a>
    </center>
    <br>

    <center>
        <a href="http://localhost:8080/ControlHotels/SerHabTab">
            <button type="button" class="btn btn-group">
                <font color="black" face="Arial Black">Control de habitaciones</font>
            </button>
        </a>
    </center>  

    <br><br><br><br><br>

    <div class="alert alert-success" role="alert">
        <h1 align="center">
            <font color="black" face="Castellar">"Bienvenido al sistema"
            </font>	
        </h1>
    </div>
    <br>
    <br>	 
</body>       
</html>
