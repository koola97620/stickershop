<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>list</title>
</head>
<body>
<h1>list</h1>
<br>

<c:forEach items="${memberList}" var="member">
    <p>${member.id}</p>
</c:forEach>

<H1> Pageable </H1>
<br>
<c:forEach items="${members.content}" var="member">
    <p>${member.id}</p>
</c:forEach>


<br>

</body>
</html>