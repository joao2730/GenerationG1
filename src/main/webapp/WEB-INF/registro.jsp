<%--
  Created by IntelliJ IDEA.
  User: Joao Aranda
  Date: 13-06-2022
  Time: 15:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
    <meta charset="UTF-8">
    <title>Registro</title>
</head>
<body>
      <div>
          <c:if test="${msgError != null}">
              <c:out value="${msgError}"></c:out>
          </c:if>
          <%--@elvariable id="usuario" type="Usuario"--%>
          <form:label action="/registro/usuario" method="post" modelAttribute="usuario" path="">
          <form:label path="nombre">Nombre:</form:label>
          <form:input path="nombre"/>
          <br>
          <form:label path="apellido">Apellido:</form:label>
          <form:input path="apellido"/>
          <br>
          <form:label path="edad">Edad:</form:label>
          <form:input type="number" path="edad"/>
          <br>
          <form:label path="password">Password:</form:label>
          <form:input type="password" path="password"/>
          <br>
          <input type="submit" value="Registrar">
          </form:label>
      </div>
</body>
</html>
