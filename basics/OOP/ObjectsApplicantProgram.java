package OOP;

import java.util.Scanner;

public class ObjectsApplicantProgram {
	
	public static class Applicant {
		
		private String name;
		private int points;
		
		public Applicant(String name, int points) {
			this.name = name;
			this.points = points;
		}

		public String getName() {
			return name;
		}

		public int getPoints() {
			return points;
		}
				
		
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Applicant[] applicantArray = new Applicant[4];
		
		String newName;
		int newPoints;
		
		for (int i = 0; i < applicantArray.length; i++) {			
			System.out.print("Enter " + (i + 1) +". name: ");
			newName = input.nextLine();
			
			System.out.print("Enter points: ");
			newPoints = Integer.parseInt(input.nextLine());
			
			applicantArray[i] = new Applicant(newName, newPoints);
		}
		
		System.out.print("Enter the minimum requirement of points: ");
		int minReq = input.nextInt();
		
		input.close();
		
		System.out.println("The following applicants achieved the minimum of " + minReq + " points");
		
		for (int i = 0; i < applicantArray.length; i++) {
			
			String toPrint = applicantArray[i].getName() + ", " + applicantArray[i].getPoints() + " points";
			
			if (applicantArray[i].points >= minReq) {
				System.out.println(toPrint);
			}
			
		}

	}
	
	

}
