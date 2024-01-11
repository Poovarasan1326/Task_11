package Task_10;

public class Account {

	// Data member
	private double balance;

	// No-argument constructor
	public Account() {
		this.balance = 0.0; // Default balance is set to 0.0
	}

	// Two-argument constructor
	public Account(double initialBalance) {
		this.balance = initialBalance;
	}

	// Method to withdraw from the account
	public void withdraw(double amount) {
		if (amount > 0 && amount <= balance) {
			balance -= amount;
			System.out.println("Withdrawal successful. Remaining balance: " + balance);
		} else {
			System.out.println("Invalid withdrawal amount or insufficient funds.");
		}
	}

	// Method to deposit into the account
	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			System.out.println("Deposit successful. New balance: $" + balance);
		} else {
			System.out.println("Invalid deposit amount.");
		}
	}

	public static void main(String[] args) {
		// Creating an instance of the Account class using the no-argument constructor
		Account account1 = new Account();
		System.out.println("Initial balance of account1: " + account1.balance);

		// Creating an instance of the Account class using the two-argument constructor
		Account account2 = new Account(1000.0); // Setting initial balance to $1000.0
		System.out.println("Initial balance of account2: " + account2.balance);

		// Withdrawal from account2
		account2.withdraw(200.0);

		// Deposit into account1
		account1.deposit(800.0);
	}
}
