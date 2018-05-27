package advancedRegEx;

import java.util.Scanner;

public class StringRemoveSpace {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String inputString = input.nextLine();
		input.close();
		
		String result = removeExtraSpace(inputString);
		
		System.out.println('"' + result + '"');

	}
	
	public static String removeExtraSpace(String input) {
		
		//trim the string and then use replaceAll regex condition
		//to get more than one occurrence of whitespace
		
		input = input.trim().replaceAll(" +", " ");
		
		return input;
	}

}
