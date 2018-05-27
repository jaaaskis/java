package regEx;

import java.util.Scanner;

public class RegExValidateStudentNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter student number: ");
		String inputNum = input.nextLine();
		
		input.close();
		
		if (inputNum.matches("[0-9]{7}") == false) {
			System.out.print("Invalid student number");
		} else {
			System.out.print("OK");
		}

	}

}
