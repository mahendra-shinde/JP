package com.mahendra;

import java.sql.*;

public class Main {

    public static void main(String[] args) {

        CountryDAO dao = new CountryDAO();
        Country c = dao.findCountryById("CA");
        System.out.println("Found country :"+c.getName()+" in region "+c.getRegion().getName());
    }
}
