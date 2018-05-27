package methods;
import java.util.Scanner;

public class MethodsUseLibraryClass {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter an integer: ");
		int input1 = input.nextInt();

		int result = MethodsLibrary.FactorialTest(input1);

		System.out.print(input1 + "! = " + result);

		input.close();
	}
}

class MethodsLibrary {

	public static int FactorialTest(int inputInt) {

		int output = 1;

		for (int i = 2; i <= inputInt; i++) {
			output = output * i;
		}
		return output;
	}
}
