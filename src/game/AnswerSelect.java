package game;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class AnswerSelect
 */
public class AnswerSelect extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AnswerSelect() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Getting access to the player and selected session variables.
		HttpSession session = request.getSession();
		Player player = (Player)session.getAttribute("player");
		ArrayList<Integer> selected = (ArrayList<Integer>)session.getAttribute("selected");
		
		// Getting and adding 1 to the amount of answered questions
		int answeredQuestions = (int)session.getAttribute("answeredQuestions");
		answeredQuestions++;
		
		// Getting the current player score and storing it in the score variable
		int score = player.getScore();
		int scoreChange=0;
		
		// Getting access to all questions and their parameters
		LoadQuestions lQ = new LoadQuestions();
		Question[] q = lQ.load();
		
		// Getting the question number and question value.
		int qNo = Integer.parseInt(request.getParameter("qNo"));
		int value = Integer.parseInt(request.getParameter("value"));
		
		// Adding the question number to the selected arraylist
		selected.add(qNo);
		
		String userAnswer = (String)request.getParameter("userAnswer");
		
		// Checking if question is correct and adding or subtracting the from the score
		if (userAnswer.equals(q[qNo].getCorAns())) {
			scoreChange = score + (value);
			session.setAttribute("isCorrect", 1);
		} else if (userAnswer.equals("skip")) {
			scoreChange = score;
			session.setAttribute("isCorrect", 0);
		} else {
			scoreChange = score + (-1 * value);
			session.setAttribute("isCorrect", 2);
		}
		player.setScore(scoreChange);
		
		// Updating all modified session variables
		session.setAttribute("player", player);
		session.setAttribute("loadBoard", false);
		session.setAttribute("selected", selected);
		session.setAttribute("answeredQuestions", answeredQuestions);
		
		
		// If there are more questions to answer the RequestDispatcher goes to the gameboard.
		// Otherwise the user is redirected to the "You Win Page"
		if (answeredQuestions < 25) {
			//RequestDispatcher rd = request.getRequestDispatcher("GameBoard.jsp");
			//rd.forward(request, response);
			response.sendRedirect("GameBoard.jsp");
		} else {
			if (player.getScore() < 0) {
				session.setAttribute("winner", false);
			}
			response.sendRedirect("YouWin.jsp");
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
