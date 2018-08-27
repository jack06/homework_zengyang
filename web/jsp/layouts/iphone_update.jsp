<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="com.nf.zy.dao.IPhone_All" %>
<%@ page import="com.nf.zy.entity.IPhone_Attribute" %><%--
  Created by IntelliJ IDEA.
  User: AAA
  Date: 2018/8/25
  Time: 18:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    int id = Integer.parseInt(request.getParameter("id"));
    IPhone_All iPhone = new IPhone_All();
    IPhone_Attribute iPhoneById = iPhone.getIPhoneById(id);
    pageContext.setAttribute("iphone",iPhoneById);
%>
<html>
<head>
    <title>Title</title>
    <script src="<c:url value="/assets/js/bootstrap.js"/>"></script>
    <link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
<form action="/update" method="post">
    <table>
        <tr><input name="id" class="table-active" placeholder="id"></tr><br/>
        <tr><input class="table-primary" name="name" placeholder="name"></tr><br/>
        <tr><input name="attribute" class="table-secondary" placeholder="attribute"></tr><br/>
        <tr><input name="date" class="table-success" placeholder="date"></tr><br/>
        <tr><input name="price"  class="table-danger" placeholder="price"></tr><br/>
        <tr><input class="table-light" type="submit" value="提交"></tr>
    </table>
</form>
</body>
</html>
