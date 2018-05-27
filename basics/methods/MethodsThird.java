package methods;
import java.text.DecimalFormat;
import java.util.Scanner;

public class MethodsThird {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("##.00");
		
		System.out.print("Enter gross salary: ");
		double salary = Double.parseDouble(input.nextLine().replace(',', '.'));
		
		System.out.print("Enter income tax rate: ");
		double incomeTax = Double.parseDouble(input.nextLine().replace(',', '.'));
		
		System.out.println();
		
		System.out.print("The net salary is " + df.format(calculateNetSalary(salary, incomeTax)));
		
		input.close();
	}
	
	private static double calculateNetSalary(double salary, double incomeTax) {

		double result = salary * (1-incomeTax/100);
		
		return result;
	}

}
