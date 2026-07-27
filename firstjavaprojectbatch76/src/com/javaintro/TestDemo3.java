package com.javaintro;

public class TestDemo3 {

	static void method1() {
		System.out.println("Method1 called");
	}

	static void method2() {
		method1();
		System.out.println("Method2 called");
	}

	void method3() {
		method4();
		System.out.println("Method3 called");
	}

	void method4() {
		method2();
		System.out.println("Method4 called");
	}

	public static void main(String[] args) {
		System.out.println("Main method started");
		TestDemo3 t = new TestDemo3();
		t.method3();
		System.out.println("Main method ended");
	}

}
