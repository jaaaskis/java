package advancedRegEx;

import java.util.Scanner;

public class StringDecimalPartLength {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a decimal number: ");
		String inputDouble = input.nextLine();
		input.close();

		if (inputDouble.matches("\\d+(,|\\.)\\d+") == false) {
			System.out.print("Please enter a proper decimal number");
			return;
		}
		
		int result = checkDecimals(inputDouble);
		
		System.out.println(result + " decimal place(s)");
		

	}

	public static int checkDecimals(String inputDouble) {
		
		inputDouble = inputDouble.replace(",",".");
		
		int startingPoint = inputDouble.indexOf(".") + 1;
		
		int decimalAmount = inputDouble.length() - startingPoint;
		
		return decimalAmount;
		
	}
}