package com.mahendra;

import java.sql.*;

public class ConnectionUtil {
    public static Connection getConnection()throws ClassNotFoundException, SQLException{

        Class.forName("oracle.jdbc.OracleDriver");
            System.out.println("JDBC Driver found and Loaded!");

        //Step 2: Create a connection
        Connection    con = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521/xe","hr","hr");
            System.out.println("Connected to DB");
    return con;
    }


}
