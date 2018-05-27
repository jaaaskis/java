package JavaBankApplication;

// ************************************************************************
// BankProgram.java	 Template created on 15.9.2016
// - The program class for the BankApplication exercise
// ************************************************************************
import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class BankProgram {

	private static ArrayList<Account> accountList = new ArrayList<Account>();

	// *** DO NOT change anything in the main method ***
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int choice = -1;

		while (choice != 0) {

			switch (choice) {
			case 1:
				listAccounts();
				break;
			case 2:
				addAccount();
				break;
			case 3:
				depositMoney();
				break;
			case 4:
				withdrawMoney();
				break;
			case 5:
				deleteAccount();
				break;
			}

			displayMenu();
			choice = Integer.parseInt(input.nextLine());
		}

		System.out.println("\nThe program ends now. Bye!");
		input.close();
	}

	private static void displayMenu() {
		String line = "-----------------------------------------------------"
				+ "---------------------------------------------------------------";
		System.out.println(line);
		System.out.print(" 0 = Quit | 1 = List accounts | 2 = Add an account | "
				+ "3 = Deposit money | 4 = Withdraw money | 5 = Delete an account \n");
		System.out.println(line);
		System.out.print("Enter your choice: ");
	}

	// *** NB! Edit only the methods below. DO NOT add any other methods! ***

	private static void listAccounts() {
		DecimalFormat df = new DecimalFormat("##.00");
		System.out.print("\n*** Account list ***\n");

		String output = "";

		for (Account list : accountList) {
			output += "Number: " + list.getAccountNumber() + " | Balance: " + df.format(list.getBalance()) + "\n";
		}

		System.out.print(output);

		return;
	}

	private static void addAccount() {
		System.out.print("\n*** Add an account ***\n");
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		System.out.print("Enter account number: ");
		String inputString = input.nextLine();

		for (Account check : accountList) {
			if (inputString.matches(check.getAccountNumber())) {
				System.out.print("\nAccount not created. Account " + inputString + " exists already!\n");
				return;
			}
		}

		accountList.add(new Account(inputString));

		System.out.println("\nAccount created successfully!");

		return;

	}

	// Finds an account in accountList by given account number.
	// Returns either a reference to the account object
	// OR null if the account is not found in accountList.
	private static Account findAccount(String accountNumber) {
		Account myAccount = null;

		for (Account runAccount : accountList) {
			if ((runAccount.getAccountNumber()).matches(accountNumber)) {
				myAccount = runAccount;
			}
		}

		return myAccount;
	}

	private static void depositMoney() {
		System.out.print("\n*** Deposit money to an account ***\n");
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		System.out.print("Enter account number: ");
		String inputAccount = input.nextLine();

		Account foundAccount = findAccount(inputAccount);

		if (foundAccount == null) {
			System.out.print("\nAccount " + inputAccount + " does not exist!\n");
			return;
		}

		System.out.print("Enter the amount to be deposited: ");
		double depositAmount = Double.parseDouble(input.nextLine());

		if (depositAmount < 0) {
			System.out.print("\nCannot deposit a negative amount!\n");
			return;
		}

		foundAccount.deposit(depositAmount);

		System.out.print("\nDeposit completed successfully!\n");

		return;
	}

	private static void withdrawMoney() {
		System.out.print("\n*** Withdraw money from an account ***\n");
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		System.out.print("Enter account number: ");
		String inputAccount = input.nextLine();

		Account foundAccount = findAccount(inputAccount);

		if (foundAccount == null) {
			System.out.print("\nAccount " + inputAccount + " does not exist!\n");
			return;
		}

		System.out.print("Enter the amount to be withdrawn: ");
		double withdrawAmount = Double.parseDouble(input.nextLine());

		if (withdrawAmount < 0) {
			System.out.print("\nCannot withdraw a negative amount!\n");
			return;
		}

		if (foundAccount.withdraw(withdrawAmount)) {
			System.out.print("\nWithdrawal completed successfully!\n");
			return;
		}

		System.out.print("\nWithdrawal not completed. Available balance is too low.\n");
		return;

	}

	private static void deleteAccount() {
		System.out.print("\n*** Delete an account ***\n");
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		System.out.print("Enter account number: ");
		String inputAccount = input.nextLine();

		Account foundAccount = findAccount(inputAccount);

		if (foundAccount == null) {
			System.out.print("\nNothing deleted. Account " + inputAccount + " does not exist!\n");
			return;
		}

		accountList.remove(foundAccount);

		System.out.print("\nAccount deleted successfully!\n");

		return;

	}
}
// End
