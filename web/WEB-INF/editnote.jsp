<%-- 
    Document   : editnote
    Created on : Jun 8, 2021, 7:06:56 PM
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
        
        <form method="POST" >
            
        <label>Title: </label>
        <input type="text" name="user_title" value="${Note.userTitle}"></input>
        
        <label>Content:</label>
        <br>
        
        <textarea name="user_content" value="${Note.userContent}"></textarea>
        <br>
        
        <input type="submit" value="Save">
        
        </form>
        
    </body>
</html>
