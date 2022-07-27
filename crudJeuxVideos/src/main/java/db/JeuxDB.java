package db;

import java.sql.*;
import java.util.ArrayList;

import model.Jeux;

public class JeuxDB {
	
	public static ArrayList<Jeux> jeux = new ArrayList<Jeux>();
	
	private static Connection linkBdd;
	
	
	private static String dsn = "jdbc:mysql://localhost:3307/jeuxvideo";
	
	private static String dbUser = "Sani";
	
	private static String dbPass = "13Besiom";


	public static Connection getConnection() {
		
		if (linkBdd == null) {
			try {
				Class.forName("com.mysql.cj.jbdc.Driver");
				linkBdd = DriverManager.getConnection(dsn,dbUser,dbPass);
			}catch(SQLException e) {
				e.printStackTrace();
				System.out.println("DB connection went kaboom");
			}catch(ClassNotFoundException e) {
				e.printStackTrace();
				System.out.println("Class not found kaboom");
			}
		}
		return linkBdd;
	}
	
	public static ArrayList<Jeux> getJeux() {
		
		linkBdd = getConnection();
		try {
			String sql = "SELECT * FROM jeux";
			Statement getJeuxQuery = linkBdd.createStatement();
			
			ResultSet rs = getJeuxQuery.executeQuery(sql);
			
			while(!rs.isLast()) {
				rs.next();
				
				Jeux j = new Jeux();
				j.setJeux_Id(rs.getInt("Jeux_Id"));
				j.setJeux_Titre(rs.getString("Jeux_Titre"));
				j.setJeux_Description(rs.getString("Jeux_Description"));
				j.setJeux_Prix(rs.getInt("Jeux_Prix"));
				j.setJeux_DateSortie(rs.getDate("Jeux_DateSortie"));
				j.setJeux_PaysOrigine(rs.getString("Jeux_PaysOrigine"));
				j.setJeux_Connexion(rs.getString("Jeux_Connexion"));
				j.setJeux_Mode(rs.getString("Jeux_Mode"));
				jeux.add(j);
			}
		}catch (SQLException e) {
			e.printStackTrace();
			System.out.println("SQL went Kaboom");
		}
		System.out.println(jeux);
		return jeux;
		
	}
}

