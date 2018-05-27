package OOP;

import java.util.ArrayList;

public class ObjectsSailorProgram {

	public static class Sailor {

		private String name;
		private String email;

		public Sailor(String name, String email) {
			this.name = name;
			this.email = email;
		}

		public String getName() {
			return this.name;
		}

		public String getEmail() {
			return this.email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

	}

	public static class Crew {

		private ArrayList<Sailor> sailorList = new ArrayList<Sailor>();

		public Crew() {
			
		}

		public void addCrewMember(Sailor sailor) {
			this.sailorList.add(sailor);
		}
		
		public String toString() {
			
			String output = "";
			
			for (Sailor current : sailorList) {
				output += current.getName() + " " + "(" + current.getEmail() + ")\n";
			}
			
			return output;
		}

	}

	public static void main(String[] args) {

		Sailor firstSailor = new Sailor("Frank", "frank@mail.com");
		Sailor secondSailor = new Sailor("Susan", "susan@mail.com");
		Sailor thirdSailor = new Sailor("John", "john@sailors.com");
		Sailor fourthSailor = new Sailor("Ann", "ann@sailors.com");

		Crew firstCrew = new Crew();
		Crew secondCrew = new Crew();

		firstCrew.addCrewMember(firstSailor);
		firstCrew.addCrewMember(secondSailor);
		firstCrew.addCrewMember(fourthSailor);
		secondCrew.addCrewMember(thirdSailor);
		secondCrew.addCrewMember(secondSailor);

		System.out.println("=== First crew ===\n" + firstCrew);
		System.out.println("=== Second crew ===\n" + secondCrew);

		secondSailor.setEmail("Susan@sailors.com");
		System.out.println("===Second crew ===\n" + secondCrew);
		
//		for (Sailor member : firstCrew) {
//			System.out.println(member);
//		}
	}

}
