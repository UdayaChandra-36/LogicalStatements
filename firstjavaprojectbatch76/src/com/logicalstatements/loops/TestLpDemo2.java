package com.logicalstatements.loops;
import java.util.Scanner;
public class TestLpDemo2 {
public static void main(String[]args) {
	
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	
		
		
		findFactors(n);
	
	
}
static void findFactors(int n){
	System.out.println("Prime factors called !");
	for(int i = 1; i <= n/2; i++) {
 if(n % i == 0) {
	 System.out.println(i + " ");
 }
	
}
}
}
