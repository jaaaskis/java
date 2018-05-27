package JavaExam;

import java.util.Scanner;

public class PasswordProgram {
	
	private static boolean analyzePassword(String usr, String pwd) {
		
		// at least 6 characters
		// pwd at least ONE uppercase
		// no usr in pwd
		
		if (!pwd.matches(".*.{6,}.*")) {
			return false;
		}
		
		if (!pwd.matches(".*[A-ZÅÄÖ]+.*")) {
			return false;
		}
		
		pwd = pwd.toLowerCase();
		usr = usr.toLowerCase();
		
		if (pwd.matches(".*" + usr + ".*")) {
			return false;
		}
		
		return true;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("=== Password validation ===\n");
		System.out.print("Enter username: ");
		String user = input.nextLine();
		System.out.print("Enter password: ");
		String pass = input.nextLine();
		
		if (analyzePassword(user, pass)) {
			System.out.print("Password ok!");
		} else {
			System.out.print("Invalid password!");
		}
		
		input.close();

	}

}
