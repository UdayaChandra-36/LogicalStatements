package com.javaintro;

public class TestDemo4 {
	
static TestDemo4 t4 = new TestDemo4();

static {
	System.out.println("Static1 called");
}

{
	System.out.println("Instance1 called");
	//TestDemo4 t4 = new TestDemo4();
}
public static void main(String[]args) {
	System.out.println("Main method started");
	
	System.out.println("Main method ended");
}
}
