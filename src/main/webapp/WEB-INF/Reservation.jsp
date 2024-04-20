<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<title>Accueil - Mon Hôtel</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
<style>
body{
background-color:red;
}
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
  
    .title{
    	padding-top:50px;
    	width:700px;
    	margin:0 auto;
    	color:white;
    	  text-align: center;
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
    	color:white;
    
    }
</style>

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
<h1>Reservation</h1>

    <table border="1">
        <tr>
            <th>Datedebut</th>
            <th>DateFin</th>
            <th>id room</th>
             
        </tr>
        <c:forEach var="reserv" items="${resrvs}">
            <tr>
                <td>${reserv.getId_reservation()}</td>
                <td>${reserv.getDate_debut()}</td>
                <td>${reserv.getDate_depart()}</td>
               
            </tr>
        </c:forEach>
    </table>
    
    <footer class="footer">
    <div class="container">
        <p> 2024 Mon Hôtel. Tous droits réservés.</p>
    </div>
</footer>


<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

</body>
</html>