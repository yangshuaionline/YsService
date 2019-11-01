<%--
  Created by IntelliJ IDEA.
  User: mac
  Date: 2019-10-09
  Time: 18:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>表单处理</title>
</head>
<body>
<h1>Get请求</h1>
<li>
    <p><b>站点名称：</b></p>
    <%=request.getParameter("name")%>
</li>
<%
    out.print("");
%>
</body>
</html>
