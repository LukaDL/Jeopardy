package game;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Getting name from the LoginPage.html
		String passedName = request.getParameter("name");
		
		// Creating a Player object using the one arg constructor.
		Player player = new Player(passedName);
		
		// Creating an array list that will allow for question deactivation
		ArrayList<Integer> selected = new ArrayList<Integer>();
		
		// Setting up the HttpSession object and setting all session variables.
		HttpSession session = request.getSession();
		session.setAttribute("player", player);
		session.setAttribute("loadBoard", true);
		session.setAttribute("winner", true);
		session.setAttribute("selected", selected);
		session.setAttribute("isCorrect", 0);
		session.setAttribute("answeredQuestions", 0);
		session.setAttribute("qNo", 0);
		session.setAttribute("value", 0);
		session.setAttribute("dailydouble", false);
		
		// Randomly assigning two daily double spots
		int dd1 = 10 + (int)(15 * Math.random());
		int dd2 = 10 + (int)(15 * Math.random());
		while (true) {
			if (dd1 != dd2) {
				session.setAttribute("dd1", dd1);
				session.setAttribute("dd2", dd2);
				break;
			}
			dd2 = 10 + (int)(15 * Math.random());
		}
		
		// Using the RequestDispatcher to go to the gameboard.
		RequestDispatcher rd = request.getRequestDispatcher("GameBoard.jsp");
		rd.forward(request, response);
	}
}
