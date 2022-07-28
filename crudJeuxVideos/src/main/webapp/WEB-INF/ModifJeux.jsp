<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Formulaire</title>
</head>
<body>
<form method=post action="JeuxServlet">
		<div>
			<label for=" name">Titre :</label> <input type="text" id="nom"
				name="nom">
		</div>
		<div>
			<label for="name">Description :</label> <input type="text" id="description"
				name="Description">
		</div>
		<div>
			<label for="name">Date-de-sortie</label> <input type="date"
				id="name" name="datedesortie">
		</div>
		<div>
			<label for="name">Prix :</label> <input type="text" id="prix"
				name="Prix">
		</div>
		<div>
			<label for="name">Pays :</label> <input type="text" id="pays"
				name="pays">
		</div>
		<div>
			<label for="name">Type-connection :</label> <input type="text" id="connection"
				name="connection">
		</div>
		<div>
			<label for="name">Mode-jeux :</label> <input type="text" id="mode"
				name="telephone">
		</div>
		<div>
			<INPUT TYPE=SUBMIT VALUE="Valider">
		</div>
	</form>
</body>
</html>