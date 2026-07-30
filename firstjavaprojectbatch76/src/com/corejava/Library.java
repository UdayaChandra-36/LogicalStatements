package com.corejava;

public class Library {
static String librarian_name = "Gautam";
static String Library_name = "Grandhalayam";
int bookId;
String booktitle;
String author_name;
int available_copies;


void book_details() {
	available_copies -= 1;
	System.out.println("Librarian Name is : " + librarian_name);
	System.out.println("Library name is : " + Library_name);
	System.out.println("Book Id is : " + bookId);
	System.out.println("Book title is : " + booktitle);
	System.out.println("Author name is : " + author_name);
	System.out.println("available copies : " + available_copies);
}

public static void main(String[]args) {
	Library s1 = new Library();
	s1.bookId = 102;
	s1.booktitle = "Talk";
	s1.author_name = "Udaya";
	s1.available_copies = 21;
	s1.book_details();

	System.out.println("********************************");
	Library s2 = new Library();
	librarian_name = "james";
	Library_name = "The british Library";
	s2.bookId = 102;
	s2.booktitle = "Manifest";
	s2.author_name = "Roxie Nafusi";
	s2.available_copies = 18;
	s2.book_details();
}
}
