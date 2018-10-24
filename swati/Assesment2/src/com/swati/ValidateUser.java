package com.swati;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateUser {

//Method to print message when incorrect user name
    public static String incorrectUserNameMessage(){
        return "User Name must contains min 6 and max 12 characters. It should not contain spaces";
    }
    //Method to print message if incorrect password is entered
    public static String incorrectPasswordMessage(){
        return "Password should be 8 characters long and must contain a digit and special character";
    }


    //Method to validate username
    public static void validateUserName(String userName) throws UserDefinedException{
        try {
            if(userName.length()>=6 && userName.length()>=12){
                throw new UserDefinedException("IllegalCredentialException: "+incorrectUserNameMessage());
            }
            char[] chars = userName.toCharArray();
            for(int i=0; i<chars.length; i++)
            if (Character.isSpaceChar(chars[i])){
                throw new UserDefinedException("IllegalCredentialException: "+incorrectUserNameMessage());
            }

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }


    //Method to validate Password
        public static void validatePassword(String password) throws UserDefinedException {
            try{
                if (password.length() > 8){
                    throw new UserDefinedException("IllegalCredentialException: "+incorrectPasswordMessage());
                }
                int theCount = 0;
                String specialChars = "/*!@#$%^&*(){}_[]|?/<>,.";
                for (int i = 0; i < password.length(); i++) {
                    if (specialChars.contains(password.substring(i, 1))) {
                        theCount++;
                    }
                    throw new UserDefinedException("IllegalCredentialException: "+incorrectPasswordMessage());

                }

            }catch (Exception e){
                System.out.println(e.getMessage());



        }
        }
    }

