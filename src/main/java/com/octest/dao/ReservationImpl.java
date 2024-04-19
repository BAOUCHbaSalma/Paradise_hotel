package com.octest.dao;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.octest.bains.Nom;
import com.octest.bains.Reservation;

public class ReservationImpl implements DaoReservation{

	@Override
	public void Reserver(Date Datearrive, Date DateDepart, Integer idRoom) throws ClassNotFoundException, SQLException {
		String requet = "INSERT INTO reservation (Date_Debut, Date_Depart, Room_Id) VALUES(?,?,?)";

        PreparedStatement statement;

            statement = Nom.cnx().prepareStatement(requet);
            statement.setDate(1,Datearrive);
             statement.setDate(2,DateDepart);
             statement.setInt(3,idRoom);
              statement.executeUpdate();
     
               
               String Requet = "UPDATE room SET Disponibilite=? WHERE Id_Room=?";
               PreparedStatement statementt;
               statementt = Nom.cnx().prepareStatement(Requet);
               statementt.setDate(1,DateDepart);
               statementt.setInt(2,idRoom);
               statementt.executeUpdate();
		
	}

	@Override
	public List<Reservation> ShowReservation() throws ClassNotFoundException, SQLException {
		List<Reservation> reservation=new ArrayList();
		String requet ="SELECT * FROM reservation";
		
		PreparedStatement statement = Nom.cnx().prepareStatement(requet);
        ResultSet resultat = statement.executeQuery();
       

        while (resultat.next()) {
        	Integer id_reservation = resultat.getInt("Id_reservation");
            Date Datearrive=resultat.getDate("Date_Debut");
            Date DateDepart=resultat.getDate("Date_Depart");
            Integer idRoom = resultat.getInt("Room_Id");
            Reservation res=new Reservation(id_reservation,Datearrive,DateDepart,idRoom);
            reservation.add(res);
            
            
            
		
	}
		return reservation;}}




