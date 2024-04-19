package com.octest.dao;

import java.sql.Date;
import java.sql.SQLException;
import java.util.List;

import com.octest.bains.Reservation;

public interface DaoReservation {

void Reserver(Date Datearrive,Date DateDepart,Integer idRoom) throws ClassNotFoundException, SQLException;
List<Reservation> ShowReservation() throws ClassNotFoundException, SQLException;
}
