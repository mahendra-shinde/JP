package com.amit;

public class StringDemo {

    public static void main(String[] args) {

        String name1 ="Amit"; // Creates new object, cause: no prevoius object found

        String name2="Amit"; // Re-uses previous object

        String name3 = new String("Amit");  // forces new object

        System.out.println(" is name1 and name2 sam? "+ (name1==name2));

        System.out.println(" is name1 and name3 sam? "+ (name1==name3));

        name1 = name1.toUpperCase();
        System.out.println(" is name1 and name2 sam? "+ (name1==name2));

        String temp = name2.toUpperCase();

        System.out.println(name2+ " -->" +temp);






    }
}
