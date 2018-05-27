package stringHandling;
import java.util.Scanner;

public class StringCount {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String newString = input.nextLine();

		int count = 0;

		if (newString.isEmpty()) {

			System.out.print("String count is " + count);

		} else {

			while (!newString.isEmpty()) {
				System.out.print("Enter a string: ");
				newString = input.nextLine();

				count++;
			}
			
			System.out.print("String count is " + count);
		}

		input.close();

	}

}
