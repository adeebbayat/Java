<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <title>Counter</title>
    <link rel="stylesheet" type="text/css" href="/css/style.css">
</head>
<body>
    
    <p>
        You have visited this 
        <c:out value="${count}"></c:out>
        times
    </p>




</body>
</html>