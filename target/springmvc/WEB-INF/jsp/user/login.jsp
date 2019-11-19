<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: falih farhan
  Date: 15/11/2019
  Time: 10.31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">--%>
<%--<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>--%>
<%--<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>--%>

<html>

<link type="text/css" href="<c:url value='/assets/css/login.css' />" rel="stylesheet"/>

<div class="wrapper fadeInDown">
    <div id="formContent">
        <!-- Tabs Titles -->

        <!-- Icon -->
        <div class="fadeIn first">
            <img src="../../../assets/icon/icon%20user.png" style="margin: 20px">
        </div>

        <!-- Login Form -->
        <form:form method="post" action="/login" commandName="user" class="form-horizontal">
            <form:input type="text" id="login" class="fadeIn second" name="login" placeholder="username" path="name"/>
            <form:input type="text" id="password" class="fadeIn third" name="login" placeholder="password"
                        path="password"/>
            <input type="submit" class="fadeIn fourth" value="Log In">
        </form:form>
<%--        <div id="formFooter">--%>
        <!-- Remind Passowrd -->
        <%--        <div id="formFooter">--%>
        <%--            <a class="underlineHover" href="#">Forgot Password?</a>--%>
        <%--        </div>--%>
<%--        </div>--%>
    </div>
</div>

</html>



