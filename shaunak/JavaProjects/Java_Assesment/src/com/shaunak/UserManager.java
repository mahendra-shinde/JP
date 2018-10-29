package com.shaunak;


// import org.learn.exception.UserNotFoundException;
// import org.learn.model.User;

import javax.lang.model.util.ElementScanner6;
import java.util.HashMap;
import java.util.Map;

public class UserManager {

    @SuppressWarnings("serial")
    private HashMap<String, User> databaseUser = new HashMap<String, User>() {
        {
            put("Ashish", new User("Ashish", "pass@12245", "Admin", true));
            put("Anish", new User("Anish", "My$pass123", "User", true));
            put("Alok", new User("Alok", "$$xyz$$12345", "User", true));
            put("Aditi", new User("Aditi", "Opps_forgot_1", "User", true));
        }
    };
// Find User by User Name
    public User find(String username) {
        if (!isUserExists(username)){
            throw new IllegalCredentialsException("User does not exists in database", username);
        }
        return databaseUser.get(username);
    }

    public User password(String username, String password) {
        if (isUserExists(username)){
            User u = databaseUser.get(username);
            if (u.getPassWord() == password)
            {
                System.out.println("Login Successfull");
            }
            else
            {
                throw new IllegalCredentialsException("Password Does Not Match", username);
            }
        }
        else
            {
                throw new IllegalCredentialsException("User does not exists in database", username);
        }
        return databaseUser.get(username);
    }


    // Get all records
    public HashMap<String, User> getAll() {
        return databaseUser;
    }
    // Add User to HashMap
    public void add(String username, String Password, String Role, Boolean Active)
    {
        databaseUser.put(username, new User(username, Password, Role, Active));
    }

    private boolean isUserExists(String username) {
        return databaseUser.containsKey(username);
    }
}