package Employ;

public class Savings extends Account {
	
	public Savings(double balance) {
		super(balance);
	}

	@Override
	void withdraw(double amount) {
		if (amount > 0 && amount <= balance - 1000) {
			balance -= amount;
			System.out.println(amount + " withdrawn from current account");
		} else {
			System.out.println("Insufficient balance");
		}
	}

	@Override
	void deposit(double amount) {
		if (amount > 100) {
			balance += amount;
			System.out.println(amount + " deposit to current account");
		} else {
			System.out.println("Enter valid amount");
		}
	}

}
