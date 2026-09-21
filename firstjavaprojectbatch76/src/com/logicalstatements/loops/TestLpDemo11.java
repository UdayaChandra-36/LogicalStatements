package com.logicalstatements.loops;

import java.util.Scanner;
public class TestLpDemo11 {

	public static void main(String[] args) {
		System.out.println("Main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
        int n = sc.nextInt();
        
      int sum = sumOfdigits(n);
      int count = digitsCount( n);
      System.out.println("Count of the given digits is : " + count);
      System.out.println("Sum of all the digits is : " + sum);
        
	}
	static int digitsCount(int n) {
		int count = 0;
		while(n > 0) {
			n = n /10;
			count++;
		}
		return count;
	}
	static int sumOfdigits(int n) {
		int sum = 0;
		int r = 0;
		while(n > 0) {
			r = n % 10;
			n = n /10;
			sum = sum + r;
			
		}
		return sum;
	}

}
