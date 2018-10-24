package com.shaunak;

public class LoginValidation {

    public void userNamevalidation(String userName)
    {
        boolean valid = true;

        if (userName.length() < 6 || userName.length()>12)
        {
            System.out.println("Username should be more than 6 and less than 12 characters in length.");
            valid = false;
        }
        String spaces = " ";
        if (!userName.matches(spaces ))
        {
            System.out.println("Username should not contain spaces.");
            valid = false;
        }
        if (valid)
        {
            System.out.println("USername is valid.");
        }
    }
    public void passwordValidation(String password)
    {
        boolean valid = true;
        String numbers = "(.*[0-9].*)";
        if (!password.matches(numbers ))
        {
            System.out.println("Password should contain atleast one number.");
            valid = false;
        }
        String specialChars = "(.*[,~,!,@,#,$,%,^,&,*,(,),-,_,=,+,[,{,],},|,;,:,<,>,/,?].*$)";
        if (!password.matches(specialChars ))
        {
            System.out.println("Password should contain atleast one special character");
            valid = false;
        }
        String spaces = " ";
        if (!password.matches(spaces ))
        {
            System.out.println("Password should contain atleast one number.");
            valid = false;
        }
        if (valid)
        {
            System.out.println("Password is valid.");
        }
    }

}