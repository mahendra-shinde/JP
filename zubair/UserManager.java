package com.zak;

import java.util.LinkedList;
import java.util.ArrayList;
import java.util.List;

public class UserManager extends User {

    LinkedList<User> al = new LinkedList<>();
        al.add("Ashish","pass@12445","Admin","True");
        al.add("Anish","My pass123","User","True");
        al.add("Alok","  xyz  12345","User","True");
        al.add("Aditi","Opp_forgot_1","Userge :","True");


    private LinkedList<User> bookList = new LinkedList<>();

    public void add(User user) {
        al.add(user);
    }

    public User findByName(String name) {
        for (User b : al) {
            if (b.getUsername().toLowerCase().contains(name.toLowerCase())) {
                return b;
            }
        }
        return null;
    }

    public List<User> getAll() {
        List<User> temp = new ArrayList<User>();
        for (User b : al) {
            temp.add(b);
        }
        return temp;
    }
}