package com.mahendra;

import java.util.*;

public class MapDemo {
    public static void main(String[] args) {

            Map<Integer, String> names = new HashMap<Integer,String>();
            names.put(1,"Amit");
            names.put(2,"Anil");
            names.put(3,"Sunil");

            System.out.println(names.get(3));
    }
}
