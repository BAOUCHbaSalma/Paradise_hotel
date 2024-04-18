package com.octest.servlets;

import java.io.IOException;
import java.sql.Date;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.octest.bains.Nom;
import com.octest.bains.Room;
import com.octest.dao.RoomImpl;




/**
 * Servlet implementation class Acceuil
 */
@WebServlet("/Acceuil")
public class Acceuil extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Acceuil() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 RoomImpl room = new RoomImpl();
		 
 	    try {
 	    	
 	        request.setAttribute("rooms", room.AfficherRoom());
 	        request.getRequestDispatcher("/WEB-INF/Acceuil.jsp").forward(request, response);
 	    } catch (SQLException e) {
 	        e.printStackTrace();
 	    } catch (ClassNotFoundException e) {
			
				e.printStackTrace();
			}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Integer nbr=Integer.valueOf(request.getParameter("nbr"));
		String Type=request.getParameter("Type");
		Date Datearr=Date.valueOf(request.getParameter("Datearr"));
		 RoomImpl roomi = new RoomImpl();
		 
	 	
	 	    	
	 	        try {
					request.setAttribute("rooms", roomi.search(Datearr,nbr,Type));
				} catch (ClassNotFoundException | SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	 	       request.getRequestDispatcher("/WEB-INF/Acceuil.jsp").forward(request, response);
	}
	

}
