<!DOCTYPE html>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<html>

<head>
    <meta charset="UTF-8">
    <title>Jeux video</title>
    <link rel="stylesheet" href="style.css">
</head>

<body>
    <header>
        <h1>Jeux videos</h1>
    </header>
    <div class="wrapper">
        <div class="search_bar">
            <form id="answer" action="" class="example">
                <input type="text" placeholder="Chercher un jeu" method="post">
                <input type="submit" value="ok">
            </form>
        </div>
        <div class="Trie">

            <select name="genre" id="genre-select">
                <option value="">--Trier par genre--</option>
                <option value="MMO">MMO</option>
                <option value="FPS">FPS</option>
                <option value="RPG">RPG</option>
                <option value="Action">Action</option>
                <option value="Sport">Sport</option>
                <option value="Plateformer">Plateformer</option>
                <option value="Puzzle">Puzzle</option>
                <option value="Educatif">Educatif</option>
            </select>
<br>

            <select name="plateforme" id="plateforme-select">
                <option value="">--Trier par plateforme--</option>
                <option value="PC">PC</option>
                <option value="PS4">PS4</option>
                <option value="One">One</option>
                <option value="Switch">Switch</option>
            </select>
        </div>
        <div class="liste_jeux">
            <c:forEach items="${data}" var="jeu">
                <tr>
                    <td>
                        <c:out value="${jeu}" /><br>
                    </td>
                </tr>
            </c:forEach>
        </div>
        <div class="form">
            <a href="JeuxServlet"><button>Ajouter un jeu</button></a><br>
<!--             <a href="GenreServlet"><button>Modifier un jeu</button></a><br> -->
            <a href="GenreServlet"><button>Ajouter un genre</button></a><br>
<!--             <a href="ModifGenre.jsp"><button>Modifier un genre</button></a><br> -->
            <a href="PlateformeServlet"><button>Ajouter une plateforme</button></a><br>
<!--             <a href="ModifPlateforme.jsp"><button>Modifier une plateforme</button></a> -->
        </div>
    </div>
</body>

</html>