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
        
        <!--form to get user login info-->
        <form method="POST">
            <label>Username:</label>
            <!--input for username-->
            <input type="text" name="username" value="${username}">
            <br>
            <label>Password:</label>
            <!--input for password-->
            <input type="text" name="password" value="${password}">
            <br>
            <!--submit button to login-->
            <input type="submit" value="Login">               
        </form>
            
        <!--output box for info/error messages-->
        <h2>${message}</h2>
    
    </body>
</html>
