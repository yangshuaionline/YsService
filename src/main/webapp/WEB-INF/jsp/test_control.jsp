<%--
  Created by IntelliJ IDEA.
  User: mac
  Date: 2019-10-09
  Time: 17:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>控制流语句</title>
</head>
<body>
<%!
    int day = 3;
%>
<h1>if语句、for循环、while循环</h1>
<% if(day == 6||day == 7){%>
    <p>今天是周末</p>
<%}else{%>
    <p>今天不是周末</p>
<%}%>
<h1>switch语句</h1>
<%switch (day){
    case 6:
    case 7:
        out.print("switch今天是周末");
        break;
    default:
        out.print("switch今天不是周末");
        break;
}%>


</body>
</html>
