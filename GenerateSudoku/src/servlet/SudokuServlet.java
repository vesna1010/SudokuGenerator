package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import service.SudokuService;

@SuppressWarnings("serial")
@WebServlet("/sudoku")
public class SudokuServlet extends HttpServlet {

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		SudokuService service = new SudokuService();
		
		request.setAttribute("sudoku", service.generateSudoku());
		request.getRequestDispatcher("index.jsp").forward(request, response);
	
	}

}
