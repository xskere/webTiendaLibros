<%-- 
    Document   : mainPage
    Created on : 14-feb-2022, 13:08:36
    Author     : Entrar
--%>


<%@page import="java.util.ArrayList"%>
<%@page import="Model.Producto"%>
<%@page import="Model.Catalogo"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<% 
    Catalogo.buildCatalog();
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
            <input type="hidden" value="GoToCart" name="command" />
        </form>
        Aquí es para añadir al carrito
        <form action="FrontController">
            <select name="book">
            <%
            for (Producto book : (ArrayList<Producto>) Catalogo.getCatalogo()) { %>
            <%= new String("<option value=" + book.getIsbn() + ">" + book + "</option>") %>
            <%  } %>
        </select>
            <input type="submit" value="Add To Cart" name="Add To Cart" />
            <input type="hidden" value="AddToCart" name="command" />
        </form>
    </body>
</html>
