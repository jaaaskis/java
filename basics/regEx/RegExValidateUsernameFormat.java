package regEx;

import java.util.Scanner;

public class RegExValidateUsernameFormat {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter username: ");
		String usr = input.nextLine();
		input.close();
		
		if (usr.matches("[a][0-9]{7}[@]myy[\\.]haaga[-]helia[\\.]fi") == false) {
			System.out.print("Invalid username format");
		} else {
			System.out.print("OK");
		}

	}

}
