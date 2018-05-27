package studentDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import connectionParam.ConnectionParameters;

public class StudentDAO {

	private final String username;
	private final String password;
	private final String databaseURL;

	public StudentDAO() throws Exception {
		username = ConnectionParameters.username;
		password = ConnectionParameters.password;
		databaseURL = ConnectionParameters.databaseURL;

		// In *Tomcat 8* the JDBC driver must be explicitly loaded as below
		try {
			Class.forName(ConnectionParameters.jdbcDriver);
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

	/**
	 * Opens a new database connection
	 * 
	 * @throws SQLException
	 */
	private Connection openConnection() throws SQLException {
		Connection dbConnection = DriverManager.getConnection(databaseURL, username, password);
		return dbConnection;
	}

	/**
	 * Closes an existing database connection
	 * 
	 * @throws SQLException
	 */
	private void closeConnection(Connection dbConnection) throws SQLException {
		if (dbConnection != null) {
			dbConnection.close();
		}
	}

	/**
	 * Retrieves all students from the database.
	 * 
	 * @return ArrayList<Student> - a List of Students
	 * @throws SQLException
	 */
	public ArrayList<Student> getAllStudents() throws SQLException {
		ArrayList<Student> studentList = new ArrayList<Student>();
		Connection dbConnection = null;

		try {
			dbConnection = openConnection();

			String sqlText = "SELECT id, firstname, lastname, streetaddress, postcode, postoffice FROM Student ORDER BY id";

			PreparedStatement preparedStatement = dbConnection.prepareStatement(sqlText);

			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				int id = resultSet.getInt("id");
				String firstname = resultSet.getString("firstname");
				String lastname = resultSet.getString("lastname");
				String streetaddress = resultSet.getString("streetaddress");
				String postcode = resultSet.getString("postcode");
				String postoffice = resultSet.getString("postoffice");

				studentList.add(new Student(id, firstname, lastname, streetaddress, postcode, postoffice));
			}

			return studentList;

		} catch (SQLException sqle) {
			throw sqle; // Let the caller decide what to do with the exception

		} finally {
			closeConnection(dbConnection);
		}
	}

	/**
	 * Retrieves students from the database for the given ID
	 * 
	 * @return ArrayList<Student> - a List of Students
	 * @throws SQLException
	 */
	public ArrayList<Student> getStudentById(int givenId) throws SQLException {
		ArrayList<Student> studentList = new ArrayList<Student>();
		Connection dbConnection = null;

		try {
			dbConnection = openConnection();

			String sqlText = "SELECT id, firstname, lastname, streetaddress, postcode, postoffice "
					+ "FROM Student WHERE id = ? ORDER BY id";

			PreparedStatement preparedStatement = dbConnection.prepareStatement(sqlText);
			preparedStatement.setInt(1, givenId);

			ResultSet resultSet = preparedStatement.executeQuery();

			boolean rowFound = false;

			while (resultSet.next()) {
				rowFound = true;

				int id = resultSet.getInt("id");
				String firstname = resultSet.getString("firstname");
				String lastname = resultSet.getString("lastname");
				String streetaddress = resultSet.getString("streetaddress");
				String postcode = resultSet.getString("postcode");
				String postoffice = resultSet.getString("postoffice");

				studentList.add(new Student(id, firstname, lastname, streetaddress, postcode, postoffice));
			}

			if (rowFound == false) {
				System.out.println("Unknown student id (" + givenId + ")");
			}

			return studentList;

		} catch (SQLException sqle) {
			throw sqle; // Let the caller decide what to do with the exception

		} finally {
			closeConnection(dbConnection);
		}
	}

	/**
	 * Inserts new student into the database
	 * 
	 * @param student
	 * @return
	 */
	public int insertStudent(Student student) {
		Connection dbConnection = null;

		try {

			dbConnection = DriverManager.getConnection(databaseURL, username, password);

			String sqlText = "INSERT INTO Student (id, firstname, lastname, streetaddress, postcode, postoffice) VALUES (?, ?, ?, ?, ?, ?)";

			PreparedStatement preparedStatement = dbConnection.prepareStatement(sqlText);
			preparedStatement.setInt(1, student.getId());
			preparedStatement.setString(2, student.getFirstname());
			preparedStatement.setString(3, student.getLastname());
			preparedStatement.setString(4, student.getStreetaddress());
			preparedStatement.setString(5, student.getPostcode());
			preparedStatement.setString(6, student.getPostoffice());

			preparedStatement.executeUpdate();

			return 0;

		} catch (SQLException sqle) {

			// First, check if the problem is primary key violation (the error
			// code is vendor-dependent)
			if (sqle.getErrorCode() == ConnectionParameters.PK_VIOLATION_ERROR) {
				// System.out.println("Cannot insert the student. " + "Student
				// id (" + student.getId() + ") is already in use.");
				return 1;
			} else {
				System.out.println(
						"The database is temporarily unavailable. Please try again later.\n" + sqle.getMessage());
				return -1;
			}

		} finally {
			if (dbConnection != null) {
				try {
					dbConnection.close();
				} catch (SQLException sqle) {
					System.out.println("\nClose connection failed. \n" + sqle.getMessage());
				}
			}
		}
	}

	/**
	 * Returns all students in JSON format
	 * 
	 * @return
	 * @throws SQLException
	 */
	public String getAllStudentsJSON() throws SQLException {
		Connection dbConnection = null;
		ArrayList<Student> studentList = new ArrayList<Student>();

		try {
			dbConnection = openConnection();

			String sqlText = "SELECT id, firstname, lastname, streetaddress, postcode, postoffice FROM Student ORDER BY id";

			PreparedStatement preparedStatement = dbConnection.prepareStatement(sqlText);

			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				int id = resultSet.getInt("id");
				String firstname = resultSet.getString("firstname");
				String lastname = resultSet.getString("lastname");
				String streetaddress = resultSet.getString("streetaddress");
				String postcode = resultSet.getString("postcode");
				String postoffice = resultSet.getString("postoffice");

				studentList.add(new Student(id, firstname, lastname, streetaddress, postcode, postoffice));

			}

			String jsonString = null;

			for (Student student : studentList) {

				if (jsonString == null) {
					jsonString = "{\"students\": [";
				} else {
					jsonString += ",";
				}

				jsonString += "{" + "\"id\": " + student.getId() + ", ";
				jsonString += "\"first_name\":\"" + student.getFirstname() + "\", ";
				jsonString += "\"last_name\":\"" + student.getLastname() + "\", ";
				jsonString += "\"streetaddress\":\"" + student.getStreetaddress() + "\", ";
				jsonString += "\"postcode\":\"" + student.getPostcode() + "\", ";
				jsonString += "\"postoffice\":\"" + student.getPostoffice() + "\"}";
			}

			jsonString += "]}";

			return jsonString;

		} catch (SQLException sqle) {
			throw sqle; // Let the caller decide what to do with the exception

		} finally {
			closeConnection(dbConnection);
		}
	}

	/**
	 * Deletes Student from the database with the input ID
	 * 
	 * @param givenId
	 * @return
	 */
	public int deleteStudent(int givenId) throws SQLException {
		Connection dbConnection = null;

		try {
			dbConnection = openConnection();

			String sqlText = "DELETE FROM Student WHERE id = ?";

			PreparedStatement preparedStatement = dbConnection.prepareStatement(sqlText);
			preparedStatement.setInt(1, givenId);

			preparedStatement.executeQuery();

			return 0;

		} catch (SQLException sqle) {
			System.out
					.println("The database is temporarily unavailable. Please try again later.\n" + sqle.getMessage());
			return -1;

		} finally {
			if (dbConnection != null) {
				try {
					dbConnection.close();
				} catch (SQLException sqle) {
					System.out.println("\nClose connection failed. \n" + sqle.getMessage());
				}
			}
		}

	}
}