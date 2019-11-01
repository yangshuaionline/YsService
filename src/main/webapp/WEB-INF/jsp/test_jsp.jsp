<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>jsp生命周期</title>
</head>
<body>
<h1 style="color: red">Hello World</h1>
<%--该部分注释在网页中不会被显示--%>
<%!
    //初始化次数
    private int initVar = 0;
    //响应次数
    private int serviceVar = 0;
    //销毁次数
    private int destroyVar = 0;
%>
<%!
    public void jspInit(){
        initVar ++;
        System.out.print("初始化了"+initVar+"次");
    }
    public void jspDestroy(){
        destroyVar ++;
        System.out.print("被销毁了"+destroyVar+"次");
    }
%>
<%
    //获取不到ip地址，哈哈
    out.println("你的 IP 地址 " + request.getRemoteAddr());
    serviceVar++;
    out.print("响应了"+serviceVar+"次");
    String content1 = "初始化次数："+initVar;
    String content2 = "响应次数："+serviceVar;
    String content3 = "销毁次数："+destroyVar;

%>
<h1>测试</h1>
<p><%=content1%></p>
<p><%=content2%></p>
<p><%=content3%></p>
</body>
</html>