<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
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

</body>
</html>