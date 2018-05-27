package ObjectsSortingWordPairs;

import java.util.Comparator;

public class EngComparator implements Comparator<WordPair> {

	public int compare(WordPair a, WordPair b) {

		return a.getEnglishWord().compareTo(b.getEnglishWord());

	}

}
