//Class to execute and verify functionality

package com.ca.app;

import com.ca.dao.UserManagerDAOImpl;
import com.ca.entity.User;
import com.ca.exception.IllegalCredentialsException;
import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        UserManagerDAOImpl userManagerImpl = new UserManagerDAOImpl();

        //Display list post initialization
//        HashMap<String, User> userMap = userManagerImpl.getAll();
//        for (String username : userMap.keySet()) {
//            System.out.println(userMap.get(username).toString());
//        }

        System.out.println("Please enter Username: ");
        String username = scan.nextLine();
        System.out.println("Please enter Password: ");
        String password = scan.nextLine();

        try {
            if ( UserManagerDAOImpl.validateUserName(username) && UserManagerDAOImpl.validatePassword(password) ) {
                User u = userManagerImpl.find(username);
                if ( u != null ) {
                    if ( u.getPassword().equals(password) ) {
                        System.out.println("Login Successful!!!");
                    } else {
                        System.out.println("Invalid Password");
                    }
                } else {
                    System.out.println("User does not exist");
                }
            }
        } catch (IllegalCredentialsException icEx) {
            System.out.println(icEx.getMessage());
            //icEx.printStackTrace();
        }
    }
}
