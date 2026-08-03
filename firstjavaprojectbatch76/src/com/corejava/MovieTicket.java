package com.corejava;

public class MovieTicket {
String movie_name;
int seat_number;
String booking_status;
static String theatre_name = "Sai ranga";
boolean stores;
void book_ticket() {
	System.out.println("bookin status : " + booking_status);
}
void cancel_ticket() {
	System.out.println("bookin status : " + booking_status);
}
void display_ticket_details() {
	System.out.println("Ticket_stored is : " + stores);
	System.out.println("Movie name is : " + movie_name);
	System.out.println("seat_number is : " + seat_number);
	System.out.println("Theatre_name is : " + theatre_name);
}
public static void main(String[]args) {
	MovieTicket t1 = new MovieTicket();
	t1.movie_name = "Spider_man";
	t1.seat_number = 18;
	t1.booking_status = "Reserved";
	t1.stores = true;
	t1.book_ticket();
	t1.display_ticket_details();
}

}
