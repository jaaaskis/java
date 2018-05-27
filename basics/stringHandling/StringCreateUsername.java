package stringHandling;
import java.util.Scanner;

public class StringCreateUsername {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter first name: ");
		String fName = input.nextLine();
		System.out.print("Enter surname: ");
		String sName = input.nextLine();
		input.close();
		
		String output = createUsername(fName, sName);
		
		if (output == null) {
			System.out.println("Not enough letters to create a username!");
		} else {
			System.out.println(output);
		}

	}

	
	public static String createUsername(String fName, String sName) {
		
		fName = fName.toLowerCase();
		sName = sName.toLowerCase();
		
		String newUsr = "";
		
		//get first three letter from surname
		//get first two letters from first name
		//no user name created if there are not enough letters
		
		if (fName.matches(".{2,}") == false || sName.matches(".{3,}") == false) {
			return null;
		}
		
		newUsr += sName.substring(0,3);
		newUsr += fName.substring(0,2);
		
		return newUsr;
		
	}
}
