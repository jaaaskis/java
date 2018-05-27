package OOP;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ObjectsWordList {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		ArrayList<String> wordList = new ArrayList<String>();

		while (true) {
			System.out.print("Enter a word (quit ends): ");
			String newWord = input.nextLine();

			if (newWord.matches("quit")) {
				break;
			}

			wordList.add(newWord);
		}

		input.close();

		Collections.sort(wordList);
		
		for (String wordObject : wordList) {
			System.out.println(wordObject);
		}

	}

}
