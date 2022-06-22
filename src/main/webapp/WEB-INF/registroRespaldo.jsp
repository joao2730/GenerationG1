<%--
  Created by IntelliJ IDEA.
  User: Joao Aranda
  Date: 14-06-2022
  Time: 12:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
    <title>Registro 1</title>
</head>
<body>
<div>
    <!-- pasar informacion desde la vista a una url(action)-->
    <!--method "get" es por default, los parametros se ven en la ruta -->
    <!--method "post" los parametros no se ven, van ocultos -->
    <form action="/registro/usuario" method="Post">
        <label for="nombre"> Nombre: </label>
        <input type="text" id="nombre" name="gato">
        <br><!-- salto de linea -->
        <label for="apellido"> Apellido: </label>
        <input type="text" id="apellido" name="apellido">
        <br><!-- salto de linea -->
        <label for="edad"> Edad: </label>
        <input type="number" id="edad" name="edad">
        <br><!-- salto de linea -->
        <!-- submit para el envio de informacion-->
        <input type="submit" value="Registrar">
        <input type="button" value="Enviar">
    </form>
</div>

</body>
</html>
