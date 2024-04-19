package com.octest.dao;

import java.sql.Blob;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.octest.bains.Nom;
import com.octest.bains.Room;

public class RoomImpl implements DaoRoom{

	@Override
	public List<Room> AfficherRoom() throws ClassNotFoundException, SQLException{
		 List<Room> room=new ArrayList<Room>();
			String requet = "SELECT * FROM room WHERE Disponibilite IS NULL OR Disponibilite<NOW()";
			
			PreparedStatement statement = Nom.cnx().prepareStatement(requet);
	        ResultSet resultat = statement.executeQuery();
	       

	        while (resultat.next()) {
	            Integer Id = resultat.getInt("Id_Room");
	            String Type= resultat.getString("Type");
	            Integer Prix  = resultat.getInt("Prix");
	            String Equipement= resultat.getString("Equipement");
	            Date Disponibilite=resultat.getDate("Disponibilite");
	            Integer Nombre_personne = resultat.getInt("Nombre_personne");
	            String img = resultat.getString("img");
	       
	            Room Room = new Room(Id, Type,Prix,Equipement,Disponibilite,Nombre_personne,img );

	            room.add(Room);
	        }
			return room;
	}

	@Override
	public List<Room> search(Date Departdate,Integer nbr,String type) throws ClassNotFoundException, SQLException{
		List<Room> Search=new ArrayList<Room>();
		String requet = "SELECT * FROM room WHERE (Disponibilite<? OR Disponibilite IS NULL) AND (Nombre_personne = ? OR Type = ?) ";
		PreparedStatement statement = Nom.cnx().prepareStatement(requet);
		statement.setDate(1,Departdate);
		 statement.setInt(2,nbr);
		 statement.setString(3,type);
        ResultSet resultat = statement.executeQuery();

        while (resultat.next()) {
            Integer Id = resultat.getInt("Id_Room");
            String Type= resultat.getString("Type");
            Integer Prix  = resultat.getInt("Prix");
            String Equipement= resultat.getString("Equipement");
         Date Disponibilite=resultat.getDate("Disponibilite");
            Integer Nombre_personne = resultat.getInt("Nombre_personne");
            String img = resultat.getString("img");
       
            Room srRe = new Room(Id, Type,Prix,Equipement,Disponibilite,Nombre_personne,img );
            Search.add(srRe);
        }
         
		return Search;
	}

}
