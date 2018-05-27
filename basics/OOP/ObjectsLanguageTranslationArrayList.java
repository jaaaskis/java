package OOP;

import java.util.ArrayList;
import java.util.Scanner;

public class ObjectsLanguageTranslationArrayList {

	public static class WordPair {

		private String englishWord;
		private String finnishWord;

		public WordPair(String englishWord, String finnishWord) {
			this.englishWord = englishWord;
			this.finnishWord = finnishWord;
		}

		public String getEnglishWord() {
			return englishWord;
		}

		public String getFinnishWord() {
			return finnishWord;
		}

	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		ArrayList<WordPair> translationArray = new ArrayList<WordPair>();

		System.out.println("=== Creating an English-Finnish dictionary (ok ends) ===");

		while (true) {
			System.out.print("Enter an English word: ");
			String enWord = input.nextLine();

			if (enWord.matches("ok")) {
				System.out.println();
				break;
			}

			System.out.print("Enter a Finnish word: ");
			String finWord = input.nextLine();

			System.out.println();

			translationArray.add(new WordPair(enWord, finWord));
		}

		System.out.println("=== English-Finnish translation service (quit ends) ===");

		while (true) {
			System.out.print("Enter an English word: ");
			String inputWord = input.nextLine();

			if (inputWord.matches("quit")) {
				System.out.println("Bye!");
				break;
			}

			int match = 0;

			for (WordPair wordObject : translationArray) {

				if (inputWord.matches(wordObject.getEnglishWord())) {
					System.out.println(wordObject.getFinnishWord());
					match++;
					break;
				}

			}

			if (match == 0) {
				System.out.println("Unknown word");
			}

		}

		input.close();
	}

}
