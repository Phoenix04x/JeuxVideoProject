<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Formulaire</title>
</head>
<h1>New Genre</h1>
<body>
	<form method=post action="JeuxServlet">
		<div>
			<label for=" name">Plateforme :</label> <input type="text" id="nom"
				name="nom">
		</div>
		<div>
			<label for="name">Description :</label> <input type="text" id="description"
				name="Description">
		</div>
</body>
</html>