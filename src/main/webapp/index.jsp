<%--<%@page contentType="text/html; charset=UTF-8" language="java" %>
<html>
<body>
<h2>Hello World!!!</h2>
<form action="${pageContext.request.contextPath}/teacher">
    姓名：<input type="text" name="name">
    <button type="submit">提交</button>
</form>
</body>
</html>--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<h2>Hello World!-----itlike</h2>
<form action="${pageContext.request.contextPath}/teacher">
    姓名: <input type="text" name="name"> <br>
    <input type="submit" value="提交 ">
</form>
</body>
</html>
