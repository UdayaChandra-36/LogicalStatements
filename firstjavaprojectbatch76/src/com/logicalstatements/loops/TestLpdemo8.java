package com.logicalstatements.loops;
import java.util.Scanner;
//WAP to print 0 to 100 prime numbers
public class TestLpdemo8 {
	static boolean checkPrime(int n) {
		boolean status = true;
		if(n == 0 || n == 1) {
			return false;
		}
		for(int i = 2; i <= n/2 ; i++) {
			if(n % i == 0) {
				status = false;
				break;
			}
		}
		return status;
	}
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter how many prime numbers : ");
	int n = sc.nextInt();
	for(int i = 0; i <= n; i++) {
		if(checkPrime(i)) {
			System.out.println(i);
		}
	}
		
}
}
