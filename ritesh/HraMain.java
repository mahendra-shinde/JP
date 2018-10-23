package com.darshan;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.List;
import java.util.Scanner;

public class HraMain {

    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
    //System.out.println("Enter the Number to select the operation!");
    while (true) {
        displayMenu();
        System.out.println("Enter the Number to select the operation!");
        String value = scan.next();

        switch (value) {
            case "1":
                System.out.println("Add Employee Name");
                break;
            case "2":
                System.out.println("Please enter Employee ID ");
                break;
            case "3":
                System.out.println("Search Employee by Name");
                break;
            case "4":
                System.out.println("Get List of Employees");
                break;
            case "5":
                System.out.println("Exit");
                break;    
            default:
                System.out.println("Please enter valid number mentioned in the Display Menu");
        }

    }

}

    public static void displayMenu(){
        System.out.println("Display the Menu");
        System.out.println("1. Employee Name");
        System.out.println("2. Employee ID");
        System.out.println("3. Employee Designation");
        System.out.println("4. Employee Joining Date");
        System.out.println("5. Exit");
    }




}
