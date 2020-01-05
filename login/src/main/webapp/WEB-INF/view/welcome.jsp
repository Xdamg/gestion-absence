<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Gestion-Absence</title>
</head>
<link href="static/css/bootstrap.min.css" rel="stylesheet">
<link href="static/css/style.css" rel="stylesheet">
<body>
<div role="navigation">
		<div class="navbar navbar-inverse">
			<a href="/welcome" class="navbar-brand">Est-Sb</a>
			<div class="navbar-collapse collapse">
				<ul class="nav navbar-nav">
					
					<li><a href="/modifier-absence">modifier-étudiant</a></li>
					<li><a href="/noter-absence">Noter l'absence</a></li>
				</ul>
			</div>
		</div>
	</div>
	<c:choose>
	<c:when test="${mode=='ALL_STUDENTS' }">
			<div class="container text-center" id="tasksDiv">
				<h3>Liste des étudiants</h3>
				<hr>
				<div class="table-responsive">
					<table class="table table-dark">
						<thead>
							<tr>
								<th><center>Id</center></th>
								<th><center>prenom</center></th>
								<th><center>nom</center></th>
								<th><center>Absent</center></th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="user" items="${users }">
								<tr>
									<td><b>${user.id}</b></td>
									<td><b>${user.name}</b></td>
									<td><b>${user.password}</b></td>
									<td><a href="/validate-absence?id=${user.id }"><span
											class="glyphicon glyphicon-ok"></span></a></td>
									
											
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
			</div>
		</c:when>
		</c:choose>
		<c:choose>
		<c:when test="${mode=='ALL_USERS' }">
			<div class="container text-center" id="tasksDiv">
				<h3>Etat-d'absence</h3>
				<hr>
				<div class="table-responsive">
					<table class="table table-dark">
						<thead>
							<tr>
								<th><center>Id</center></th>
								<th><center>prenom</center></th>
								<th><center>nom</center></th>
								<th><center>Nombre d'heures d'absence</center></th>
								
								<th><center>Modifier</center></th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="user" items="${users }">
								<tr>
									<td><b>${user.id}</b></td>
									<td><b>${user.name}</b></td>
									<td><b>${user.password}</b></td>
									<td><b>${user.nbr_heures}</b></td>
									
									
									<td><a href="/edit-user?id=${user.id }"><span
											class="glyphicon glyphicon-pencil"></span></a></td>
									
											
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
			</div>
		</c:when>
		</c:choose>
				<c:choose>
		
		<c:when test="${mode=='MODE_UPDATE' }">
			<div class="container text-center">
				<h3>Modifier les informations d'étudiant </h3>
				<hr>
				<form class="form-horizontal" method="POST" action="save-user">
					<input type="hidden" name="id" value="${user.id }" />
					<div class="form-group">
						<label class="control-label col-md-3">prenom</label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="username"
								value="${user.name }" />
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-md-3">prenom</label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="firstname"
								value="${user.password }" />
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-md-3">Nombre d'heures d'absence</label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="lastname"
								value="${user.nbr_heures }" />
						</div>
					</div>
					
					
					
					<div class="form-group ">
						<input type="submit" class="btn btn-primary" value="Update" />
					</div>
				</form>
			</div>
		</c:when>
		</c:choose>

<script src="static/js/jquery-1.11.1.min.js"></script>
	<script src="static/js/bootstrap.min.js"></script>
</body>
</html>