package com.mahendra;

import java.util.*;

public class BookDAOImpl implements BookDAO {
private LinkedList<Book> bookList=new LinkedList<>();
	@Override
	public void add(Book book) {
		bookList.add(book);
	}

	@Override
	public Book findById(int bookId) {
		for(Book b : bookList){
			if(b.getBookId()==bookId){
				return b;
			}
		}
		return null;
	}

	@Override
	public List<Book> findByAuthor(String author) {
		List<Book> temp = new ArrayList<>();
		for(Book b : bookList){
			if(b.getAuthor().toLowerCase().contains(author.toLowerCase())){
				temp.add(b);
			}
		}
		return temp;
	}

}
