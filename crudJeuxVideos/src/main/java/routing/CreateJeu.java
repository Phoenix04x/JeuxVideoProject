package routing;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import db.Bdd;

/**
 * Servlet implementation class Newjeux
 */
public class CreateJeu extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateJeu() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.getServletContext().getRequestDispatcher("/WEB-INF/NewJeux.jsp").forward(request, response);	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		if(request.getParameter("Jeux-Id").isBlank()) {
			request.setAttribute("error_null", "Champ vide");
			this.doGet(request, response);
			}
		else if(request.getParameter("Jeux-Titre").isBlank()) {
			request.setAttribute("error_null", "Champ vide");
			this.doGet(request, response);
		}
		else if(request.getParameter("Jeux-Description").isBlank()) {
			request.setAttribute("error_null", "Champ vide");
			this.doGet(request, response);
		}
		else if(request.getParameter("Jeux-Prix").isBlank()) {
			request.setAttribute("error_null", "Champ vide");
			this.doGet(request, response);
		}
			else if(request.getParameter("Jeux_DateSortie").isBlank()) {
				request.setAttribute("error_null", "Champ vide");
				this.doGet(request, response);
			}
				else if(request.getParameter("Jeux_PaysOrigine").isBlank()) {
					request.setAttribute("error_null", "Champ vide");
					this.doGet(request, response);
				}
					else if(request.getParameter("Jeux_Connexion").isBlank()) {
						request.setAttribute("error_null", "Champ vide");
						this.doGet(request, response);
					}
						else if(request.getParameter("Jeux_Mode").isBlank()) {
							request.setAttribute("error_null", "Champ vide");
							this.doGet(request, response);
						}
							else if(request.getParameter("Genre_Id").isBlank()) {
								request.setAttribute("error_null", "Champ vide");
								this.doGet(request, response);
								
			}	else if(this.isExistUser(request.getParameter("Jeux_Id"))) {
			request.setAttribute("error_repeat", "Nom déjà utilisé sorry");
			this.doGet(request, response);
		} 
			else if(this.isExistUser(request.getParameter("Jeux_Titre"))) {
				request.setAttribute("error_repeat", "Nom déjà utilisé sorry");
				this.doGet(request, response);
			}
			else if(this.isExistUser(request.getParameter("Jeux_Description"))) {
				request.setAttribute("error_repeat", "Nom déjà utilisé sorry");
				this.doGet(request, response);
			}
			else if(this.isExistUser(request.getParameter("Jeux_Prix"))) {
				request.setAttribute("error_repeat", "Nom déjà utilisé sorry");
				this.doGet(request, response);
			}
			else if(this.isExistUser(request.getParameter("Jeux_DateSortie"))) {
				request.setAttribute("error_repeat", "Nom déjà utilisé sorry");
				this.doGet(request, response);
			}
			else if(this.isExistUser(request.getParameter("Jeux_PaysOrigine"))) {
				request.setAttribute("error_repeat", "Nom déjà utilisé sorry");
				this.doGet(request, response);
			}
			else if(this.isExistUser(request.getParameter("Jeux_Connexion"))) {
				request.setAttribute("error_repeat", "Nom déjà utilisé sorry");
				this.doGet(request, response);
			}
			else if(this.isExistUser(request.getParameter("Jeux_Mode"))) {
				request.setAttribute("error_repeat", "Nom déjà utilisé sorry");
				this.doGet(request, response);
			}
			else if(this.isExistUser(request.getParameter("Genre_Id"))) {
				request.setAttribute("error_repeat", "Nom déjà utilisé sorry");
				this.doGet(request, response);
			}else {
			createUser(request.getParameter("Jeux-Id"),request.getParameter("Jeux_Titre"),request.getParameter("Jeux_DateSortie"),request.getParameter("Jeux_PaysOrigine"),request.getParameter("Jeux_Connexion"),request.getParameter("Jeux_Mode"),request.getParameter("Genre_Id"));
			this.getServletContext().getRequestDispatcher("/WEB-INF/index.jsp").forward(request, response);
		}
		
		
	}
	
	protected boolean isExistUser(int Jeux_Id, String Jeux_Titre, String Jeux_Description,double Jeux_Prix, Date Jeux_DateSortie, String Jeux_PaysOrigine, String Jeux_Connexion, String Jeux_Mode, int Genre_Id) {
		Connection dbc = Bdd.getConnection();
		try {
			PreparedStatement ps = dbc.prepareStatement("SELECT * FROM jeux WHERE Jeux-Id=? AND Jeux-Titre=? AND Jeux_DateSortie=? AND Jeux_PaysOrigine=? AND Jeux_Connexion=? AND Jeux_Mode=? AND Genre_Id=?");
			ps.setInt(1, Jeux_Id);
			ps.setString(2, Jeux_Titre);
			ps.setString(3, Jeux_Description);
			ps.setDouble(4, Jeux_Prix);
			ps.setDate(5, Jeux_DateSortie);
			ps.setString(6, Jeux_PaysOrigine);
			ps.setString(7, Jeux_Connexion);
			ps.setString(8, Jeux_Mode);
			ps.setInt(9, Genre_Id);
			
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				return true;
			}else {
				return false;
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			//en cas de pb je bloque la connexion
			return false;
		}
		
	}
	protected boolean createUser(int Jeux_Id, String Jeux_Titre, String Jeux_Description,double Jeux_Prix, Date Jeux_DateSortie, String Jeux_PaysOrigine, String Jeux_Connexion, String Jeux_Mode, int Genre_Id) {
		Connection dbc = Bdd.getConnection();
		try {
			PreparedStatement ps = dbc.prepareStatement("INSERT INTO jeux(Jeux_Id, Jeux_Titre, Jeux_Description, Jeux_Prix, Jeux_DateSortie, Jeux_PaysOrigine, Jeux_Connexion, Jeux_Mode, Genre_Id) VALUES (? , ?, ?, ?, ?, ?, ?, ?, ?)");
			ps.setInt(1, Jeux_Id);
			ps.setString(2, Jeux_Titre);
			ps.setString(3, Jeux_Description);
			ps.setDouble(4, Jeux_Prix);
			ps.setDate(5, Jeux_DateSortie);
			ps.setString(6, Jeux_PaysOrigine);
			ps.setString(7, Jeux_Connexion);
			ps.setString(8, Jeux_Mode);
			ps.setInt(9, Genre_Id);
			
			int insert = ps.executeUpdate();
			if(insert > 0) {
				return true;
			}else {
				return false;
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			//en cas de pb je bloque la connexion
			return false;
		}
		
	}
	
}