<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <title>Show</title>
    <link rel="stylesheet" type="text/css" href="/css/style.css">
</head>
<body>
    <h1>Here's Your Omikuji!</h1>
    <div class="col">
        <p>In <c:out value="${number}"/> years, you will live in <c:out value="${city}"/> with <c:out value="${person}"/> as your roomate, <c:out value="${hobby}"/> for a living. The next time you see a <c:out value="${living}"/>, you will have good luck. Also, <c:out value="${somethingNice}"/></p>
    </div>
    <a href="/omikuji">Go Back</a>


</body>
</html>