package com.swati;

import java.util.Iterator;
import java.util.LinkedList;

public class UserManager {

    private LinkedList<User> userList = new LinkedList();

    public UserManager(){
        userList.add(new User("Ashish", "pass@12245", "Admin", "True"));
        userList.add(new User("Alok", "$$xyz$$12345", "User", "True"));
        userList.add(new User("Alok", "$$xyz$$12345", "User", "True"));
        userList.add(new User("Alok", "$$xyz$$12345", "User", "True"));
    }

    public void add(User user) {
        userList.add(user);


    }
    public User findByName(String userName) {
        for(User b : userList){
            if(b.getUsername().toLowerCase().contentEquals(userName)){
                return b;
            }
        }
       return null;
    }

    public void displayAll(){
        for (User b : userList){
            Iterator it = userList.iterator();
            while(it.hasNext()){
                System.out.println(it.next());
            }
        }
    }


}

