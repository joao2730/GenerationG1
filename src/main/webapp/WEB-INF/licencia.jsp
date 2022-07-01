<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Joao Aranda
  Date: 23-06-2022
  Time: 12:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Licencia</title>
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
    <%--@elvariable id="licencia" type="Licencia"--%>
    <form:form action="/licencia/guardar" method="post" modelAttribute="licencia">
        <form:label path="numero" class="form-label">Numero:</form:label>
        <form:input path="numero" type="number" class="form-control"/>
        <br>
        <form:label path="fechaVencimiento" class="form-label">Fecha de Vencimineto:</form:label>
        <form:input path="fechaVencimiento" type="date" min="2018-01-01" max="2030-01-01" class="form-control"/>
        <br>
        <form:label path="clase" class="form-label">Clase:</form:label>
        <form:input path="clase" class="form-control"/>
        <br>
        <form:label path="estado" class="form-label">Estado:</form:label>
        <form:input path="estado" type="text" class="form-control"/>
        <br>
        <!-- USUARIO OneToOne-->
        <form:select path="usuario" class="form-select">
            <form:option value="0">Seleccione un usuario</form:option>
            <c:forEach var="usuario" items="${listaUsuarios}">
                <c:if test="${usuario.licencia.id == null}">
                    <form:option value="${usuario.id}">${usuario.nombre} ${usuario.apellido} </form:option>
                </c:if>
            </c:forEach>
        </form:select>
        <br>
        <!-- input type="submit" value="Guardar Auto">
        <button type="submit" class="btn btn-primary">Guardar</button -->
        <button type="submit" class="btn btn-outline-danger">Guardar Licencia</button>
    </form:form>
    <br>
    <style>
        /* Aqui se crea el contador y se setea a 0*/
        table {
            counter-reset: contador;
        }

        /*Aqui se suma 1 para cada celda */
        counterCell:before {
            content: counter(contador);
            counter-increment: contador; /* se puede hacer contador+X para aumentar el incrementado*/
        }
    </style>
    <table class="table">
        <thead>
        <tr>
            <th scope="col">#</th>
            <th scope="col">ID</th>
            <th scope="col">Numero</th>
            <th scope="col">Fecha de Vencimiento</th>
            <th scope="col">Clase</th>
            <th scope="col">Estado</th>
            <th scope="col">Usuario</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="licencia" items="${listaLicencias}">
            <tr>
                <th scope="row">${licencia.id}</th>
                <td>${licencia.id}</td>
                <td>${licencia.numero}</td>
                <td>${licencia.fechaVencimiento}</td>
                <td>${licencia.clase}</td>
                <td>${licencia.estado}</td>
                <td>${licencia.usuario.nombre} ${licencia.usuario.apellido}</td>
                <td><a class="btn btn-warning" href="/licencia/editar/${licencia.id}" role="button">Editar</a></td>
                <td><a class="btn btn-danger" href="/licencia/eliminar/${licencia.id}" role="button">Eliminar</a></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
<script
        src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2"
        crossorigin="anonymous">
</script>
</body>
</html>
