<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

  <h1>Liste Chambres</h1>

    <table border="1">
        <tr>
            <th>Id</th>
            <th>Type</th>
            <th>Prix</th>
             <th>Equipement</th>
             <th>Disponibilite</th>
             <th>Nombre_personne</th>
             <th>img</th>
        </tr>
        <c:forEach var="room" items="${rooms}">
            <tr>
                <td>${room.getId()}</td>
                <td>${room.getType()}</td>
                <td>${room.getPrix()}</td>
                <td>${room.getEquipement()}</td>
                <td>${room.getDisponibilite()}</td>
                <td>${room.getNombre_personne()}</td>
                <td><img src="${room.getImg()}" ></td>
            </tr>
        </c:forEach>
    </table>
    <form action="d" method="post">
    <input type="Number" name="nbr"> 
    <input type="text" name="Type"> 
     <input type="text" name="Datearr">
    
    <button type='submit'>ev</button>
    </form>


</body>
</html>