package com.logicalstatements.loops;
import java.util.Scanner;
public class TestLPDemo3 {
	void mathtable(int n1, int n2) {
		for(int i =1; i <= n2; i++) {
			System.out.println(n1 +  "x" + i + "=" + (n1 * i));
		}
	}
	void main(String[] args) {
		System.out.println("Main method Started !!");
		Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number to proceed : ");
	int n1= sc.nextInt();
	System.out.println("Enter a number upto where you want to print : ");
int n2 = sc.nextInt();
mathtable(n1, n2);
	}

}
