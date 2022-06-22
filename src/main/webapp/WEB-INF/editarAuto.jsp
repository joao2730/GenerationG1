<%--
  Created by IntelliJ IDEA.
  User: Joao Aranda
  Date: 16-06-2022
  Time: 11:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
    <title>Editar auto</title>
    <link
            href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
            rel="stylesheet"
            integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
            crossorigin="anonymous">
</head>
<body>
     <div>
         <c:if test="${msgError != null}">
             <c:out value="${msgError}"></c:out>
         </c:if>
         <%--@elvariable id="auto" type="Auto"--%>
         <form:form action="/auto/actualizar/${auto.id}" method="post" modelAttribute="auto">
             <form:label path="marca" class="form-control">Marca:</form:label>
             <form:input path="marca"/>
             <br>
             <form:label path="modelo" class="form-control" >Modelo:</form:label>
             <form:input path="modelo"/>
             <br>
             <form:label path="color" class="form-control">Color:</form:label>
             <form:input path="color" class="form-label"/>
             <br>
             <form:label path="patente" class="form-control">Patente:</form:label>
             <form:input path="patente"/>
             <br>
             <!-- input type="submit" value="Guardar Auto">
             <button type="submit" class="btn btn-primary">Guardar</button -->
             <button type="submit" class="btn btn-outline-danger">Editar Auto</button>
         </form:form>
     </div>
</body>
</html>