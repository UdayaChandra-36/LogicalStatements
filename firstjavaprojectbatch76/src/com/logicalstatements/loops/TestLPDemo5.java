package com.logicalstatements.loops;
import java.util.Scanner;
public class TestLPDemo5 {

	
	public static void main(String[] args) {
		System.out.println("Main method started!!");
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n =sc.nextInt();
		long factorialNumber = findFactorial(n);
		System.out.println(factorialNumber);
	}
	
	static long findFactorial(int n) {
		long fact = 1;
		for(int i = n; i >= 1; i--) {
			fact = fact * i;
		}
		
		return fact;
	}
	
	
	
	
	
}
