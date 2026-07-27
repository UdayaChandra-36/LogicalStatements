package com.javaintro;

public class Employee {
	int emp_id;
	String emp_name;
	static int org_id = 44;
	static String org_name = "Vcube";

	//local variables is created here and can be accessed directly!!
	public static void main(String[] args) {
		int org_id = 555;
	String org_name = "VSS";
		//local variable
		int age = 21;
		System.out.println(age);//compile time error
		Employee sr = new Employee();
		
		System.out.println(org_id);
		System.out.println(org_name);
		
		System.out.println(Employee.org_id);
		System.out.println(Employee.org_name);
		
		System.out.println(sr.emp_id);
		System.out.println(sr.emp_name);
		
	}

}
