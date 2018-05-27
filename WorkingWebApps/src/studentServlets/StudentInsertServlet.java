package studentServlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import studentDB.Student;
import studentDB.StudentDAO;

@WebServlet("/insertStudent")
public class StudentInsertServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {
			
			int inputId = Integer.parseInt(request.getParameter("studentId"));
			String firstname = request.getParameter("firstName");
			String lastname = request.getParameter("lastName");
			String street = request.getParameter("streetAddress");
			String postcode = request.getParameter("postCode");
			String postoffice = request.getParameter("postOffice");
			
			Student newStudent = new Student(inputId, firstname, lastname, street, postcode, postoffice);
			
			StudentDAO studentDAO = new StudentDAO();

			int insertStudentResult = studentDAO.insertStudent(newStudent);

			request.setAttribute("result", insertStudentResult);

			request.getRequestDispatcher("StudentInsertPage.jsp").forward(request, response);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
