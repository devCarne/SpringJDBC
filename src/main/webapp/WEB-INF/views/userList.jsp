<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:forEach var="m" items="${list}">
    id : ${m.id} / name : ${m.name}<br>
</c:forEach>
</body>
</html>
