package com.corejava;

public class Restaurant {
    int table_number;
    int seats;
    String reserved;
    static String restaurant_name = "Gismat arabic mandi";
    boolean cancel_reservation;
    void reserve_table() {
    	System.out.println("Reserve_table : " + reserved);
    	
    }
    void cancel_reservation() {
    	System.out.println("Cancel_reservation : " + cancel_reservation);
    	
    }
    
    void display_table() {
    	System.out.println(restaurant_name);
    	System.out.println("Table number is : " + table_number);
    	System.out.println("seats : " + seats);
    	
    	
    }
    
    public static void main(String[] args) {
    	Restaurant s1 = new Restaurant();
    	s1.seats = 6;
    	s1.table_number = 2;
    	s1.reserved = "Reserved";
    	s1.cancel_reservation = false;
    	s1.display_table();
    	s1.reserve_table();
    	s1.cancel_reservation();
    	System.out.println("*****************************************");
    	
    	Restaurant s2 = new Restaurant();
    	s2.restaurant_name = "Mandi@jntu";
    	s2.seats = 2;
    	s2.table_number = 4;
    	s2.reserved = "Reserved";
    	s2.cancel_reservation = true;
    	s2.display_table();
    	s2.reserve_table();
    	s2.cancel_reservation();
    }
 
}
