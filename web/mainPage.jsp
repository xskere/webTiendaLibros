<%-- 
    Document   : mainPage
    Created on : 14-feb-2022, 13:08:36
    Author     : Entrar
--%>


<%@page import="Model.Catalogo"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<% 
    Catalogo.buildCatalog();
    request.setAttribute("added", false);




%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tienda de libros</title>
    </head>
    <body>
        <h1>Bienvenido a mi tienda de libros</h1>
        Aquí es para ir al carrito
        <form action="FrontController">
            <input type="submit" value="Go to cart" name="Go to cart" />
            <input type="hidden" value="goToCart" name="command" />
        </form>
        Aquí es para añadir al carrito
        <form action="FrontController">
            <input type="submit" value="1" name="book" />
            <input type="submit" value="2" name="book" />
            <input type="hidden" value="addToCart" name="command" />
        </form>
        <% if ( request.getAttribute("added").equals("true") ) { %>
            <% request.setAttribute("added", false); %>
             <div>The item has been added to your cart.</div>
         <%  }  %>
        
    </body>
</html>
