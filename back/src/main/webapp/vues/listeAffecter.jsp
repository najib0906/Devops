<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Affectation</title>
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
<%@include file="navbar.html"%>
<br><br><br><center>
<h3> film In Salle</h3>
</center>

 


<div class="row">
<div class="col-4"></div>
    <div class="col-4">
<form method=get action="filtresalle">
<div class=container>
<div class="row mt-4 pl-2">

 <label class="form-label">Salle:</label>
 <select  class="form-control" name="salle" onchange="submit() " >
 <option selected hidden value="">Choose here</option>
 <c:forEach items="${salle}" var="cc">
 <option value=${cc.id}>${cc.nom}</option>
 </c:forEach>
 </select>
 </div> 
</div> </div> </form></div>

<table class="table table-hover">
<tr>
 <th> Id </th><th>nom de Film</th>
</tr>

<c:forEach items="${film}" var="p">
<tr>
<td>${p.id}</td>
<td>${p.nom}</td>

<td><a href="/cinema/desaffectersalle/${sallee.id}/${p.id}"
 class="btn btn-danger">remove</a>
</tr>
</c:forEach>

</table>
</body>
</html>