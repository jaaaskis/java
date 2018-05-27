package ObjectsSortingWordPairs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ObjectsSortingWordPairs {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		ArrayList<WordPair> translationArray = new ArrayList<WordPair>();

		System.out.println("=== Creating an English-Finnish dictionary (quit ends) ===");

		while (true) {
			System.out.print("Enter an English word: ");
			String enWord = input.nextLine();
			
			enWord = enWord.toLowerCase();

			if (enWord.matches("quit")) {
				System.out.println();
				break;
			}

			System.out.print("Enter a Finnish word: ");
			String finWord = input.nextLine();
			
			finWord = finWord.toLowerCase();

			System.out.println();

			translationArray.add(new WordPair(enWord, finWord));
		}
		
		Collections.sort(translationArray, new EngComparator());
		
		for (WordPair current : translationArray) {
			System.out.println(current.getEnglishWord() + " = " + current.getFinnishWord());
		}
		
		System.out.println();
		
		Collections.sort(translationArray, new FinComparator());
		
		for (WordPair current : translationArray) {
			System.out.println(current.getFinnishWord() + " = " + current.getEnglishWord());
		}

		input.close();
	}

}
