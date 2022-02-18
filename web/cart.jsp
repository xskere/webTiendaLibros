<%-- 
    Document   : cart
    Created on : 14-feb-2022, 16:42:54
    Author     : alero
--%>

<%@page import="Model.Carrito"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Model.Producto"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>This is your cart</title>
    </head>
    <body>
        <p>Pulse aquí para proceder a comprar los libros de su carrito.</p>
        <form action="FrontController">
            <input type="submit" value="Go To Checkout" name="Go To Checkout" />
            <input type="hidden" value="GoToCheckout" name="command" />
        </form>
        <p>Pulse aquí para volver al catalogo.</p>
        <form action="FrontController">
            <input type="submit" value="Go To Main Page" name="Go To Main Page" />
            <input type="hidden" value="GoToMainPage" name="command" />
        </form>
        <p>Este es el contenido de su carrito:</p>
        <%
            for (Producto book : (ArrayList<Producto>) ((Carrito) request.getSession(true).getAttribute("cart")).getCarrito()) { %>
                <form action="FrontController">
                <%= new String("<img src=\""+book.getThumbnail()+"\"/>") %>
                <%= new String("<figcaption>Titulo: "+book+" Precio: " + (int) book.getPrice() +" euros</figcaption>") %>

                <%= new String("<input type=\"hidden\" value=\""+book.getIsbn()+"\" name=\"book\" />")%>
                <input type="submit" value="Delete From Cart" name="Delete From Cart" />
                <input type="hidden" value="DeleteFromCart" name="command" />
                <p>--------------------------------------------------------</p>
                </form>
        <%}%>      
    </body>
</html>
