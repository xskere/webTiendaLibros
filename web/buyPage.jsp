<%-- 
    Document   : buyPage
    Created on : 16-feb-2022, 11:33:04
    Author     : alero
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Chekout</title>
    </head>
    <body>
        You have bought the books in your cart! Thank you for shopping!
        <br>
        <form action="FrontController">
            <input type="submit" value="Go To Main Page" name="Go To Main Page" />
            <input type="hidden" value="goToMainPage" name="command" />
        </form>
    </body>
</html>
