<%-- 
    Document   : login
    Created on : Jan 5, 2025, 10:41:34 PM
    Author     : ACER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Login Form</h1>
        <form action="Login" method="post">
            username: <input type="text" name="username"/><br>
            password: <input type="text" name="password"/><br>
            <input type ="submit" value ="login"/>
        </form>
    </body>
</html>
