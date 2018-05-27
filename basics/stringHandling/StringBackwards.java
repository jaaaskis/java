package stringHandling;
import java.util.Scanner;

public class StringBackwards {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String inputString = input.nextLine();

		input.close();
		
		String output = reverse(inputString);
		
		System.out.println(output);

	}

	public static String reverse(String inputString) {
		
		String newInput = "";
		
		for (int i = inputString.length() - 1; i >= 0; i--) {
			newInput += inputString.charAt(i);
		}
		
		//Get each character from the end of the old string and add it to the new string.

		return newInput;

	}
}
