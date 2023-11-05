<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <title>Form Practice</title>
    <link rel="stylesheet" type="text/css" href="/css/style.css">
</head>
<body>

    <h1>Send an Omikuji!</h1>

    <form action="/submit" method="post">
        <div>
            <label>Pick and number from 5 to 25</label>
        </div>
        <div>
            <select name="number">
                <% for(int i = 5; i < 26;i++) { %>
                    <option value="<%= i %>"><%= i %></option>
                <% } %>
            </select>
        </div>

        <div>
            <label>Enter the name of any city.</label>
        </div>
        <div>
            <input name="city"/>
        </div>

        <div>
            <label>Enter the name of any real person</label>
        </div>
        <div>
            <input name="person"/>
        </div>

        <div>
            <label>Enter professional endeavor or hobby:</label>
        </div>
        <div>
            <input name="hobby"/>
        </div>

        <div>
            <label>Enter any type of living thing</label>
        </div>
        <div>
            <input name="living"/>
        </div>

        <div>
            <label>Say something nice to someone:</label>
        </div>
        <div>
            <textarea name="somethingNice" rows="4" cols="20"></textarea>
        </div>

        <p>Send and show a friend</p>
        <input type="submit"/>
        
    </form>




</body>
</html>