<%--
  Created by IntelliJ IDEA.
  User: Joao Aranda
  Date: 13-06-2022
  Time: 15:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login</title>
</head>
<body>
<div>
    <c:if test="${msgError != null}">
        <c:out value="${msgError}"></c:out>
    </c:if>
    <%--@elvariable id="usuario" type="Usuario"--%>
    <form:label action="/registro/usuario/ingreso" method="post" modelAttribute="usuario" path="">
        <form:label path="email">Email:</form:label>
        <form:input type="email" path="email"/>
        <br>
        <form:label path="password">Password:</form:label>
        <form:input type="password" path="password"/>

        <input type="submit" value="Ingresar">
    </form:label>
</div>
</body>
</html>
