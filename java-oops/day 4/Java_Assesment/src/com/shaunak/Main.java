package com.shaunak;

import java.util.HashMap;
import java.util.*;

public class Main {

   public static void main(String[] args) {
        UserManager userDao = new UserManager();

       String username,password;
       Scanner in= new Scanner(System.in);
       boolean hasdigit=false;
       boolean hassp=false;
       boolean valid=true;


       while (true) {
           System.out.println("\nEnter one of the menu options");
           System.out.println("Enter A to Validate user");
           System.out.println("Enter B to find user by name");
           System.out.println("Enter C to display all users");
           System.out.println("Enter D to login with existing id ");
           System.out.println("Enter Q to QUIT ");
           Scanner scanner = new Scanner(System.in);
           String choice = scanner.next();

           switch (choice) {
               // case statements
               // values must be of same type of expression
               case "A":
                   // User Id requirement validation
                   System.out.println("Please enter username: - ");
                   username= in.nextLine();
                   System.out.println("Please enter password: - ");
                   password= in.nextLine();
                    LoginValidation lv = new LoginValidation();
                   try {

                       if (username.length() < 6 || username.length() > 12) {
                           System.out.println("Username should be more than 6 and less than 12 characters in length.");
                           valid = false;
                       }
                       String spaces = " ";
                       if (username.matches(spaces)) {
                           System.out.println("Username should not contain spaces.");
                           valid = false;
                       }

                       String numbers = "(.*[0-9].*)";
                       if (!password.matches(numbers)) {
                           System.out.println("Password should contain atleast one number.");
                           valid = false;
                       }
                       String specialChars = "(.*[,~,!,@,#,$,%,^,&,*,(,),-,_,=,+,[,{,],},|,;,:,<,>,/,?].*$)";
                       if (!password.matches(specialChars)) {
                           System.out.println("Password should contain atleast one special character");
                           valid = false;
                       }

                       User user = userDao.find(username);
                       user = userDao.find(username);
                       System.out.println("3. Found user with id: " + username);

                       if (user.getPassWord().equals(password))
                       {
                           System.out.println("Login Successfull");
                       }
                       else
                       {
                           throw new IllegalCredentialsException("Password Does Not Match", username);
                       }
                   } catch (IllegalCredentialsException e) {

                   System.out.println("3. Unable to find user with: " + username);
                   System.out.println(e.getUserId()+ e.getMessage());
               }{

                   }
                   break;

               case "B":

                   System.out.println("Please enter username: - ");
                   username= in.nextLine();
                 try{
                   User user = userDao.find(username);
                   user = userDao.find(username);
                   System.out.println("3. Found user with id: " + username);
           } catch (IllegalCredentialsException e) {

               System.out.println("3. Unable to find user with: " + username);
               System.out.println(e.getUserId()+ e.getMessage());
           }

           break;

               case "C":
                   //This will allow user to Print All records.
                   HashMap<String, User> databaseUser = new HashMap<String, User>();
                       databaseUser = userDao.getAll();
                       for (String username1 : databaseUser.keySet()) {
                           System.out.println(databaseUser.get(username1));
                       }
                       //System.out.println("3. Found user with id: " + username+" ---->"+ databaseUser);
                   break;
               case "D":
                   System.out.println("Please enter username: - ");
                   username= in.nextLine();
                   System.out.println("Please enter password: - ");
                   password= in.nextLine();
                   try{
                       User user = userDao.find(username);
                       user = userDao.find(username);
                       System.out.println("3. Found user with id: " + username);

                       if (user.getPassWord().equals(password))
                       {
                           System.out.println("Login Successfull");
                       }
                       else
                       {
                           throw new IllegalCredentialsException("Password Does Not Match", username);
                       }
                   } catch (IllegalCredentialsException e) {

                       System.out.println("3. Unable to find user with: " + username);
                       System.out.println(e.getUserId()+" "+ e.getMessage());
                   }

                   break;
               case "Q":
                   System.out.println("Exit Selected. Closing");
                   System.exit(0);
                   break;
           }


       }
    }
}