<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>
<html>
<head>
    <title>Detail User Page</title>
    <link type="text/css" href="<c:url value='/assets/css/bootstrap.min.css' />" rel="stylesheet"/>
</head>
<body>

<div class="container text-center">
<h1>Users Detail</h1>
    <hr>
    <div class="table-responsive">
    <table class="table table-bordered">
        <tr>
            <th width="80">User ID</th>
            <th width="120">User Name</th>
            <th width="120">User Password</th>
            <th width="120">User Age</th>
        </tr>
            <tr>
                <td>${user.id}</td>
                <td>${user.name}</td>
                <td>${user.password}</td>
                <td>${user.age}</td>
            </tr>
    </table>
    </div>
</div>
</body>
</html>