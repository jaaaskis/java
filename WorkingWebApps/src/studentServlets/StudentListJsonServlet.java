package studentServlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import studentDB.StudentDAO;

@WebServlet("/studentsJSON")
public class StudentListJsonServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		try {
			PrintWriter out = response.getWriter();
			response.setContentType("text/plain");
			response.setCharacterEncoding("UTF-8");
			
			StudentDAO studentDAO = new StudentDAO();
			
			String jsonString = studentDAO.getAllStudentsJSON();
			
			out.println(jsonString);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
