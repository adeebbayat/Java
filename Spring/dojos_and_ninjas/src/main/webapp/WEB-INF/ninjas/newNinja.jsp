<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix = "form" uri = "http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Dojo and Ninjas</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
    rel="stylesheet"
    integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
    crossorigin="anonymous">
    <link rel="stylesheet" type="text/css" href="/css/style.css">
	<script type="text/javascript" src="/js/app.js"></script>
</head>
<body>
    <h1>New Ninja</h1>
    <form:form action = "/ninjas" mode = "post" modelAttribute="ninja">
        <div>
            <form:label path="dojo">Dojo</form:label>
            <form:select path="dojo">
            <c:forEach var="dojo" items="${dojos}">
                <form:option value="${dojo}" path="ninja.dojo">${dojo.name}</form:option>
            </c:forEach>                
            </form:select>            
        </div>
        <div>
            <form:label path="firstName">First Name:</form:label>
            <form:input path="firstName"/>
            <form:errors path="firstName" class="text-danger"/>
        </div>
        <div>
            <form:label path="lastName">Last Name:</form:label>
            <form:input path="lastName"/>
            <form:errors path="lastName" class="text-danger"/>
        </div>
        <div>
            <form:label path="age">Age:</form:label>
            <form:input path="age"/>
            <form:errors path="age" class="text-danger"/>
        </div>
        <div class="submit">
            <input type="submit" value="Add Ninja"/>
        </div>
    </form:form>
</body>
</html>