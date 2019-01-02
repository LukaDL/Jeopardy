package game;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class PickQuestion
 */
public class PickQuestion extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PickQuestion() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		int value = Integer.parseInt(request.getParameter("value"));
		int qNo = Integer.parseInt(request.getParameter("qNo"));
		
		// Getting daily double location session variables
		int dd1 = (int)session.getAttribute("dd1");
		int dd2 = (int)session.getAttribute("dd2");
		
		// Setting question value and number session variables
		session.setAttribute("value", value);
		session.setAttribute("qNo", qNo);
		
		// Checking if clicked daily double space
		if (dd1 == qNo || dd2 == qNo) {
			// Using the RequestDispatcher to go to the Question page.
			RequestDispatcher rd = request.getRequestDispatcher("DailyDouble.jsp");
			rd.forward(request, response);
		} else {
			// Using the RequestDispatcher to go to the Question page.
			RequestDispatcher rd = request.getRequestDispatcher("Question.jsp");
			rd.forward(request, response);
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
