<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Joao Aranda
  Date: 16-06-2022
  Time: 12:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Mostrar Auto</title>
    <link
          href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
          rel="stylesheet"
          integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
          crossorigin="anonymous">
</head>
<body>
<div class="container">

   <table class="table">
   <thead>
  <tr>
    <th scope="col">#</th>
    <th scope="col">Marca</th>
    <th scope="col">Modelo</th>
    <th scope="col">Color</th>
    <th scope="col">Patente</th>
  </tr>
  </thead>
  <tbody>
  <c:forEach var="auto" items="${autosCapturados}">
    <tr>
      <th scope="row">${auto.id}</th>
      <td>${auto.marca}</td>
      <td>${auto.modelo}</td>
      <td>${auto.color}</td>
      <td>${auto.patente}</td>
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
