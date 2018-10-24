package com.zak;

import java.util.*;
import java.lang.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter User Name: ");
        String username = sc.nextLine();

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter Password: ");
        String password = sc.nextLine();

        Logic logic = new Logic(username, password);


    }
}