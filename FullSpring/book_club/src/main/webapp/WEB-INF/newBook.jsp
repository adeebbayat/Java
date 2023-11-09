<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix = "form" uri = "http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Index</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
    rel="stylesheet"
    integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
    crossorigin="anonymous">
    <link rel="stylesheet" type="text/css" href="/css/style.css">
	<script type="text/javascript" src="/js/app.js"></script>
</head>
<body> 
    <div class="flex">
        <h1>Add a Book to Your Shelf!</h1>
        <a href="/books">back to the shelves</a>
    </div>
    <div class="newBook">

        <form:form action="/newbook" mode="post" modelAttribute="book">
            <input type="hidden" name="user" value="${userId}"/>
            <div>
                <form:label path="title">Title:</form:label>
                <form:input path="title"/>
                <form:errors path="title" class="text-danger"/>
            </div>
            <div>
                <form:label path="author">Author:</form:label>
                <form:input path="author"/>
                <form:errors path="author" class="text-danger"/>
            </div>
            <div>
                <form:label path="myThoughts">My thoughts:</form:label>
                <form:textarea path="myThoughts"/>
                <form:errors path="myThoughts" class="text-danger"/>
            </div>
            <div>
                <input type="submit" value="Submit"/>
            </div>
        </form:form>
    </div>
</body>
</html>