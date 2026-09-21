package com.logicalstatements.loops;
import java.util.Scanner;
//WAP that the given number is armstrong number or not
public class TestLpDemo13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		boolean status = isArmstrong(n);
		if(status) {
			System.out.println("The given number is armstrong number");
		}
		else {
			System.out.println(" not a armstrong number");
		}
	}
static boolean isArmstrong(int n) {
	boolean status =  false;
	int sumP = 0;
	int r = 0;
	int temp = n;
	int n1 = n; 
	int digitsCount = 0;
	
	while(n1 > 0) {
		n1 = n1/10;
		digitsCount++;
	}
	while(n > 0) {
		r = n % 10;
		n = n /10;
		sumP = (int) (sumP + Math.pow(r, digitsCount)); 
		
//sumP = sumP + r * r * r;//only valid for 3 digit armstrong number!!
	}
	if(sumP == temp) {
		status = true;
	}
	return status;	
	}

}
