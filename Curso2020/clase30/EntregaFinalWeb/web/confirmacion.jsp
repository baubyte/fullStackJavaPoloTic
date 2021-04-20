<%-- 
    Document   : confirmacion
    Created on : 14/12/2020, 19:30:15
    Author     : Pared Baez Martin Jose<paredbaez.martin@gmail.com>
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Confirmacion</title>
    </head>
    <body>
        <h1>Confirmacion  Terminada</h1>
        <p>Nombre: <%=session.getAttribute("nombre") %> </p>
        <p>Apellido: <%=session.getAttribute("apellido") %> </p>
        <p>Edad: <%=session.getAttribute("edad") %> </p>
    </body>
</html>
