package methods;
import java.util.Scanner;

public class MethodsMax {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter first double: ");
		double first = Double.parseDouble(input.nextLine().replace(',', '.'));
		
		System.out.print("Enter second double: ");
		double second = Double.parseDouble(input.nextLine().replace(',', '.'));
		
		System.out.println();		
		double result = max(first, second);
		
		System.out.print("The max value is " + result);

		input.close();
	}

	private static double max(double a, double b) {
		return (a > b) ? a : b;
	}
}
