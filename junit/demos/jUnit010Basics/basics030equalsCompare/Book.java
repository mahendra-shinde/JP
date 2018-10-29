package com.jUnit010Basics.basics030equalsCompare;

public class Book implements Comparable<Book> {
	private int bookId;
	private String bookName;
	private float bookPrice;
	
	public Book(int bookId, String bookName, float bookPrice) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookPrice = bookPrice;
	}

	@Override
	public int compareTo(Book book) {
		return (this.bookId<book.bookId)?-1:(this.bookId>book.bookId)?1:0;
	}
	
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", bookPrice=" + bookPrice + "]";
	}
}
