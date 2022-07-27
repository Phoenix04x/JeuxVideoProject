<!DOCTYPE html>
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


            <select name="plateforme" id="plateforme-select">
                <option value="">--Trier par plateforme--</option>
                <option value="PC">PC</option>
                <option value="PS4">PS4</option>
                <option value="One">One</option>
                <option value="Switch">Switch</option>
            </select>
        </div>
        <div class="liste_jeux">
            <ul>
                <li>
                    <span></span>
                </li>
            </ul>
        </div>
        <div class="form">
            <a href="NewJeux.jsp"><button>Ajouter un jeu</button></a>
            <a href="ModifJeux.jsp"><button>Modifier un jeu</button></a>
            <a href="NewGenre.jsp"><button>Ajouter un genre</button></a>
            <a href="ModifGenre.jsp"><button>Modifier un genre</button></a>
            <a href="NewPlateforme.jsp"><button>Ajouter une plateforme</button></a>
            <a href="ModifPlateforme.jsp"><button>Modifier une plateforme</button></a>
        </div>
    </div>
</body>

</html>