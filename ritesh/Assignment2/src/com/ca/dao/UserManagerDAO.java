//UserManager interface

package com.ca.dao;

import com.ca.entity.User;
import java.util.HashMap;


public interface UserManagerDAO {
    void add(User u);
    User find(String name);
    HashMap getAll();
}
