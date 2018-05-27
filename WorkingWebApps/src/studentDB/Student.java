package studentDB;

public class Student {
	
	private int id;
	private String firstname;
	private String lastname;
	private String streetaddress;
	private String postcode;
	private String postoffice;

	public Student() {
		id = -1;
		firstname = "";
		lastname = "";
		streetaddress = "";
		postcode = "";
		postoffice = "";
	}

	public Student(int id, String firstname, String lastname, String streetaddress, String postcode,
			String postoffice) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.streetaddress = streetaddress;
		this.postcode = postcode;
		this.postoffice = postoffice;
	}



	public int getId() {
		return id;
	}

	public String getFirstname() {
		return firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public String getStreetaddress() {
		return streetaddress;
	}

	public String getPostcode() {
		return postcode;
	}

	public String getPostoffice() {
		return postoffice;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public void setStreetaddress(String streetaddress) {
		this.streetaddress = streetaddress;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public void setPostoffice(String postoffice) {
		this.postoffice = postoffice;
	}
	
	public String toString() {
		return firstname + " " + lastname + ", " + streetaddress + ", " + postcode + " " + postoffice;
	}

}
