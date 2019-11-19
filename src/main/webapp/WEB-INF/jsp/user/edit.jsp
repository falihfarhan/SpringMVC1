<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>
<html>
<head>
    <title>Edit User Page</title>
    <link type="text/css" href="<c:url value='/assets/css/bootstrap.min.css' />" rel="stylesheet"/>
</head>
<body>
<h1>Edit User</h1>
<form:form method="post" action="/editSave" commandName="user" class="form-horizontal">
    <form:hidden path="id"/>
    <div class="form-group">
        <label class="control-label col-md-3">Name</label>
        <div class="col-md-7">
            <form:input type="text" class="form-control" path="name"/>
        </div>
    </div>
    <div class="form-group">
        <label class="control-label col-md-3">Password</label>
        <div class="col-md-7">
            <form:input type="text" class="form-control" path="password"/>
        </div>
    </div>
    <div class="form-group">
        <label class="control-label col-md-3">Age</label>
        <div class="col-md-7">
            <form:input type="text" class="form-control" path="age"/>
        </div>
    </div>
    <input type="submit" class="button" value="Edit"/>
</form:form>

</body>
</html>