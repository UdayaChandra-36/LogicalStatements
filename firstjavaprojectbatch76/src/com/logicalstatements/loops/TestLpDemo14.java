package com.logicalstatements.loops;

import java.util.Scanner;

//WAP to convert decimal number to binary number

//input : 10
//output : 1010
public class TestLpDemo14 {

	public static void main(String[] args) {
		
System.out.println("Main method started !!");
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number");
int n = sc.nextInt();

System.out.println("Main method ended!!");
int r = 0;
String s = "";

while(n > 0) {
	r = n % 2;
	n = n / 2;
	s = r + s;
}
System.out.println("The converted binary number is : " + s);

}
	}
