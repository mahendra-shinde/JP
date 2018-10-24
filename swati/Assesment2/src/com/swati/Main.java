package com.swati;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int choice;
        do {
            System.out.println("Select Options:");
            System.out.println("1. Enter User Name");
            System.out.println("2. Enter Password");
            System.out.println("3. Exit");
            Scanner scanner = new Scanner(System.in);

            choice = scanner.nextInt();

            switch (choice) {
                case 1: {

                    System.out.println("Enter User Name");
                    Scanner scanner1 = new Scanner(System.in);
                    String userName = scanner1.nextLine();
                    try {
                        ValidateUser.validateUserName(userName);

                    }catch (UserDefinedException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                }

                case 2: {
                    System.out.println("Enter Password");
                    Scanner scanner2 = new Scanner(System.in);
                    String password = scanner2.nextLine();
                    try{
                    ValidateUser.validatePassword(password);
                    } catch (UserDefinedException e) {
                    System.out.println(e.getMessage());
                }

                    break;

                }
                case 3: {
                    System.out.println("You have opted to exit");
                    break;
                }
                default: {
                    System.out.println("Please select correct options!!!");
                    break;
                }

            }

        } while (choice != 3);
    }
}
