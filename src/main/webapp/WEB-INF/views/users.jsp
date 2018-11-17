<%--
  Created by IntelliJ IDEA.
  User: Marcin
  Date: 17.11.2018
  Time: 10:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link href="${pageContext.request.contextPath}/webjars/bootstrap/4.0.0-2/css/bootstrap.css" type="text/css"
          rel="stylesheet">
</head>
<body>
<div class="container mt-4">
    <form action="/" method="post">
        <table class="table table-hover">
            <thead>
            <tr>
                <th>#</th>
                <th>First Name</th>
                <th>Last Name</th>
                <th>Photo</th>
                <th>Age</th>
                <th>Date of Birth</th>
                <th></th>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="user" items="${users}" varStatus="loop">
                <tr>
                    <th scope="row">${loop.index + 1}</th>
                    <td>${user.firstName}</td>
                    <td>${user.lastName}</td>
                    <td><img src="${user.avatar}"></td>
                </tr>
            </c:forEach>
            </tbody>
            <div class="form-group">
                <label>Users Per Page</label>
                <select class="form-control" name="perPage">
                    <option selected value="5">5</option>
                    <option value="10">10</option>
                    <option value="15">15</option>
                </select>
            </div>
            <div class="form-group">
                <label>Page</label>
                <select class="form-control" name="page">
                    <option selected value="1">1</option>
                    <option value="2">2</option>
                    <option value="3">3</option>
                </select>
            </div>
            <button class="btn btn-dark" type="submit">Show</button>
        </table>
    </form>
</div>
</body>
</html>
