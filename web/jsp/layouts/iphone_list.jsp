<%@ page import="java.util.List" %>
<%@ page import="com.nf.zy.entity.IPhone_Attribute" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="sitemesh" uri="http://www.opensymphony.com/sitemesh/decorator" %>
<%@ taglib prefix="decoder" uri="http://www.opensymphony.com/sitemesh/decorator" %>
<html>
<head>
    <title><sitemesh:title/></title>
    <script src="<c:url value="/assets/js/jquery1.12.4.js"/>"></script>
    <script src="<c:url value="/assets/js/bootstrap.js"/>"></script>
    <link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <style>
        table{border: 1px solid black;}
        td{height: 50px;width: 80px}
    </style>
</head>
<body>
<table>
<h1 style="left: 10px">南方商城</h1>
<th class="table-active">手机编号</th>
<th class="table-primary">手机类型</th>
<th class="table-secondary">手机属性</th>
<th class="table-success">保修日期</td>
<th class="table-danger">价格</th>
<th class="table-warning" colspan="3" style="text-align: center">操作</th>

    <% List<IPhone_Attribute> iphone= (List<IPhone_Attribute>)request.getAttribute("iphones");
    for(IPhone_Attribute iphones:iphone){
    %>
    <tr>
        <td class="table-active"><%= iphones.getId()%></td>
        <td class="table-primary"><%= iphones.getName()%></td>
        <td class="table-secondary"><%= iphones.getAttribute()%></td>
        <td class="table-success"><%=iphones.getDate()%></td>
        <td class="table-danger"><%=iphones.getPrice()%></td>
        <td class="table-warning"><a href="/jsp/layouts/iphone_add.jsp?id=<%=iphones.getId()%>">新增</a></td>
        <td class="table-info"><a href="/jsp/layouts/iphone_update.jsp?id=<%=iphones.getId()%>">修改</a></td>
        <td class="table-light"><a href=/delete?id=<%=iphones.getId()%>">删除</a></td>
    </tr>

<%
    }
%>
</table>
<h1 style="align-self: right; color: red" >活动解释权由承办商所有</h1>

</body>
</html>