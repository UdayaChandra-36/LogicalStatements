package com.javaintro;

public class StateBank {
	String AccountHolderName;
	int BankBalance;
	
	static String IFSCcode = "SBI006";
	long acc_no = 62310100120L;
	{
		acc_no++;
		
	}
	void show(){
		System.out.println("Acc holder name : " + AccountHolderName);
		System.out.println("Acc no : " + acc_no);
		System.out.println("IFSC code :" + IFSCcode);
		System.out.println("Balance :" + BankBalance);
	}
public static void main(String[]args) {
	StateBank b = new StateBank();
	 b.AccountHolderName = "Udaya Chandra";
	 b.BankBalance= 3200;
	 b.show();
}
}
