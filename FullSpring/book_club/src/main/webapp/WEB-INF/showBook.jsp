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
    <div class="top">
        <h1><c:out value="${book.title}"/></h1>
        <a href="/books">back to the shelves</a>
    </div>
    <h5><span style="color:red;"><c:out value="${user.name}"/></span> read <span style="color:purple;"><c:out value="${book.title}"/></span> by <span style="color:green;
    "><c:out value="${book.author}"/></span>.</h5>
    <h5>Here are <c:out value="${user.name}"/>'s thoughts:</h5>
    <hr>
    <p><c:out value="${book.myThoughts}"/></p>
    <hr>
    <c:if test="${currentUser.id== book.user.id}">
        <div class="buttons">
            <a class = "btn btn-primary" href="/books/${book.id}/edit">
                Edit
            </a>
            <form action="/delete/${book.id}" method="post">
                <input type="hidden" name="_method" value="DELETE">
                <button class="btn btn-primary" type="submit">Delete</button>
            </form>
        </div>
    </c:if>

</body>
</html>