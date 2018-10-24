//Class to implement UserManager
// with HashMap collection
//with functionalities like add, find and display
package com.ca.dao;

import com.ca.entity.User;
import com.ca.exception.IllegalCredentialsException;
import java.util.HashMap;

public class UserManagerDAOImpl implements UserManagerDAO {
    private static HashMap<String, User> userMap = new HashMap<String, User>() {
        {
            put("ashish", new User("Ashish", "pass@12245", "Admin", true));
            put("anishp", new User("AnishP", "My$pass123", "User", true));
            put("alokkumar",new User("AlokKumar", "$$xyz$$12345", "User", true));
            put("aditii",new User("Aditii", "Opps_forgot_1", "User", true));
        }
    };

    //Method to add user to hashmap
    //input parameter User Object
    @Override
    public void add(User u) {
        userMap.put(u.getUsername().toLowerCase(), u);
    }

    //Method to find User based on username
    //Input parameter: username
    @Override
    public User find(String name) {
        for (String username : userMap.keySet()) {
            if ( username.equalsIgnoreCase(name) ) {
                return userMap.get(username);
            }
        }
        return null;
    }

    //Method to return all users
    @Override
    public HashMap<String, User> getAll() {
        return userMap;
    }


    //Username must contain at least 6 and maximum 12 characters
    //Username cannot contain a space
    public static boolean validateUserName(String username) throws IllegalCredentialsException {
        if ( username == null ) {
            throw new IllegalCredentialsException();
        }
        if ( username.length() < 6 || username.length() > 12 || username.contains(" ") ) {
            throw new IllegalCredentialsException();
        } else {
            return true;
        }
    }

    //Password must contain at least ONE digit and ONE special character
    //Password must be minimum 8 characters long
    //Password may contain a space.
    public static boolean validatePassword(String password) throws IllegalCredentialsException {
        if ( password == null ) {
            throw new IllegalCredentialsException();
        }

        if ( password.length() < 8 || !hasSpecialCharacter(password) || !hasNumber(password) ) {
            throw new IllegalCredentialsException();
        } else {
            return true;
        }
    }

    //Method to find if String contains atleast 1 special character
    private static boolean hasSpecialCharacter(String password) {
        return (password.matches("(.*[@$ _&!#%()].*)"));

    }

    //Method to find if String contains atleast 1 number
    private static boolean hasNumber(String password) {
        return (password.matches("(.*[0-9].*)"));
    }


}
