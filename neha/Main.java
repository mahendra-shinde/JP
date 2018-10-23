package com.neha;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        BookDAOImpl bi = new BookDAOImpl();
        int choice = 0;
        Scanner scanner = new Scanner(System.in);

        do{
            System.out.println("Select Options:");
            System.out.println("1. Add Book");
            System.out.println("2. Search by BookId");
            System.out.println("3. Search by Author");
            System.out.println("4. Exit");
            choice = scanner.nextInt();
            switch (choice){
                case 1:{

                    System.out.println("How many books you want to add:");
                    int count = scanner.nextInt();
                    for(int i=0; i<count;i++) {
                        System.out.println("Enter BookId:");
                        int bookId = scanner.nextInt();
                        System.out.println("Enter Title:");
                        String title = scanner.next();
                        System.out.println("Enter Author:");
                        String author = scanner.next();
                        System.out.println("Enter Price:");
                        float price = scanner.nextFloat();
                        Book book = new Book(bookId, title, author, price);
                        bi.add(book);
                    }
                    break;
                }
                case 2:{
                    System.out.println("Enter BookId to search:");

                    int bookID = scanner.nextInt();
                    Book book = bi.findById(bookID);
                    System.out.println(book.toString());
                    break;
                }
                case 3:{
                    System.out.println("Enter Author to search books:");
                    String author = scanner.next();
                    List<Book> books = bi.findByAuthor(author);
                    Iterator it = books.iterator();
                    while(it.hasNext()){
                        System.out.println(it.next());
                    }
                    break;
                }

                case 4:{
                        break;
                }
                default:{
                    System.out.println("Please select correct options!!!");
                    break;
                }
            }

        }while(choice !=4);


    }
}
