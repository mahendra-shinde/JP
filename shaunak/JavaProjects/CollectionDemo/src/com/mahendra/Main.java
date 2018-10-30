package com.mahendra;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List data =  new ArrayList();
        data.add(100);
        data.add(123);
        data.add(100);
        data.add("mahendra");
        data.add(12.99);
        data.add("mahendra");

        Iterator it = data.iterator();
        System.out.println("Displaying ALL elements from List");
        while(it.hasNext()){
            System.out.println(it.next());
        }

        Set data2 = new HashSet();
        data2.addAll(data);

        System.out.println("Displaying ALL elements from SET ");
        Iterator it2 = data2.iterator();
        while(it2.hasNext()){
            System.out.println(it2.next());
        }

        Integer n = 11;
        Integer s = 55;
        System.out.println(n.compareTo(s));
    }
}
