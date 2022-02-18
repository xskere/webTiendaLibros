<%-- 
    Document   : buyPage
    Created on : 16-feb-2022, 11:33:04
    Author     : alero
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="Model.Producto"%>
<%@page import="Model.Carrito"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Chekout</title>
    </head>
    <body>
        <p>Acaba de realizar usted la compra de los libros en su carrito. Muchas gracias
            por comprar con nosotros!</p>
        <p>Le esperamos de vuelta.</p>
        <p>Pulse aquí para volver a la página principal:</p>
        <form action="FrontController">
            <input type="submit" value="Go To Main Page" name="Go To Main Page" />
            <input type="hidden" value="GoToMainPage" name="command" />
        </form>
    </body>
</html>
