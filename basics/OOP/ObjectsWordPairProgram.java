package OOP;

public class ObjectsWordPairProgram {
	
	public class WordPair {
	
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

	public void main(String[] args) {
		
		WordPair one = new WordPair("class","luokka");
		WordPair two = new WordPair("object","olio");
		WordPair three = new WordPair("variable","muuttuja");
		
		System.out.println(one.getEnglishWord() + " = " + one.getFinnishWord());
		System.out.println(two.getEnglishWord() + " = " + two.getFinnishWord());
		System.out.println(three.getEnglishWord() + " = " + three.getFinnishWord());
		

	}

}
