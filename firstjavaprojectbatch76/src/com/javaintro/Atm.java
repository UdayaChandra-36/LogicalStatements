package com.javaintro;

public class Atm {
	static String Bank_Name = "HDFC";
	static long acc_no = 201265348215L;
	{
		acc_no++;
	}
	int amount;
	int balance = 5000;

	void deposit(double amount) {
		balance += amount;
	}

	void withdraw(double amount) {
		balance -= amount;
	}

	void Checkbalance() {
		System.out.println("Account number : " + acc_no);
		System.out.println("balance : " + balance);
		System.out.println("Bank name" + Bank_Name);
	}

	public static void main(String[] args) {
		Atm acc1 = new Atm();
		acc1.balance = 20000;
		acc1.deposit(1000);
		acc1.withdraw(2000);
		acc1.Checkbalance();
		Atm acc2 = new Atm();
		acc2.balance = 50000;
		acc2.deposit(4000);
		acc2.withdraw(2000);
		acc2.Checkbalance();

	}
}
