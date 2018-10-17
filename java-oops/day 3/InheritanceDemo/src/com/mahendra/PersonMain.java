package com.mahendra;

public class PersonMain {
    public static void main(String[] args) {
        System.out.println(findGreater(10,20));

            }
    /*static String findElder(final Person p1,final Person p2){
        Person temp = p1;
        p2 = p1;
        p1 = temp;
        if(p1.age>p2.age)
            return p1.name;
        else
            return p2.name;
    }*/
    static boolean findGreater(int n1,final int n2){
        //n2=0;
        if(n1>n2)
            return true;
        else
            return false;
    }
}
