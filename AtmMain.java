package Employ;

import java.util.Scanner;

public class AtmMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter initial balance: ");
		double initialBalance = sc.nextDouble();

		Account account;
		System.out.println("Select account type:");
		System.out.println("1. Savings");
		System.out.println("2. Current");
		int choice = sc.nextInt();

		switch (choice) {
		case 1:
			account = new Savings(initialBalance);
			break;
		case 2:
			account = new Current(initialBalance);
			break;
		default:
			System.out.println("Invalid choice");
			return;
		}

		System.out.println("1. Withdraw");
		System.out.println("2. Deposit");
		System.out.println("3. Check Balance");
		int action = sc.nextInt();

		switch (action) {
		case 1:
			System.out.print("Enter withdrawal amount: ");
			double withdrawalAmount = sc.nextDouble();
			account.withdraw(withdrawalAmount);
			break;
		case 2:
			System.out.print("Enter deposit amount: ");
			double depositAmount = sc.nextDouble();
			account.deposit(depositAmount);
			break;
		case 3:
			System.out.println("Balance: " + account.getBalance());
			break;
		default:
			System.out.println("Invalid action");
		}
	}

	

}
