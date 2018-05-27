package OOP;

public class ObjectsWordPairArray {

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
		
		WordPair[] wordArray = {
				new WordPair("class","luokka"),
				new WordPair("object","olio"),
				new WordPair("variable","muuttuja")
		};
		
		for (int i = 0; i < wordArray.length; i++) {
			
			String toPrint = wordArray[i].getEnglishWord() + " = " + wordArray[i].getFinnishWord();
			
			System.out.println(toPrint);
		}

	}

}
