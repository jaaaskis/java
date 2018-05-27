package arrays;
import java.util.Scanner;

public class ArrayElection {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of candidates: ");
		int candidatesAmount = Integer.parseInt(input.nextLine());
		int candidatesArray[] = new int[candidatesAmount];

		String[] candidateNames = new String[candidatesArray.length];
		int[] candidateVotes = new int[candidatesArray.length];

		for (int i = 0; i < candidatesArray.length; i++) {

			System.out.print("Enter " + (i + 1) + ". name: ");
			String inputName = input.nextLine();

			System.out.print("Enter votes: ");
			int votes = Integer.parseInt(input.nextLine());

			candidateNames[i] = inputName;
			candidateVotes[i] = votes;

		}

		input.close();

		int currentLead = 0;
		String currentLeadName = "";
		int evenVotes = 0;

		for (int i = 0; i < candidatesArray.length; i++) {

			if (candidateVotes[i] > currentLead) {

				currentLead = candidateVotes[i];
				currentLeadName = candidateNames[i];

			}

			if (currentLead == candidateVotes[i] && currentLeadName != candidateNames[i]) {

				evenVotes++;

			}

		}

		if (evenVotes > 0) {

			System.out.println("The election is a tie between the following candidates: ");

			for (int i = 0; i < candidatesArray.length; i++) {

				if (currentLead == candidateVotes[i]) {

					System.out.println(candidateNames[i] + " " + "(" + candidateVotes[i] + " votes)");

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
