<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link
href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
rel="stylesheet"
integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
crossorigin="anonymous">
<script
src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
crossorigin="anonymous"></script>
</script>
<body>
<%@include file="navbar.html" %>
<br>
<br>
<br>
<c:if test="${message!=null}">
<div class="alert alert-success" role="alert">
<c:out value="${message}"></c:out>
${film=null}
</div>
</c:if>
<div class=container>
<div class="card m-5 p-2">
 <div class="card-header"><h2>Ajouter Film</h2></div>
<div class="card-body">
<form action="/cinema/savefilm" method=post enctype="multipart/form-data" >

 <div class="mb-3 mt-3">
 <label for="nom" class="form-label">Nom:</label>
 <input type=text class="form-control" id="nom" name="nom" value="${film.nom}">
 </div>
 <div class="mb-3">
 <label for="description" class="form-label">Description:</label>
 <input type=text class="form-control" id="description" name="description" value="${film.description}">
 </div>
 <div class="mb-3">
 <label for="quantite" class="form-label">Realisateur:</label>
 <input type=text class="form-control" id="realisateur" name="realisateur" value="${film.realisateur}">
 </div>
 <div class="mb-3">
 <input type=hidden name=photo value="${film.photo}">
<label class="form-label">Photos</label> <input type="file"
name="file" accept="image/png,image/jpeg" class=form-control />
 </div>


 <input type=hidden name=id value="${film.id}">
 
 <button type="submit" class="btn btn-primary" >Save</button>
</form></div> </div></div></body>
</html>