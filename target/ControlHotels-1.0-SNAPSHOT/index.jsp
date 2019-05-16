<%-- 
    Document   : index
    Created on : 19-mar-2019, 13:29:20
    Author     : iUser
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <link href="css/style.css" rel='stylesheet' type='text/css' />
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>

        <link href='http://fonts.googleapis.com/css?family=Oxygen:400,300,700|Open+Sans:400,300,600,700' rel='stylesheet' type='text/css'>

        <script>
                function myFunction()
                {
                        alert("Bienvenido");
                }
        </script>
    </head>

    <body>
        <div class="main">
            <div class="user">
                <img src="images/user.png" alt="">
            </div>
            <div class="login">
                <div class="inset">
                    <!-----start-main---->
                    <form action="http://localhost:8080/ControlHotels/SerLogin" method="post">
                        <div>
                            <span><label>Usuario</label></span>
                            <span><input type="text" class="textbox" id="active" name="user"></span>
                        </div>
                        <div>
                            <span><label>Contrasena</label></span>
                            <span><input type="password" class="password" name="pass"></span>
                        </div>
                        <div class="sign">
                            <div class="submit">
                                <input type="submit" onclick="myFunction()" value="Entrar" >
                            </div>
                            <span class="forget-pass">
                                <a href="#">No recuerda su contrasena?</a>
                            </span>
                            <div class="clear"> </div>
                        </div>
                    </form>
                </div>
            </div>
            <!-----//end-main---->
        </div>
        <!-----start-copyright---->
        <div class="copy-right">
            <p>Copyrigth <a href="#">SoftDragon</a></p> 
        </div>
        <!-----//end-copyright---->

    </body>
</html>