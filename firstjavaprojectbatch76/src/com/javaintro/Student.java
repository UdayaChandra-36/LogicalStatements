package com.javaintro;

public class Student {
	static String college_name = "K L University";

	int Student_id;
	String Student_name;
	int English_marks;
	int Telugu_marks;
	int Hindi_marks;
	int Total_marks;
	double Percentage;

	void calculate_total() {

		Total_marks = English_marks + Telugu_marks + Hindi_marks;
		System.out.println("Total Student Marks is: " + Total_marks);
	}

	void calculate_percentage() {
		Percentage = (Total_marks % 100);
		System.out.println("Percentage is : " + Percentage);
	}
	
	void display() {
		System.out.println("College Name is : " + college_name);
		System.out.println("Student_id is : " + Student_id);
		System.out.println("Student name is : " + Student_name);
		
	}

	public static void main(String[] args) {
		System.out.println("***********Student1 Info**************");
		Student s1 = new Student();
		s1.Student_id = 101;
		s1.Student_name = "Udaya Chandra";
		s1.English_marks = 60;
		s1.Telugu_marks = 40;
		s1.Hindi_marks = 60;
		s1.display();
		s1.calculate_total();
		s1.calculate_percentage();
		System.out.println("**********end**************");

		Student s2 = new Student();
		System.out.println("*********Student2 Info**************");
		s2.Student_id = 202;
		s2.Student_name = "Narasimha";
		s2.English_marks = 100;
		s2.Telugu_marks = 80;
		s2.Hindi_marks = 90;
		s2.display();
		s2.calculate_total();
		s2.calculate_percentage();
		System.out.println("**********end**************");

	}
}
