package com.amit;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Properties ps = new Properties();
        try{
            //ps.load(Property_Demo1.class.getResourceAsStream("app.properties"));
            ps.load(new FileInputStream("app.properties"));//loads file from project
            System.out.println("DB Driver : "+ps.getProperty("db.driver"));
            System.out.println("DB Name : "+ps.getProperty("db.name"));
            System.out.println("DB User id: "+ps.getProperty("db.user"));
            System.out.println("DB Password : "+ps.getProperty("db.password","Not available"));
            System.out.println("DB URL : "+ps.getProperty("db.url"));

        }catch(IOException e){

            System.out.println(e.getMessage());

        }

    }
}
