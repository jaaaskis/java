package studentServlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.ArrayList;

import studentDB.Student;
import studentDB.StudentDAO;

@WebServlet("/studentIdSearch")
public class StudentSearchServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {
			
			ArrayList<Student> studentList = null;
			
			StudentDAO studentDAO = new StudentDAO();

			studentList = studentDAO.getAllStudents();
			
			Integer searchID = Integer.parseInt(request.getParameter("idSearch"));
			
			studentList = studentDAO.getStudentById(searchID);
			
			request.setAttribute("studentList", studentList);
			
			request.getRequestDispatcher("StudentSearch.jsp").forward(request, response);
			

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
