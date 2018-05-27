package arrays;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayDescendingNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double[] decimalArray = new double[4];

		for (int i = 0; i < 4; i++) {
			System.out.print("Enter " + (i+1) + ". number: ");
			decimalArray[i] = fixDouble(input);
		}

		Arrays.sort(decimalArray);

		for (int i = (decimalArray.length - 1); i >= 0; i--) {
			System.out.print(decimalArray[i] + " ");
		}

		input.close();

	}
	
	private static double fixDouble(Scanner input) {
		return Double.parseDouble(input.nextLine().replace(',', '.'));
	}

}
