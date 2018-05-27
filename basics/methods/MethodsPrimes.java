package methods;
import java.util.Scanner;

public class MethodsPrimes {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Check if prime: ");
		int integer = Integer.parseInt(input.nextLine());

		System.out.print(isPrime(integer));

		System.out.println();

		int count = 0;
		int limit = 20;
		int print = 2;

		while (count < limit) {

			if (isPrime(print) == true) {
				System.out.print(print + " ");
				count++;
			}

			print++;

		}

		input.close();
	}

	private static boolean isPrime(int integer) {

		for (int i = 2; i < integer; i++) {
			if (integer % i == 0) {
				return false;
			}
		}
		return true;
	}

}
