package com.neha;

public class Main {

    public static void main(String[] args) {
	    AccountList list = new AccountList();

	    list.add(new Account(123,"Saving","Neha","Borivali",30000.45));


        list.add(new Account(121,"Current","Swati","Airoli",43567.12));
        list.add(new Account(345,"Current","Anil","Malad",12000));
        list.add(new Account(101,"Saving","Ritesh","Kandivali",45000));
        list.add(new Account(122,"Saving","Ruby","Antop Hills",35789.45));
        list.add(new Account(321,"Current","Darshan","Thane",43000));
        list.add(new Account(211,"Saving","Viral","Borivali",32000));
        list.add(new Account(222,"Saving","Shaunak","Kandivali",24567));

        list.sort();
    }
}
