package com.mahendra;

public class GenericMain {
    public static void main(String[] args) {
        Printer<Integer> printInt = new Printer<>();
        Printer<String> printString = new Printer<>();

        printInt.print(100);
        printString.print("mahendra");
    }
}
