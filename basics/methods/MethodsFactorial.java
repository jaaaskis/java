package methods;

public class MethodsFactorial {

	public static void main(String[] args) {

		for (int i = 1; i <= 9; i++) {

			System.out.println(i + "! = " + factorial(i));
		}

	}

	private static int factorial(int inputInt) {

		int output = 1;

		for (int i = 2; i <= inputInt; i++) {
			output = output * i;
		}
		
		return output;

	}
}