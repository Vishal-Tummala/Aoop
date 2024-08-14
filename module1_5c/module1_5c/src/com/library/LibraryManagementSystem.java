package com.library;

public class LibraryManagementSystem {
	 public static void main(String[] args) {
	        Library library = new Library();

	        Book book1 = new Book("Java Programming", "James Gosling", "12345");
	        Member member1 = new Member("001", "Alice");

	        library.addBook(book1);
	        library.addMember(member1);

	        boolean isBorrowed = library.borrowBook(book1, member1);
	        System.out.println("Borrowed: " + isBorrowed);

	        boolean isReturned = library.returnBook(book1, member1);
	        System.out.println("Returned: " + isReturned);
	    }
}
