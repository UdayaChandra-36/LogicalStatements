package com.logicalstatements.loops;
import java.util.Scanner;
public class TestLpDemo6 {
static boolean isPerfect(int n){
	boolean status = false;
	int sum = 0;
	for(int i = 1; i <=n/2 ;i++) {
		if(n % i ==0) {
			sum = sum + i;
		}
	
	}
	if(sum == n) {
		status = true;
	}
	return status;
	
}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		boolean status = isPerfect(n);
		if(status) {
			System.out.println("The given number is perfect");
		}
		else {
			System.out.println("The given number is not perfect");
		}
	}
	

}
