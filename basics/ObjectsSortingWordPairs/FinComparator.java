package ObjectsSortingWordPairs;

import java.util.Comparator;

public class FinComparator implements Comparator<WordPair> {
	
	public int compare(WordPair a, WordPair b) {

		return a.getFinnishWord().compareTo(b.getFinnishWord());

	}

}
