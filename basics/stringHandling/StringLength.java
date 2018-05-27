package stringHandling;
import java.util.Scanner;

public class StringLength {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int length = 0;

		System.out.print("Enter first string: ");
		String inputString = input.nextLine();

		length += inputString.length();

		if (inputString.equals("quit")) {
			System.out.print("The total length is " + (length - 4));
		} else {
			while (!inputString.equals("quit")) {
				System.out.print("Enter a string: ");
				inputString = input.nextLine();

				length += inputString.length();
			}

			System.out.print("The total length is " + (length - 4));
		}

		input.close();
	}

}
