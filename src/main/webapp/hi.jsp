<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Huu Quyet
  Date: 8/18/2022
  Time: 9:22 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
<html>
<head>
    <title>Title</title>
</head>
<body>
<table class="table" style="box-shadow: aqua">
    <tr>
        <thead>
        <th>ten</th>
        <th>ngay sinh</th>
        <th>dia chi</th>
        <th>anh</th>
        </thead>
    </tr>
    <c:forEach var="list" items="${list}">
        <tbody>
        <tr>
            <td>${list.name}</td>
            <td>${list.dateBith}</td>
            <td>${list.address}</td>
            <td><img src="${list.url}" style=" height:100px ; width: 100px"></td>
        </tr>
        </tbody>
    </c:forEach>
</table>
</body>
</html>
