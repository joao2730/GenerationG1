<%--
  Created by IntelliJ IDEA.
  User: Joao Aranda
  Date: 16-06-2022
  Time: 12:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Mostrar Auto</title>
    <link
            href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
            rel="stylesheet"
            integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
            crossorigin="anonymous">
</head>
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
<body>
<div class="container">
    <!-- formulario de busqueda -->
    <form action="/auto/buscar" method="post">
        <%--@declare id="marca"--%>
        <label for="marca">Marca:</label>
        <input type="text" id="marca" name="marca"><!-- entrada para que el boton filtre-->
        <input type="submit" class="btn btn-primary"><!-- Boton de enviar-->
    </form>
    <br> <!-- Salto de linea -->
    <!-- Paginacion -->
    <c:forEach var="numeroPagina" begin="1" end="${totalPaginas}">
       <a href="/auto/pagina/${numeroPagina}">${numeroPagina}</a>
    </c:forEach>
    <table class="table">
        <thead>
        <tr>
            <th scope="col">#</th>
            <th scope="col">ID</th>
            <th scope="col">Marca</th>
            <th scope="col">Modelo</th>
            <th scope="col">Color</th>
            <th scope="col">Patente</th>
            <th scope="col">Acciones</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="auto" items="${autosCapturados.content}">
            <tr>
                <th scope="row">${auto.id}</th>
                <td>${auto.id}</td>
                <td>${auto.marca}</td>
                <td>${auto.modelo}</td>
                <td>${auto.color}</td>
                <td>${auto.patente}</td>
                <td><a class="btn btn-warning" href="/auto/editar/${auto.id}" role="button">Editar</a></td>
                <td><a class="btn btn-danger" href="eliminar/${auto.id}" role="button">Eliminar</a></td>
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
