<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form action="${pageContext.request.contextPath}/user/t1" method="post">
    <input name="username" type="text"/>
    <input type="submit"/>
  </form>

  <h1>==================================================================</h1>
  <form action="${pageContext.request.contextPath}/user/t3" method="post">
    <input name="name" type="text"/>
    <input name="age" type="text"/>
    <input name="id" type="text"/>
    <input type="submit"/>
  </form>

  <form action="${pageContext.request.contextPath}/user/t4" method="post">
    <input name="ids" type="checkbox" value="1"/>
    <input name="ids" type="checkbox" value="2"/>
    <input name="ids" type="checkbox" value="3"/>
    <input type="submit"/>
  </form>
  </body>
</html>
