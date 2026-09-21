package com.logicalstatements.loops;
import java.util.Scanner;
public class TestLpDemo10 {

	public static void main(String[] args) {
		System.out.println("Main method started !!");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n <= 100) {
			System.out.println(n);
			n++;
		}

	}

}
