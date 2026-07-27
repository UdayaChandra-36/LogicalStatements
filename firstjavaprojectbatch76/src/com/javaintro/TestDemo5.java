package com.javaintro;

public class TestDemo5 {

	void hello() {
		System.out.println(Thread.currentThread());
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
	}
	
	public static void main(String[] args) {
		TestDemo5 t = new TestDemo5 ();
    t.hello();
    System.out.println(Thread.currentThread());
	}

}
