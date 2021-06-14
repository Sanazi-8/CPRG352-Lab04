<%-- 
    Document   : viewnote
    Created on : Jun 8, 2021, 7:05:50 PM
    Author     : 850354
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> View Note </title>
    </head>
    <body>
        <h1>Simple Note Keeper</h1>
        <h2> View Note </h2>
        
        <form method="GET" >
            
        <label>Title: </label>
        <p name="user_title">${note.userTitle}</p>
        
        <label>Content:</label>
        <br>
        
        <p name="user_content">${note.userContent}</p>
        <br>
        
        <a href="note?edit"> Edit </a>
        
        </form>
        
    </body>
</html>
