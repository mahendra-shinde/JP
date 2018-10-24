package com.amit;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //String ruserid=null;
        //String rpass=null;
        UserManager d1 = new UserManager();
                d1.add(new User("Ashish","pass@12245","Admin",true));
         d1.add(new User("Anish","My$pass123","User",true));
         d1.add(new User("Alok","$$xyz$$12345","User",true));
         d1.add(new User("Aditi","Opps_forgot_1","Userge",true));

        userValidations uv = new userValidations();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your input through keyboard");
        System.out.println("Enter :1: To Login ");
        System.out.println("Enter :2: To print user details ");
        System.out.println("Enter :3: To Exit");
        String inp = sc.nextLine().trim();
        if(inp.equalsIgnoreCase("1")){

            System.out.println("Enter UserName to vaidate");
            String ruserid = sc.nextLine().trim();

            System.out.println("Enter Password to vaidate");
            String rpass = sc.nextLine().trim();


            String vuserid = d1.validateUserId(ruserid);
            String vpass = d1.validatePass(rpass);

            //System.out.println(vuserid);
            //System.out.println(vpass);
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
            System.out.println("Thank You");

        }














    }
}
