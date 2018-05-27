package stringHandling;
import java.util.Scanner;

public class StringLetterAndDigits {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String inputString = input.nextLine();

		int stringCount = 0;
		int digitCount = 0;

		for (int i = 0; i < inputString.length(); i++) {

			if (Character.isLetter(inputString.charAt(i))) {
				stringCount++;
			} else if (Character.isDigit(inputString.charAt(i))) {
				digitCount++;
			}

		}
		
		System.out.println(stringCount + " letter(s)");
		System.out.print(digitCount + " digit(s)");
		
		input.close();

	}

}
