<%-- 
    Document   : RegistroCliente
    Created on : 20-mar-2019, 16:47:39
    Author     : iUser
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<!DOCTYPE html>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="./css/bootstrap.min.css" rel="stylesheet"> 
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Crear Cliente</title>

    </head>
    <div class="alert alert-success" role="alert">

        <h1 align="center"><font color="orange" ><font color="orange" face="Castellar"</font>Crear Clientes</font></h1>
    </div>
    <div class="progress">
        <div class="progress-bar progress-bar-warning" role="progressbar" aria-valuenow="40" aria-valuemin="0" aria-valuemax="100" style="width: 100%">
            <span class="sr-only">100% Complete (success)</span> 
        </div>
    </div>
    <body align="center" style="background-color: skyblue"> 
        <ul class="nav nav-pills">
            <li role="presentation" class="active btn btn-warning"><a href="http://localhost:8080/ControlHotels/SerClientTab">REGRESAR</a></li>
        </ul>
        <br><br>
    <body>
        <form  action="http://localhost:8080/ControlHotels/SerClient" method="post">

            <div class="form-group">

                <label class="control-label col-xs-3"><font color="black" face="Arial Black"</font>Nombre del cliente:</label>
                <div class="col-xs-8">
                    <input type="text" name="nombre" id="input" class="form-control"  placeholder="" pattern="[A-Za-z]{,15}"
                           title="Solo debe contener letras y un maximo de 15 caracteres">
                </div>
            </div>
            <br><br><br>
            <div class="form-group">
                <label class="control-label col-xs-3"><font color="black" face="Arial Black"</font>Direccion:</label>
                <div class="col-xs-8">
                    <input type="text" class="form-control" name="direccion" placeholder="">
                </div>
            </div>
            <br><br><br>
            <div class="form-group">
                <label class="control-label col-xs-3">Telefono:</label>
                <div class="col-xs-8">
                    <input type="text" name="telefono" class="form-control"  placeholder="" pattern="[0-9]{1,5}.+"
                           title="Solo puede contener numeros, con un maximo de 8 numeros y no puede estar vacio">
                </div>
            </div>
            <br><br><br>
            <div class="form-group">
                <label class="control-label col-xs-3">Estado del cliente:</label>
                <div class="col-xs-1">
                    <select name="estado" type="text"> 
                        <option></option>
                        <option>Activo</option>
                        <option>Inactivo</option>
                    </select>   
                </div>             
                <br><br><br>
                <div class="form-group">
                    <button type="submit" class="btn btn-warning" ><font color="blue" face="Arial Black">Guardar</font></button>
                </div>
            </div>
        </form>
    </body>

</html>

