package com.javaintro;

public class TestDemo1 {
	static int a = 10;
	
	static {
  System.out.println("Static2" + a);
	}
	
public static void main(String[]args) {
 System.out.println("Main method Started!" + a);
}
//static block
static {
	System.out.println("Static started");
}
}
