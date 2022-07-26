package model;

import java.io.Serializable;

public class Plateforme implements Serializable{
	
	private int Plateform_Id;
	private String Plateforme_Nom;
	private String Plateforme_Description;
	/**
	 * 
	 */
	public Plateforme() {
	}
	public int getPlateform_Id() {
		return Plateform_Id;
	}
	public void setPlateform_Id(int plateform_Id) {
		Plateform_Id = plateform_Id;
	}
	public String getPlateforme_Nom() {
		return Plateforme_Nom;
	}
	public void setPlateforme_Nom(String plateforme_Nom) {
		Plateforme_Nom = plateforme_Nom;
	}
	public String getPlateforme_Description() {
		return Plateforme_Description;
	}
	public void setPlateforme_Description(String plateforme_Description) {
		Plateforme_Description = plateforme_Description;
	}
	
	

}
