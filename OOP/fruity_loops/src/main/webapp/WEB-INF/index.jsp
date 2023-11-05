<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <title>Fruity Loops</title>
    <link rel="stylesheet" type="text/css" href="/css/style.css">
</head>
<body>
    
    <h1>Fruit Store</h1>
    <div class="whole">
        <div class="leftCol">
            <h3>Name</h3>
            <c:forEach var="oneFruit" items="${fruitsFromMyController}">
                
                <p><c:out value="${oneFruit.name}"></c:out></p>
            </c:forEach>
        </div>
        <div class="rightCol">
            <h3>Price</h3>
            <c:forEach var="oneFruit" items="${fruitsFromMyController}">
                <p><c:out value="${oneFruit.price}"></c:out></p>
            </c:forEach>
        </div>
    </div>




</body>
</html>