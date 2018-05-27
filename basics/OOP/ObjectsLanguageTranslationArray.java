package OOP;

import java.util.Scanner;

public class ObjectsLanguageTranslationArray {

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

		WordPair[] wordArray = { new WordPair("bird", "lintu"), new WordPair("bus", "bussi"),
				new WordPair("car", "auto"), new WordPair("cat", "kissa"), new WordPair("dog", "koira") };

		System.out.print("Enter an English word: ");
		String inputString = input.nextLine().toLowerCase();
		input.close();

		for (int i = 0; i < wordArray.length; i++) {
			if (inputString.matches(wordArray[i].getEnglishWord())) {
				System.out.println(wordArray[i].getFinnishWord());
				return;
			}
		}
		
		System.out.println("Unknown word");

	}

}
