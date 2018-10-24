package com.shaunak;

import java.util.List;

public interface BookDAO {
    void add(Book book);
    Book findById(int bookId);
    List<Book> findByAuthor(String author);
}