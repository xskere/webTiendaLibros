<%-- 
    Document   : mainPage
    Created on : 14-feb-2022, 13:08:36
    Author     : Entrar
--%>


<%@page import="javax.json.JsonArray"%>
<%@page import="javax.json.JsonStructure"%>
<%@page import="javax.json.JsonReader"%>
<%@page import="javax.json.Json"%>
<%@page import="java.io.FileReader"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Model.Producto"%>
<%@page import="Model.Catalogo"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%! 
    Catalogo cat = new Catalogo("C:\\Users\\alero\\Documents\\NetBeansProjects\\TiendaLibros\\books.json");
%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tienda de libros</title>
    </head>
    <body>
        <h1>Bienvenido a mi tienda de libros</h1>
        <p>Pulse aquí para ir a su carrito.</p>
        <form action="FrontController">
            <input type="submit" value="Go to cart" name="Go to cart" />
            <input type="hidden" value="GoToCart" name="command" />
        </form>
        <p>Añada al carrito los libros que desee comprar.</p>
        
        <%
        for (Producto book : (ArrayList<Producto>) Catalogo.getCatalogo()) { %>
            <form action="FrontController">
            <%= new String("<img src=\""+book.getThumbnail()+"\"/>") %>
            <%= new String("<figcaption>Titulo: "+book+" Precio: " + (int) book.getPrice() +" euros</figcaption>") %>
            
            <%= new String("<input type=\"hidden\" value=\""+book.getIsbn()+"\" name=\"book\" />")%>
            <input type="submit" value="Add to cart" />
            <input type="hidden" value="AddToCart" name="command" />
            </form>
            <p>--------------------------------------------------------</p>
        <%  } %>
    </body>
</html>
