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

@WebServlet("/DeleteStudent")
public class StudentDeleteService extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {
			
			ArrayList<Student> studentList = null;
			
			StudentDAO studentDAO = new StudentDAO();

			studentList = studentDAO.getAllStudents();
			
			Integer studentID = Integer.parseInt(request.getParameter("studentId"));
			
			studentDAO.deleteStudent(studentID);
			
			studentList = studentDAO.getAllStudents();
			
			request.setAttribute("studentList", studentList);
			
			request.getRequestDispatcher("StudentList.jsp").forward(request, response);
			

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}


}
