package com.octest.dao;

import java.sql.Date;
import java.sql.SQLException;
import java.util.List;

import com.octest.bains.Room;

public interface DaoRoom {
List<Room> AfficherRoom() throws ClassNotFoundException, SQLException;
List<Room> search(Date Departdate,Integer nbr,String Type) throws ClassNotFoundException, SQLException;
}
