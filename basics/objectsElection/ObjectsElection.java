package objectsElection;

import java.util.Scanner;

public class ObjectsElection {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of candidates: ");
		int candidatesAmount = Integer.parseInt(input.nextLine());
		Candidate[] candidatesArray = new Candidate[candidatesAmount];

		for (int i = 0; i < candidatesArray.length; i++) {

			System.out.print("Enter " + (i + 1) + ". name: ");
			String inputName = input.nextLine();

			candidatesArray[i] = new Candidate(inputName);

			System.out.print("Enter votes: ");
			int votes = Integer.parseInt(input.nextLine());

			candidatesArray[i].setVotes(votes);

		}

		input.close();

		int currentLead = 0;
		String currentLeadName = "";
		int evenVotes = 0;

		for (Candidate current : candidatesArray) {

			if (current.getVotes() > currentLead) {
				currentLead = current.getVotes();
				currentLeadName = current.getName();
			}

			if (currentLead == current.getVotes() && currentLeadName != current.getName()) {
				evenVotes++;
			}

		}

		if (evenVotes > 0) {

			System.out.println("The election is a tie between the following candidates: ");

			for (Candidate current : candidatesArray) {

				if (currentLead == current.getVotes()) {
					System.out.println(current.getName() + " " + "(" + current.getVotes() + " votes)");
				}

			}

		}

		// Get the highest amount of votes from the array. If there is only one
		// value then print out the winner. Otherwise compare the rest of the
		// votes to the array and on each match print it out.

		if (evenVotes == 0) {
			System.out.print("The winner is " + currentLeadName + " with " + currentLead + " votes!");
		}

	}

}
