package regEx;

import java.util.Scanner;

public class RegExVowelsOnly {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String inputStr = input.nextLine();
		input.close();
		
		if (inputStr.matches("[aeiouyäåöAEIOUYÄÅÖ]+") == false) {
			System.out.print("Not only vowels!");
		} else {
			System.out.print("Vowels only");
		}

	}

}
