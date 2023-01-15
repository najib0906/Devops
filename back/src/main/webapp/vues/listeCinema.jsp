<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
<%@include file="navbar.html"%>
<br><br>

<table class="table table-hover">
<tr>
<th>Id</th><th>Nom</th><th>Action</th>
</tr>
<c:forEach items="${cinemas}" var="p">
<tr>
<td>${p.id}</td>
<td>${p.nom}</td>
<td><a href="/cinema/supprimercinema/${p.id}"
 class="btn btn-danger">supprimer</a>
 <a href="/cinema/modifiercinema/${p.id}" class="btn btn-warning">
 modifier</a></td>
</tr>
</c:forEach>
</table>
</body>
</html>