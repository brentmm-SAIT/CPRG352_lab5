<%-- 
    Document   : home
    Created on : Oct 9, 2021, 2:19:19 PM
    Author     : 771684
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home Page</title> 
    </head>
    <body>
        <h1>Home Page</h1>
        
        <!--displays hello + user's name-->
        <h2>Hello ${username}.</h2>
        
        <!--link to log out user and destroy session-->
         <a href="login?logout">Log out</a>   
         
        
    </body>
</html>
