package com.octest.servlets;

import java.io.IOException;
import java.sql.Date;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.octest.dao.ReservationImpl;

/**
 * Servlet implementation class FReserve
 */
@WebServlet("/FReserve")
public class FReserve extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FReserve() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Integer Id = Integer.valueOf(request.getParameter("Id"));
		
		request.setAttribute("Id", Id);
		 request.getRequestDispatcher("/WEB-INF/FormReservation.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Date Datearrive=Date.valueOf(request.getParameter("Datearrive"));
 		Date DateDepart=Date.valueOf(request.getParameter("Datedepart"));
 	   Integer idRoom=Integer.valueOf(request.getParameter("idRoom"));
 	 
 	   ReservationImpl reserve =new ReservationImpl();
try {
	reserve.Reserver(Datearrive,DateDepart,idRoom);
} catch (ClassNotFoundException e) {
	
	e.printStackTrace();
} catch (SQLException e) {
	// TODO Auto-generated catch block 
	e.printStackTrace();
}

            request.getRequestDispatcher("/WEB-INF/FormReservation.jsp").forward(request, response);
	}
	

}
