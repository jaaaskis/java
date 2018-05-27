package advancedRegEx;

import java.util.Scanner;

public class StringPasswordStrength {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter password: ");
		String pwd = input.nextLine();
		input.close();

		if (checkStrength(pwd) == false) {
			System.out.print("Not strong enough!");
		} else {
			System.out.print("OK");
		}

	}

	public static boolean checkStrength(String input) {

		// arguments
		// uppercase, lowercase, digits, other

		int matches = 0;

		if (input.matches("(?=.*[A-Z]).{8,}")) {
			matches++;
		}

		if (input.matches("(?=.*[a-z]).{8,}")) {
			matches++;
		}

		if (input.matches("(?=.*[0-9]).{8,}")) {
			matches++;
		}

		if (input.matches("(?=.*[\\W_]).{8,}")) {
			matches++;
		}

		if (matches >= 3) {
			return true;
		}

		return false;
	}

}
