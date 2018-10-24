package com.mahendra;

import java.util.List;
import java.util.Scanner;

public class Main {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        BookDAOImpl bookImpl = new BookDAOImpl();
        String author;
        int bookId ;
        Book b;
        List<Book> listBook ;
        for (int i = 0; i < 5; i++) {
            bookImpl.add(getBookDetails());
        }
        // Display list of books based on author name provided
        System.out.println("Please enter name of author to search for books: ");
        author = scan.next();
        listBook = bookImpl.findByAuthor(author);
        for (Book b1 : listBook) {
            System.out.println(b1);
        }

        // Display list of books based on book id provided
        System.out.println("Please enter book id to search for book: ");
        bookId = scan.nextInt();
        b = bookImpl.findById(bookId);
        if(b!=null) {
            System.out.println(b);
        }else{
            System.out.println("No Book exists with id:" + bookId);
        }

    }

    private static Book getBookDetails() {
        Book b;
        Integer bookId;
        String title;
        String author;
        Float price;

        System.out.println("Please enter Book Id: ");
        bookId = scan.nextInt();
        System.out.println("Please enter Book Title: ");
        title = scan.next();//  scan.nextLine();
        System.out.println("Please enter Book Author: ");
        author = scan.next();
        System.out.println("Please enter Book Price: ");
        price = scan.nextFloat();

        b = new Book(bookId, title, author, price);
        System.out.println(b.toString());
        return b;
    }
}
