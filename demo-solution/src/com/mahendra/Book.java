package com.mahendra;

public class Book {
	private Integer bookId;
	private String title;
	private String author;
	private Float price;

	public Integer getBookId() {
		return bookId;
	}
	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	public Book(Integer bookId, String title, String author, Float price) {
		this.bookId = bookId;
		this.title = title;
		this.author = author;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", title=" + title + "]";
	}
	
	
}
