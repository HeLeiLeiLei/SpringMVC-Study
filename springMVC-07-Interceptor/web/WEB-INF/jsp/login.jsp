<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/user/Login" method="post">
    用户名:<input type="text" name="userName" />
    <button type="submit">登录</button>
</form>
</body>
</html>
