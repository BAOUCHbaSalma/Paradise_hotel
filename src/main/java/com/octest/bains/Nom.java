package com.octest.bains;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



public class Nom {
	
	public Nom() {
		super();
	}


	
   

	public static Connection cnx() throws SQLException, ClassNotFoundException {
	  
	        Class.forName("com.mysql.cj.jdbc.Driver");

		return DriverManager.getConnection("jdbc:mysql://localhost:3306/paradise_hotel", "root", "");

		
	}

	

}


