package routing;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Jeux;

import java.io.IOException;
import java.util.ArrayList;

import db.JeuxDB;

/**
 * Servlet implementation class JeuxServlet
 */
public class JeuxServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public JeuxServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
<<<<<<< HEAD
	
		//response.getWriter().append("Served at: ").append(req:uest.getContextPath());
		ArrayList<Jeux> jeux = JeuxDB.getJeux();
		request.setAttribute("data", jeux);
		System.out.println(jeux);
=======
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		ArrayList<Jeux> jeux = JeuxDB.getJeux();
		System.out.println("J'ai des Jeux: " + jeux.size());

		request.setAttribute("data", jeux);
>>>>>>> refs/remotes/origin/master
		this.getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
<<<<<<< HEAD
		//this.getServletContext().getRequestDispatcher("/WEB-INF/NewJeux.jsp").forward(request, response);
=======
		
		
>>>>>>> refs/remotes/origin/master
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		this.getServletContext().getRequestDispatcher("/WEB-INF/NewJeux.jsp").forward(request, response);

		

	}

}
