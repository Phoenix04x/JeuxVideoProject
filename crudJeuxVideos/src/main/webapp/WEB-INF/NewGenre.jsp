<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="/WEB-INF/style.css">
<title>Formulaire</title>
</head>
<h1>New Genre</h1>
<body>
	<form method=post action="WelcomeServlet">
		<div>
			<label for=" name">Titre :</label> <input type="text" id="Titre"
				name="titre">
		</div>
		<div>
			<label for="name">Description :</label> <input type="text" id="description"
				name="Description">
		</div>
</body>
</html>