package stringHandling;
import java.util.Scanner;

public class StringPassword {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter username: ");
		String usr = input.nextLine();
		System.out.print("Enter password: ");
		String pwd = input.nextLine();

		input.close();

		if (validatePassword(usr, pwd) == true) {
			System.out.print("OK");
		} else {
			System.out.print("NOT OK");
		}

	}

	public static boolean validatePassword(String usr, String pwd) {
		
		usr = usr.toLowerCase();
		pwd = pwd.toLowerCase();

		if (pwd.matches("[A-ZÅÄÖa-zåäö\\d]{8,}") == true && pwd.matches(".{0,}" + usr + ".{0,}") == false) {

			return true;

		} else {

			return false;

		}
	}
}
