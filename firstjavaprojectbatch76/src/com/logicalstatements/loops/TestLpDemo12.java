package com.logicalstatements.loops;
import java.util.Scanner;
public class TestLpDemo12 {

	public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter a number : ");
     int n = sc.nextInt();
    
     int rev = reverseNumber(n);
    System.out.println("The reverse number is : " +  rev);


	if(n == rev) {
		System.out.println("The given number is a palindrome");
	}
	else {
		System.out.println("The given number is not a palindrome");
	}
	}
	private static int reverseNumber(int n) {
		 int r = 0;
		 int rev = 0;
		 while(n > 0) {
	    	 r = n % 10;
	    	 n = n / 10;
	    	 rev = rev * 10 + r;
	     }
		return rev;
	}

}
