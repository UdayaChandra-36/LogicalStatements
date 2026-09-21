package com.logicalstatements.loops;
import java.util.Scanner;
public class TestLpDemo9 {

	public static void main(String[] args) {
		System.out.println("Main method started !!");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers : ");
		int n = sc.nextInt();
		int sum = 0;
		for(int i = 0; i < n; n = n / 10) {
			int r = n % 10;
			sum = sum + r;
		}
		System.out.println(sum);

	}

}
