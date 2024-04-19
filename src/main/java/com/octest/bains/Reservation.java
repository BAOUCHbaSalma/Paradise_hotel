package com.octest.bains;

import java.sql.Date;

public class Reservation {
	
	private Integer id_reservation;
	private Date date_debut;
	private Date date_depart;
	private Integer id_room;
	
	public Reservation(Integer id_reservation, Date date_debut, Date date_depart, Integer id_room) {
		super();
		this.id_reservation = id_reservation;
		this.date_debut = date_debut;
		this.date_depart = date_depart;
	
		this.id_room = id_room;
	}
	
	public Integer getId_reservation() {
		return id_reservation;
	}
	public void setId_reservation(Integer id_reservation) {
		this.id_reservation = id_reservation;
	}
	public Date getDate_debut() {
		return date_debut;
	}
	public void setDate_debut(Date date_debut) {
		this.date_debut = date_debut;
	}
	public Date getDate_depart() {
		return date_depart;
	}
	public void setDate_depart(Date date_depart) {
		this.date_depart = date_depart;
	}


	public Integer getId_room() {
		return id_room;
	}
	public void setId_room(Integer id_room) {
		this.id_room = id_room;
	}
	
}
