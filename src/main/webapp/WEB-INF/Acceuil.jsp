<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="fr">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Accueil - Mon Hôtel</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<style>
    .card {
        margin-bottom: 20px;
    }
    .card-img-top {
        max-height: 200px;
        object-fit: cover;
    }
    .navbar-brand {
        font-weight: bold;
    }
    .footer {
        background-color: #f8f9fa;
        padding: 20px 0;
        text-align: center;
    }
    nav{
        position: fixed;
        width: 100%;
        top: 0;
        z-index: 1000;
        background: #ffffff47;
        backdrop-filter: blur(15px);
    }
    header{
    	height:300px;
    	background: url('https://i.ibb.co/sW7zkr5/Photographie-Studio-Facebook-Couverture.jpg') no-repeat bottom right/cover;
    }
    .title{
    	padding-top:50px;
    	width:400px;
    	margin:0 auto;
    	color:white;
    }
    .title > h2{
    	font-size:40px;
    	text-transform:uppercase;
    	font-weight:800;
    	text-shadow: 0 0 20px white;
    }
    .title > h4{
    	font-size:14px;
    	text-transform:uppercase;
    	font-weight:600;
    	color:grey;
    }
  
</style>
</head>
<body>

<header>
    <nav class="navbar navbar-expand-lg navbar-light">
        <div class="container">
            <a class="navbar-brand" href="#">Mon Hôtel</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarNav">
                <ul class="navbar-nav ml-auto">
                    <li class="nav-item active">
                        <a class="nav-link" href="#">Accueil</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">Chambres</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">Services</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">Contact</a>
                    </li>
                </ul>
            </div>
        </div>
    </nav>
    
    <div class="title">
    	<h2>Welcome to Paradise Hotel</h2>
    	<br>
    	<h4>Enjoy spending your time with us</h4>
    </div>
    
    
</header>



<div class="container my-4">
    <form action="A" method="post">
        <div class="row">
            <div class="col-md-4">
                <input type="text" class="form-control"  value="Chambre" name="Type" placeholder="Rechercher par Type du chambre">
            </div>
            <div class="col-md-4">
               <input type="text" class="form-control" value="2024-04-19" name="datearriverr" placeholder="AAAA-MM-JJ">
            </div>
             <div class="col-md-4">
               <input type="text" class="form-control" value="1" name="nbr" placeholder="Chercher avec nombre de personnes">
            </div>
            <div class="col-md-4">
                <button type="submit" class="btn btn-primary">Rechercher</button>
            </div>
        </div>
    </form>
</div>


<div class="container">
    <div class="row">
        <c:forEach var="room" items="${rooms}">
            <div class="col-md-4">
                <div class="card">
                    <img src="${room.getImg()}" class="card-img-top" alt="Chambre">
                    <div class="card-body">
                        <h5 class="card-title">${room.getType()}</h5>
                        <p class="card-text">${room.getEquipement()}</p>
                        <p class="card-text">Prix : ${room.getPrix()} €</p>
                        <a href="#" class="btn btn-primary">Réserver</a>
                    </div>
                </div>
            </div>
        </c:forEach>
    </div>
</div>


   <div class="container">
    <div class="row">
        <c:forEach var="room" items="${roomsi}">
            <div class="col-md-4">
                <div class="card">
                    <img src="${room.getImg()}" class="card-img-top" alt="Chambre">
                    <div class="card-body">
                        <h5 class="card-title">${room.getType()}</h5>
                        <p class="card-text">${room.getEquipement()}</p>
                        <p class="card-text">Prix : ${room.getPrix()} €</p>
                        <a href="#" class="btn btn-primary">Réserver</a>
                    </div>
                </div>
            </div>
        </c:forEach>
    </div>
</div>
      

<footer class="footer">
    <div class="container">
        <p> 2024 Mon Hôtel. Tous droits réservés.</p>
    </div>
</footer>


<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
