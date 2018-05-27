package stringHandling;
import java.util.Scanner;

public class StringWarmUp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String inputString = input.nextLine();
		
		int count = 0;
		
		for (int i = 0; i < inputString.length(); i++) {
			count++;
		}

		System.out.println(count + " characters");
		System.out.println(inputString.toUpperCase());
		System.out.print(inputString.toLowerCase());
		
		input.close();
	}

}
