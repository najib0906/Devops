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
<br><br>



<%@include file="navbar.html"%>
<br><br>
<br><br>
<form action="/cinema/filmParSalle" method="get">
<div class="mb-3">

</div>
</form>

<table class="table table-hover">
<tr>
<th>Photo</th><th>Id</th><th>Nom</th><th>description</th><th>realisateur</th><th>Action</th>
</tr>
<c:forEach items="${films}" var="f">
<tr>

<td> <c:choose>
		<c:when test="${f.photo==''}">
			<img src="/imagesdata/inconnu.jpg" width=50 height="50">
		</c:when>
		<c:when test="${f.photo!=''}">
			<img src="/imagesdata/${f.photo}" width=50 height="50">
		</c:when>
		</c:choose> 
</td>
<td>${f.id}</td>
<td>${f.nom}</td>

<td>${f.description}</td>
<td>${f.realisateur}</td>
<td><a href="/cinema/supprimerfilm/${f.id}"
 class="btn btn-danger">supprimer</a>
 <a href="/cinema/modifierfilm/${f.id}" class="btn btn-warning">
 modifier</a></td>
</tr>
</c:forEach>
</table>
</body>
</html>