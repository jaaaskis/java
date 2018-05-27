package arrays;
import java.text.DecimalFormat;
import java.util.Scanner;

public class ArrayGrossPayCalculation {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("##.00");

		System.out.print("Enter your hourly wage: ");
		double hourlyWage = fixDouble(input);
		System.out.print("Enter the number of days: ");
		int days = Integer.parseInt(input.nextLine());

		int hours[] = new int[days];
		int totalHours = 0;
		double grossPay = 0;

		for (int i = 0; i < days; i++) {
			System.out.print("Hours worked on day " + (i + 1) + ": ");
			int hoursInput = Integer.parseInt(input.nextLine());

			hours[i] = hoursInput;

		}

		for (int i = 0; i < hours.length; i++) {
			totalHours += hours[i];
		}

		for (int i = 0; i < days; i++) {

			if (hours[i] > 8) {
				
				int extraHours = hours[i] - 8;

				grossPay += extraHours * (hourlyWage * 1.5);
				
				grossPay += (hours[i] - extraHours) * hourlyWage;
				
				
			} else {
				
				grossPay += hours[i] * hourlyWage;
				
			}
			

		}

		System.out.println("Total work hours is " + totalHours);
		System.out.println("Gross pay is " + df.format(grossPay).replace(".",","));
		System.out.print("You entered the following daily hours: ");

		for (int i = 0; i < hours.length; i++) {
			System.out.print(hours[i] + " ");
		}

		input.close();
	}

	private static double fixDouble(Scanner input) {
		return Double.parseDouble(input.nextLine().replace(',', '.'));
	}
}
