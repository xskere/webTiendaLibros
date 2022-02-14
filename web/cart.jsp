<%-- 
    Document   : cart
    Created on : 14-feb-2022, 16:42:54
    Author     : alero
--%>

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
        <%
            for (Producto book : (ArrayList<Producto>) request.getSession(true).getAttribute("cart")) { %>
                    <%= book  %>
                    <br>
        <%  } %>
        
        
    </body>
</html>
