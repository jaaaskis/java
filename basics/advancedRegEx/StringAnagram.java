package advancedRegEx;

import java.util.Arrays;
import java.util.Scanner;

public class StringAnagram {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter first string: ");
		String first = input.nextLine();
		System.out.print("Enter second string: ");
		String second = input.nextLine();
		input.close();

		if (isAnagram(first, second) == true) {
			System.out.println("Anagram!");
		} else {
			System.out.print("No anagram.");
		}

	}

	public static boolean isAnagram(String first, String second) {

		// only letters, whitespace, commas and dots allowed
		// ignore all whitespace, commas and dots when checking the text
		// if no letter, cannot be an anagram

		// validate input
		// remove all whitespace and extra characters using replaceAll
		// everything to lowercase
		// texts into arrays and sort them
		// compare the two strings

		if (first.matches("^(?=.*[a-zåäöA-ZÅÄÖ]+)(?=.*[\\s,\\.]*).*$") == false
				|| second.matches("^(?=.*[a-zåäöA-ZÅÄÖ]+)(?=.*[\\s,\\.]*).*$") == false) {
			return false;
		}

		first = first.replaceAll("[\\s,\\.]", "").toLowerCase();
		second = second.replaceAll("[\\s,\\.]", "").toLowerCase();

		char[] firstArray = first.toCharArray();
		Arrays.sort(firstArray);
		first = new String(firstArray);

		char[] secondArray = second.toCharArray();
		Arrays.sort(secondArray);
		second = new String(secondArray);

		if (first.matches(second)) {
			return true;
		}

		return false;
	}

}
