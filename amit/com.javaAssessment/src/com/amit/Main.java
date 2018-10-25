package com.amit;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        UserManager d1 = new UserManager();

        Scanner sc = new Scanner(System.in);

         d1.add(new User("Ashish","pass@12245","Admin",true));
         d1.add(new User("Anish","My$pass123","User",true));
         d1.add(new User("Alok","$$xyz$$12345","User",true));
         d1.add(new User("Aditi","Opps_forgot_1","Userge",true));

        System.out.println("Enter Your input using your keyboard");
        System.out.println("Enter :1: To Login ");
        System.out.println("Enter :2: To print all user details ");
        System.out.println("Enter :3: To search users with userid");
        System.out.println("Enter :4: To Exit");

       /* Modify the solution of [Q2] to include verifying user credentials [after validating them] using
“UserManager” class.
        i. After Validating User & Password, find user name in “UserManager”
        ii. If found, match the password with one stored in “UserManager”
        iii. If found display message : Login Successful.
        iv. Display appropriate Error message whenever required.*/

        while (true) {

            String inp = sc.nextLine().trim();

            // Q2 Write a code to validate user name and password [Use Scanner for Input].

            //takes input from user
            if (inp.equalsIgnoreCase("1")) {

                //Username cannot contain a space
                System.out.println("Enter UserName to Login");
                String ruserid = sc.nextLine().trim();


                System.out.println("Enter Password to Login");
                String rpass = sc.nextLine().trim();


                String vuserid = d1.validateUserId(ruserid);
                String vpass = d1.validatePass(rpass);

                if (vuserid.equalsIgnoreCase("true") && vpass.equalsIgnoreCase("true")) {
                    System.out.println("Validation Pass - Login Success");
                } else {

                    System.out.println("Incorrect Credentials - Please contact support team ");
                }

            }
            if (inp.equalsIgnoreCase("2")) {
                ///System.out.println("entered");
                d1.ListAll();

            }

            if (inp.equalsIgnoreCase("3")) {
                System.out.println("Enter Userid to be searched");
                String searchUid = sc.nextLine().trim();

                List<userDetails> uso = d1.findByUserId(searchUid);
                for (userDetails a : uso) {

                    System.out.println(a);

                }

            }

            if (inp.equalsIgnoreCase("4")) {

                System.out.println("Exiting.....Thank You...");
                break;
            }

        }

    }
}
