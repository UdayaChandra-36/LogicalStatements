package com.logicalstatements.loops;
import java.util.Scanner;

//Factorial of a given number using recursion
public class TestLpDemo4 {
static int fact(int n) {
	if(n == 0 || n == 1) {
		return 1;
	}
	return n * fact (n - 1);
	
	
}
	public static void main(String[] args) {
		System.out.println("Main method started!!");
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n =sc.nextInt();
		long factorialNumber = fact(n);
		System.out.println("Factorial number is : " + factorialNumber);
		
	}
	

	}


