<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Gestion film cinema</title>
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

</div>
</c:if>


<div class=container>
<div class="card m-5 p-2">
 <div class="card-header"><h2>Affecter film to salle</h2></div>
<div class="card-body">
<form action="/cinema/savesallefilm" method=post enctype="multipart/form-data">
 <div class="mb-3">
 <label for="film" class="form-label">film:</label>
 <select name="film" class="form-control">
 <option selected hidden value="">Choose here</option>
 <c:forEach items="${films}" var="cc">
 <option value=${cc.id} >${cc.nom}</option>
 </c:forEach>
 </select>
 </div>
 <div class="mb-3">
 <label for="salle" class="form-label">salle:</label>
 <select name="salle" class="form-control" >
 <option selected hidden value="">Choose here</option>
 <c:forEach items="${salles}" var="cc">
 <option value=${cc.id} >${cc.nom} </option>
 </c:forEach>
 </select>
 </div>
 


 <button type="submit" class="btn btn-primary" >Save</button>
</form></div> </div></div></body>
</html>