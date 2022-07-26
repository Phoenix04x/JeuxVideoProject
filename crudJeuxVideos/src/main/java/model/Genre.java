package model;

import java.io.Serializable;

public class Genre implements Serializable {
	
	private int Genre_Id;
	private String Genre_Titre;
	private String Genre_Description;
	/**
	 * 
	 */
	public Genre() {
	}
	public int getGenre_Id() {
		return Genre_Id;
	}
	public void setGenre_Id(int genre_Id) {
		Genre_Id = genre_Id;
	}
	public String getGenre_Titre() {
		return Genre_Titre;
	}
	public void setGenre_Titre(String genre_Titre) {
		Genre_Titre = genre_Titre;
	}
	public String getGenre_Description() {
		return Genre_Description;
	}
	public void setGenre_Description(String genre_Description) {
		Genre_Description = genre_Description;
	}
	
	

}
