<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>Write Form page</h3>
<hr>
<table width="500" cellpadding="0" cellspacing="0" border="1">
    <form action="bbsWrite" method="post">
        <tr>
            <td>작성자</td>
            <td><input type="text" name="writer" size="100"></td>
        </tr>
        <tr>
            <td>제목</td>
            <td><input type="text" name="title" size="100"></td>
        </tr>
        <tr>
            <td>내용</td>
            <td><input type="text" name="content" size="100"></td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="입력">
                <a href="bbsList">목록보기</a>
            </td>
        </tr>

    </form>
</table>
</body>
</html>
