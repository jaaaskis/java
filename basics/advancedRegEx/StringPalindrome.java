package advancedRegEx;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String first = input.nextLine();
		input.close();

		if (isPalindrome(first) == true) {
			System.out.println("The text is a palindrome.");
		} else {
			System.out.print("No palindrome");
		}

	}

	private static boolean isPalindrome(String input) {

		String reversedInput = "";

		if (input.matches("^(?=.*[^a-zåäöA-ZÅÄÖ]+)(?=.*[^\\s,\\.'\"!?;:-]*)(?=.*[0-9]+)\\S*$")) {
			return false;
		}

		input = input.replaceAll("[\\s,\\.'\"!?;:-]", "").toLowerCase();

		for (int i = input.length() - 1; i >= 0; i--) {
			reversedInput += input.charAt(i);
		}

		// This should not even be here, temporary solution. Go fix the damn
		// regex.
		if (reversedInput.isEmpty() == true) {
			return false;
		}

		if (input.matches(reversedInput)) {
			return true;
		}

		return false;

	}

}
