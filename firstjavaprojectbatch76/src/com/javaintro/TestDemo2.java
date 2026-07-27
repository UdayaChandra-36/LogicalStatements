package com.javaintro;

//method info
public class TestDemo2 {
// instance method
	void hello() {
		System.out.println("Hello guys, Have a nice day");
	}

//static method

	static void welcome() {
		System.out.println("Welcome to java");
	}

//static main method

	public static void main(String[] args) {
		System.out.println("Main Method started");
		//calling the method by using object preference variable
		TestDemo2 t = new TestDemo2();
		t.hello();
		//calling the static method
		welcome();

		System.out.println("Main method ended");

	}

}
