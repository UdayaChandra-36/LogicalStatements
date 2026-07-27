package com.javaintro;
//Note : JVM provides default values for static and instance data

//whenever the data is same for all objects then we go for static
//static data will not change from object to object where static data is sharable

//whenever the data changes from object to object then will choose instances
//Instance data will change from object to object which creates new copy for every object

public class Cricketer {

	int jerseyno;
	String Cricketername;
	static int countryId;
	static String countryname;

	public static void main(String[] args) {
		// Accessing the static data directly
		countryId = 91;
		countryname = "India";
		System.out.println("Welcome to Indian cricket team Info !");
		System.out.println("*******Object1 Info*******");

// In static area we cannot access the instance area directly

		System.out.println("countryId : " + countryId);
		System.out.println("countryname : " + countryname);

		// LHS = class name reference variable
		// RHS = new is the keyword in java to create object
		// Constructor calling = Cricketer
		// Accessing the instance data by using object reference variable

		Cricketer rohit = new Cricketer();

		// creating an object to access the instance data in static area

		rohit.jerseyno = 45;
		rohit.Cricketername = "Rohit sharma";
		System.out.println(rohit.jerseyno);
		System.out.println(rohit.Cricketername);
		System.out.println("************************");

		System.out.println("**************object2 info****************");
		Cricketer vk = new Cricketer();
		vk.jerseyno = 18;
		vk.Cricketername = "virat kohli";
		System.out.println("countryId : " + countryId);
		System.out.println("countryname : " + countryname);
		System.out.println(vk.jerseyno);
		System.out.println(vk.Cricketername);
		System.out.println("******************************************");
		
		System.out.println("**************object3 info****************");
		Cricketer msd = new Cricketer();
		msd.jerseyno = 07;
		vk.Cricketername = "Mahendra singh dhonii";
		System.out.println("countryId : " + countryId);
		System.out.println("countryname : " + countryname);
		System.out.println(msd.jerseyno);
		System.out.println(msd.Cricketername);
		System.out.println("******************************************");
		
		System.out.println("**************object4 info****************");
		Cricketer bapu = new Cricketer();
		countryId = 92;
		bapu.jerseyno = 20;
		bapu.Cricketername = "AXAR patel";
		System.out.println("countryId : " + countryId);
		System.out.println("countryname : " + countryname);
		System.out.println(bapu.jerseyno);
		System.out.println(bapu.Cricketername);
		System.out.println("******************************************");
		
		System.out.println("**************object5__info****************");
		Cricketer gill = new Cricketer();
		countryId = 91;
		countryname = "Bharath";
		gill.jerseyno = 77;
		gill.Cricketername = "Shubman gill";
		System.out.println("countryId : " + countryId);
		System.out.println("countryname : " + countryname);
		System.out.println(gill.jerseyno);
		System.out.println(gill.Cricketername);
		System.out.println("******************************************");


	}
}
