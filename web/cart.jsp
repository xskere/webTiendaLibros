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
        
        <div>This is your cart:</div>
        <form action="FrontController">
            <select name="book">
                <%
                for (Producto book : (ArrayList<Producto>) ((Carrito) request.getSession(true).getAttribute("cart")).getCarrito()) { %>
                <%= new String("<option value=" + book.getIsbn() + ">" + book + "</option>") %>
                <%  } %>
                <input type="submit" value="Delete From Cart" name="Delete From Cart" />
                <input type="hidden" value="deleteFromCart" name="command" />
            </select>
        </form>        
        <br>
        <form action="FrontController">
            <input type="submit" value="Go To Checkout" name="Go To Checkout" />
            <input type="hidden" value="buy" name="command" />
        </form>
        <br>
        <form action="FrontController">
            <input type="submit" value="Go To Main Page" name="Go To Main Page" />
            <input type="hidden" value="goToMainPage" name="command" />
        </form>
        
    </body>
</html>
