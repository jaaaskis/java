package JavaBankApplication;

// ************************************************************************
// Account.java	  Template created on15.9.2016
// - The class for Account objects
// ************************************************************************
class Account {
	// Fields
	private String accountNumber;
	private double balance;

	// Constructor
	public Account(String accountNumber) {
		this.accountNumber = accountNumber;
		this.balance = 0.00;
	}

	// Methods

	public void deposit(double deposit) {
		this.balance += deposit;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public boolean withdraw(double amount) {

		if ((balance - amount) < 0) {
			return false;
		}
		
		balance -= amount;

		return true;
	}

}
// End