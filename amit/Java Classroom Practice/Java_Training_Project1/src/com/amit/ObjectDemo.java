package com.amit;

public class ObjectDemo {

    public static void main(String[] args) {

        Account a1 = new Account();

        Account a2 = new Account();

        Account a3 = a1;


        System.out.println("a1 hashcode is "+a1.hashCode());
        System.out.println("a2 hashcode is "+a2.hashCode());
        System.out.println("a3 hashcode is "+a3.hashCode());

        System.out.println("a1 getClass is "+a1.getClass());
        System.out.println("a2 getClass is "+a2.getClass());
        System.out.println("a3 getClass is "+a3.getClass());

        System.out.println("a1 toString is "+a1.toString());
        System.out.println("a2 toString is "+a2.toString());
        System.out.println("a3 toString is "+a3.toString());


    }
}
