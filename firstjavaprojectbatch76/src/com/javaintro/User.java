package com.javaintro;

public class User {
	int a = 100;
	
	void hello() {
		System.out.println("Hello");
		//object inside the method
		User U = new User();
	}
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Finalized invoked");
	}

	public static void main(String[] args) {
		User U1 = new User();
		User U2 = new User();
		User U3 = new User();
		
		//Nullifying the objects
		U1 = null;
		
		//Re-assigning the objects
		User U4 = new User();
		U2 = U4;
		
		//Anonymous objects
		//object inside the method also known as local object
		new User().hello();
		
		//Objects Inside methods
		
		System.gc();
		System.out.println(U1);
		System.out.println(U2);
		System.out.println(U3);
		System.out.println(U4);
		
		
   
	}

}
