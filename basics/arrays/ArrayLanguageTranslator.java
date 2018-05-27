package arrays;
import java.util.Scanner;

public class ArrayLanguageTranslator {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String[] englishArray = { "bird", "bus", "car", "cat", "dog", "school", "thanks", "train", "teacher" };
		String[] finnishArray = { "lintu", "linja-auto", "auto", "kissa", "koira", "koulu", "kiitos", "juna",
				"opettaja" };

		System.out.print("Enter an English word: ");
		String inputWord = input.nextLine();
		input.close();

		for (int i = 0; i < englishArray.length; i++) {

			if (inputWord.matches(englishArray[i])) {

				System.out.print(finnishArray[i]);

				return;

			}

		}

		System.out.print("Unknown word");

	}

}
