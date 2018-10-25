package com.amit;

import java.sql.SQLOutput;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        UserManager d1 = new UserManager();
                d1.add(new User("Ashish","pass@12245","Admin",true));
         d1.add(new User("Anish","My$pass123","User",true));
         d1.add(new User("Alok","$$xyz$$12345","User",true));
         d1.add(new User("Aditi","Opps_forgot_1","Userge",true));

        userValidations uv = new userValidations();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your input using your keyboard");
        System.out.println("Enter :1: To Login ");
        System.out.println("Enter :2: To print all user details ");
        System.out.println("Enter :3: To search users with userid");
        System.out.println("Enter :4: To Exit");
        String inp = sc.nextLine().trim();
        if(inp.equalsIgnoreCase("1")){

            System.out.println("Enter UserName to Login");
            String ruserid = sc.nextLine().trim();

            System.out.println("Enter Password to Login");
            String rpass = sc.nextLine().trim();


            String vuserid = d1.validateUserId(ruserid);
            String vpass = d1.validatePass(rpass);

            if (vuserid.equalsIgnoreCase("true") && vpass.equalsIgnoreCase("true")){
                System.out.println("Validation Pass - Login Success");
            }else {

                System.out.println("Incorrect Credentials - Please contact support team ");
            }

            }
        if(inp.equalsIgnoreCase("2")){
            System.out.println("entered");
            d1.ListAll();

        }

        if(inp.equalsIgnoreCase("3")){
            System.out.println("Enter Userid to be searched");
            String searchUid = sc.nextLine().trim();

           List<userDetails> uso = d1.findByName(searchUid);
            for (userDetails a : uso) {

                System.out.println(a);

            }

        }

        if(inp.equalsIgnoreCase("4")){
            System.out.println("Exiting.....Thank You...");

        }














    }
}
