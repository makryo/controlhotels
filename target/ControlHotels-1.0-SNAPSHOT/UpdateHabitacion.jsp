<%-- 
    Document   : UpdateHabitacion
    Created on : 24-mar-2019, 22:01:35
    Author     : iUser
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="./css/bootstrap.min.css" rel="stylesheet">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="./css/bootstrap.min.css" rel="stylesheet"> 
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Modificar Cliente</title>

    </head>
    <div class="alert alert-success" role="alert">

        <h1 align="center"><font color="orange" ><font color="orange" face="Castellar"</font>Modificar habitacion</font></h1>
    </div>
    <div class="progress">
        <div class="progress-bar progress-bar-warning" role="progressbar" aria-valuenow="40" aria-valuemin="0" aria-valuemax="100" style="width: 100%">
            <span class="sr-only">100% Complete (success)</span> 
        </div>
    </div>
    <body align="center" style="background-color: skyblue"> 
        <ul class="nav nav-pills">
            <li role="presentation" class="active btn btn-warning"><a href="http://localhost:8080/ControlHotels/SerHabTab">REGRESAR</a></li>
        </ul>
        <br><br>
    <body>
        <form  action="http://localhost:8080/ControlHotels/SerUpdateHab" method="post" items="${lista}" var="has">

            <div class="form-group">

                <input name="id" type="hidden" value="${has.id}">
                <label class="control-label col-xs-3"><font color="black" face="Arial Black"</font>Numero de habitacion:</label>
                <div class="col-xs-8">
                    <input type="text" name="nombre" id="input" class="form-control"  placeholder="" pattern="[A-Za-z]{,15}"
                           title="Solo debe contener letras y un maximo de 15 caracteres" value="${has.numero}">
                </div>
            </div>
            <br><br><br>
            <div class="form-group">
                <label class="control-label col-xs-3"><font color="black" face="Arial Black"</font>Tipo de habitacion</label>
                <div class="col-xs-8">
                    <input type="text" class="form-control" name="direccion" placeholder="" value="${has.tipo}">
                </div>
            </div>
            <br><br><br>
            <div class="form-group">
                <label class="control-label col-xs-3">Estado de la habitacion:</label>
                <div class="col-xs-8">
                    <input type="text" name="telefono" class="form-control"  placeholder="" pattern="{1,15}.+"
                           title="Solo puede contener numeros, con un maximo de 8 numeros y no puede estar vacio" value="${has.estado}">
                </div>
            </div>
            <br><br><br>
            <div class="form-group">
                <label class="control-label col-xs-3">Precio de la habitacion:</label>
                <div class="col-xs-1">
                    <select name="estado" type="text" value="${has.precio}"> 
                        <option></option>
                        <option>50</option>
                        <option>100</option>
                        <option>150</option>
                        <option>200</option>
                        <option>250</option>
                        <option>300</option>
                        <option>350</option>
                        <option>400</option>
                        <option>500</option>
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
