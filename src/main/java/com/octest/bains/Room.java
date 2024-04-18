package com.octest.bains;

import java.sql.Blob;
import java.sql.Date;

public class Room {
	
	public Integer getId() {
		return Id;
	}


	public void setId(Integer id) {
		Id = id;
	}


	public String getType() {
		return Type;
	}


	public void setType(String type) {
		Type = type;
	}


	public Integer getPrix() {
		return Prix;
	}


	public void setPrix(Integer prix) {
		Prix = prix;
	}


	public String getEquipement() {
		return Equipement;
	}


	public void setEquipement(String equipement) {
		Equipement = equipement;
	}


	private Integer Id;
	private String Type;
	private Integer Prix;
	private String Equipement;
	private Date Disponibilite;
	private Integer Nombre_personne;
	public Integer getNombre_personne() {
		return Nombre_personne;
	}


	public void setNombre_personne(Integer nombre_personne) {
		Nombre_personne = nombre_personne;
	}


	private String img;

	

	public String getImg() {
		return img;
	}


	public void setImg(String img) {
		this.img = img;
	}


	public Date getDisponibilite() {
		return Disponibilite;
	}


	public void setDisponibilite(Date disponibilite) {
		Disponibilite = disponibilite;
	}


	public Room(Integer Id, String Type, Integer Prix, String Equipement,Date Disponibilite,Integer Nombre_personne,String img) {
		this.Id= Id;
		this.Type=Type;
		this.Prix=Prix;
		this.Equipement=Equipement;
		this.Disponibilite=Disponibilite;
		this.Nombre_personne=Nombre_personne;
		this.img=img;
		
		
	}

}
