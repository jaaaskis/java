package OOP;

import java.util.Scanner;

public class ObjectsTimePeriodProgram {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		TimePeriod period = new TimePeriod();

		System.out.println(period);

		for (int i = 1; i <= 2; i++) {

			System.out.print("Enter hours to add: ");
			int hours = Integer.parseInt(input.nextLine());

			System.out.print("Enter minutes to add: ");
			int minutes = Integer.parseInt(input.nextLine());

			period.addHours(hours);
			period.addMinutes(minutes);

			System.out.println(period);
			System.out.println();
		}
		input.close();
	}

	public static class TimePeriod {

		private int hours;
		private int minutes;

		public TimePeriod() {
			hours = 0;
			minutes = 0;
		}

		public void addHours(int hoursToAdd) {

			if (hoursToAdd >= 0 && hoursToAdd <= 99) {
				hours += hoursToAdd;
			}

		}

		public void addMinutes(int minutesToAdd) {

			if (minutesToAdd >= 0 && minutesToAdd < 59) {

				int prevMin = minutes;

				minutes += minutesToAdd;

				if (minutes == 60 && hours < 99) {
					hours += 1;
					minutes = 0;
				}

				if (minutes > 60 && hours < 99) {
					hours += 1;
					minutes -= 60;
				}
				
				if (hours >= 99) {
					hours = 99;
					if (minutes == 60) {
						minutes = prevMin;
					} else if (minutes > 60){
						minutes = prevMin;
					}

				}

			}

		}

		public String toString() {
			return hours + " h " + minutes + " min";
		}

	}
}
