package com.javaintro;

public class TestDemo6 {
	@Override
		protected void finalize() throws Throwable {
			System.out.println("Finalize method called");
		}

public static void main(String[]args) {
	TestDemo6 a1 = new TestDemo6();
	TestDemo6 a2 = new TestDemo6();
	System.out.println(a1);
	System.out.println(a1.hashCode());
	System.out.println(a1);
	System.out.println(a2.hashCode());
	int i = 0x1dbd16a6;
	System.out.println(i);
	
	//nullifying the objects
	a1 = null;
	a2 = null;
	System.gc();

	
}	
}
