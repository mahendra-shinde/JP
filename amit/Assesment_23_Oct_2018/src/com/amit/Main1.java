package com.amit;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

public class Main1 {
    public static void main(String[] args) {

        BookDAOImpl boo = new BookDAOImpl();

        boo.add(new Book(123,"C++","Amit",250.60f));
        boo.add(new Book(120,"C","tyer",2580.60f));
        boo.add(new Book(115,"Java","ghf",240.60f));
        boo.add(new Book(116,"SQL","jhk",220.60f));
        boo.add(new Book(111,"ABC","fdgsd",230.60f));


        InputStreamReader re = new InputStreamReader(System.in);

        BufferedReader br = new BufferedReader(re);

        
        try{

            System.out.println("Enter the author name to be searched");

            List autorname =boo.findByAuthor(br.readLine());

            for (int i=0;i<autorname.size();i++){

                System.out.println(autorname.get(i));
            }

            System.out.println("Enter the book id to be searched");

        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }


        //InputStreamReader re1 = new InputStreamReader(System.in);

        //BufferedReader br1 = new BufferedReader(re1);
        try{

            Book bookid =boo.findById(Integer.parseInt(br1.readLine()));


            System.out.println("Author: "+bookid.getAuthor()+", title: "+bookid.getTitle()+" price:"+bookid.getPrice());


        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }







    }
}