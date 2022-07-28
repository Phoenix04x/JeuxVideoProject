package db;

import java.sql.*;
import java.util.ArrayList;

//import com.csm.enrici.model.User;

import model.Jeux;

public class JeuxDB {
	
	public static ArrayList<Jeux> jeux = new ArrayList<Jeux>();
	
	private static Connection linkBdd;
	
	
	private static String dsn = "jdbc:mysql://localhost:3306/jeuxvideo";
	
	private static String dbUser = "Chrisd";
	
	private static String dbPass = "ChrisD04!!!!";


	public static Connection getConnection() {
		
		if (linkBdd == null) {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				linkBdd = DriverManager.getConnection(dsn,dbUser,dbPass);
			}catch(SQLException e) {
				e.printStackTrace();
				System.out.println("DB connection went kaboom");
			}catch(ClassNotFoundException e) {
				e.printStackTrace();
<<<<<<< HEAD
				System.out.println("Class went kaboom");

=======
				System.out.println("Class not found kaboom");
>>>>>>> refs/remotes/origin/master
			}
		}
		return linkBdd;
	}
	
	public static ArrayList<Jeux> getJeux() {
<<<<<<< HEAD
//		
//		linkBdd = getConnection();
//		try {
//			String sql = "SELECT * FROM jeux";
//			Statement getJeuxQuery = linkBdd.createStatement();
//			
//			ResultSet rs = getJeuxQuery.executeQuery(sql);
//			
//			while(!rs.isLast()) {
//				rs.next();
//				
//				Jeux j = new Jeux();
//				j.setJeux_Id(rs.getInt("Jeux_Id"));
//				j.setJeux_Titre(rs.getString("Jeux_Titre"));
//				j.setJeux_Description(rs.getString("Jeux_Description"));
//				j.setJeux_Prix(rs.getInt("Jeux_Prix"));
//				j.setJeux_DateSortie(rs.getDate("Jeux_DateSortie"));
//				j.setJeux_PaysOrigine(rs.getString("Jeux_PaysOrigine"));
//				j.setJeux_Connexion(rs.getString("Jeux_Connexion"));
//				j.setJeux_Mode(rs.getString("Jeux_Mode"));
//				j.setJeux_Mode(rs.getString("Genre_id"));
//				jeux.add(j);
//			}
//		}catch (SQLException e) {
//			e.printStackTrace();
//		}
//		System.out.println(jeux);
//		return jeux;
//		
=======
		
>>>>>>> refs/remotes/origin/master
		linkBdd = getConnection();
		try {
			
			String sql = "SELECT * FROM jeux";
<<<<<<< HEAD
=======
			Statement getJeuxQuery = linkBdd.createStatement();
>>>>>>> refs/remotes/origin/master
			
<<<<<<< HEAD
			//on crée une requête préparée
			PreparedStatement getJeuxQuery = linkBdd.prepareStatement(sql);
			//on exécute la requête préparée
			ResultSet rs = getJeuxQuery.executeQuery(sql);
			//si on a trouvé notre utilisateur
=======
			ResultSet rs = getJeuxQuery.executeQuery(sql);
			
>>>>>>> refs/remotes/origin/master
			while(!rs.isLast()) {
				rs.next();
				//on crée un objet Jeux, on le stock dans une liste et on renvoie la liste
				Jeux j = new Jeux();
				j.setJeux_Id(rs.getInt("Jeux_Id"));
				j.setJeux_Titre(rs.getString("Jeux_Titre"));
				j.setJeux_Description(rs.getString("Jeux_Description"));
				j.setJeux_Prix(rs.getInt("Jeux_Prix"));
				j.setJeux_DateSortie(rs.getDate("Jeux_DateSortie"));
				j.setJeux_PaysOrigine(rs.getString("Jeux_PaysOrigine"));
				j.setJeux_Connexion(rs.getString("Jeux_Connexion"));
				j.setJeux_Mode(rs.getString("Jeux_Mode"));
<<<<<<< HEAD
				j.setJeux_Mode(rs.getString("Genre_id"));
				jeux.add(j);
			

=======
				jeux.add(j);
>>>>>>> refs/remotes/origin/master
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
<<<<<<< HEAD
			return null;
=======
			System.out.println("SQL went Kaboom");
>>>>>>> refs/remotes/origin/master
		}
<<<<<<< HEAD
		//System.out.println(jeux);
=======
		System.out.println(jeux);
>>>>>>> refs/remotes/origin/master
		return jeux;
		
    }
}

