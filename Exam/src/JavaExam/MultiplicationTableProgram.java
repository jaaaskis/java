package JavaExam;

import java.util.Scanner;

public class MultiplicationTableProgram {

	private static void Multiplier(int number) {

		System.out.print("*");

		for (int i = 0; i < number; i++) {
			System.out.printf("%4d", (i + 1));
		}

		System.out.println();

		for (int i = 0; i < number; i++) {

			System.out.print((i + 1));
			
			for (int j = 0; j < number; j++) {

				System.out.printf("%4d", (j + 1) * (i + 1));

			}

			System.out.println();

		}

	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("=== Multiplication Table === \n");

		try {

			System.out.print("Enter an integer (1-20): ");
			int inputNumber = Integer.parseInt(input.nextLine());
			
			if (inputNumber >= 1 && inputNumber <= 20) {
				Multiplier(inputNumber);
			} else {
				System.out.print(inputNumber + " is not between 1 and 20.");
			}

		} catch (NumberFormatException nfe) {
			System.out.print(nfe.getMessage() + " is not an integer.");
		}

		input.close();
	}

}
