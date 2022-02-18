<%-- 
    Document   : unknown
    Created on : 14-feb-2022, 16:19:04
    Author     : alero
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Error 404</title>
    </head>
    <body>
        <h1>Error 404</h1>
        <p>Ha ocurrido un error. Por favor, pulse aquí para volver a la página 
            principal</p>        
        <form action="FrontController">
            <input type="submit" value="Go To Main Page" name="Go To Main Page" />
            <input type="hidden" value="GoToMainPage" name="command" />
        </form>
    </body>
</html>
