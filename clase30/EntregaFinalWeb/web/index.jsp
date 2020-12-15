<%-- 
    Document   : index
    Created on : 14/12/2020, 19:06:36
    Author     : Pared Baez Martin Jose<paredbaez.martin@gmail.com>
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP</title>
    </head>
    <body>
        <h1>Hola Mundo</h1>
        <form name="confrimar" action="ConfirmacionServlet" method="post">
            Nombre: <input type="text" name="nombre"/>
            <br>
            <br>
            Apellido: <input type="text" name="apellido"/>
            <br>
             <br>
            Edad: <input type="text" name="edad"/>
             <br>
              <br>
            <input type="submit" value="Confirmar"/>
        </form>
    </body>
</html>
