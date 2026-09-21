package com.logicalstatements.loops;

import java.util.Scanner;

//WAP to convert decimal number to octal number

public class TestLpDemo15 {

	public static void main(String[] args) {
		System.out.println("Main method started");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		convertdecimaltoOctal(n);
		System.out.println("Main method ended");

	}
	static void convertdecimaltoOctal(int n) {
		int r = 0;
		String s = "";
		while(n > 0) {
			r = n % 8;
			n = n / 8;
			s = r + s;
		}
		System.out.println(s);
		
	}

}
