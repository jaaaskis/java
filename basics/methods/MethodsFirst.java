package methods;

public class MethodsFirst {

	public static void main(String[] args) {
		printNumbers();
	}

	private static void printNumbers() {

		int number = 2;

		while (number <= 50) {

			System.out.print(number + " ");

			number += 2;
		}
	}

}
