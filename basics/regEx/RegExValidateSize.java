package regEx;

import java.util.Scanner;

public class RegExValidateSize {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter size: ");
		String size = input.nextLine();
		
		input.close();
		
		if (size.matches("(XS|S|M|L|XL)") == false) {
			System.out.print("Invalid size");
		} else {
			System.out.print("OK");
		}

	}

}
