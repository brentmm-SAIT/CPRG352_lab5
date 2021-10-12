<%-- 
    Document   : login
    Created on : Oct 9, 2021, 2:19:10 PM
    Author     : 771684
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body>
        <h1>Login</h1>
        <form method="POST">
            <label>Username:</label>
            <input type="text" name="username" value="${username}">
            <br>
            <label>Password:</label>
            <input type="text" name="password" value="${password}">
            <br>
            <input type="submit" value="Login">               
        </form>
        <h2>${message}</h2>
    
    </body>
</html>
