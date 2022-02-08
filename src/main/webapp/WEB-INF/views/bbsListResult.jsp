<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>List Page</h3>
<hr>
<table width="500" cellpadding="0" cellspacing="0" border="1">
    <tr>
        <td>번호</td><td>작성자</td><td>제목</td><td>내용</td>
    </tr>
    <c:forEach var="l" items="${bbsList}">
        <tr>
            <td>${l.id}</td><td>${l.writer}</td><td>${l.title}</td><td>${l.content}</td>
        </tr>
    </c:forEach>
</table>
<hr>
<p><a href="bbsWriteForm">글쓰기</a></p>
</body>
</html>
