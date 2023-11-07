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
    <div class="whole">
        <div class="leftCol">
        <h1>Welcome!</h1>
        <h3>Join our growing community.</h3>
        <h4>Register:</h4>
            <form:form action="/register" mode="post" modelAttribute="newUser">
                <div>
                    <form:label path="userName">User Name:</form:label>
                    <form:input path="userName"/>
                    <form:errors path="userName" class="text-danger"/>
                </div>
                <div>
                    <form:label path="email">Email:</form:label>
                    <form:input path="email"/>
                    <form:errors path="email" class="text-danger"/>
                </div>
                <div>
                    <form:label path="password">Password:</form:label>
                    <form:input path="password"/>
                    <form:errors path="password" class="text-danger"/>
                </div>
                <div>
                    <form:label path="confirm">Confirm PW:</form:label>
                    <form:input path="confirm"/>
                    <form:errors path="confirm" class="text-danger"/>
                </div>
                <div>
                    <input type="submit" value="Submit"/>
                </div>
            </form:form>
        </div>
    
        <div class="rightCol">
            <h4>Login:</h4>
            <form:form action="/login" mode="post" modelAttribute="newLogin">
                <div>
                    <form:label path="email">Email:</form:label>
                    <form:input path="email"/>
                    <form:errors path="email" class="text-danger"/>
                </div>
                <div>
                    <form:label path="password">Password:</form:label>
                    <form:input path="password"/>
                    <form:errors path="password" class="text-danger"/>
                </div>
                <div>
                    <input type="submit" value="Submit"/>
                </div>
            </form:form>
        </div>
    </div>
    
</body>
</html>