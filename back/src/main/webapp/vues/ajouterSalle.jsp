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
${salle=null}
</div>
</c:if>
<div class=container>
<div class="card m-5 p-2">
 <div class="card-header"><h2>Ajouter Salle</h2></div>
<div class="card-body">
<form action="/cinema/savesalle" method=post >

 <div class="mb-3 mt-3">
 <label for="nom" class="form-label">Nom:</label>
 <input type=text class="form-control" id="nom" name="nom" value="${salle.nom}">
 </div>
 <div class="mb-3">
 <label for="nb_place" class="form-label">nb_place:</label>
 <input type="number" class="form-control" id="nb_place" name="nb_place" value="${salle.nb_place}">
 </div>
 
 <div class="mb-3">
 <label for="cinema" class="form-label">cinema:</label>
 <select name="cinema" >
 <option selected hidden>Choose here</option>
 <c:forEach items="${cinemas}" var="cc">
 <option value=${cc.id} <c:if test="${salle.cinema.id==cc.id}">selected="true"</c:if>>${cc.nom} </option>
 </c:forEach>
 </select>
 </div>
 
 <input type=hidden name=id value="${salle.id}">
 
 <button type="submit" class="btn btn-primary" >Save</button>
</form></div> </div></div></body>
</html>