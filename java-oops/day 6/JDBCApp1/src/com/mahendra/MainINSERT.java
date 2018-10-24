package com.mahendra;

import java.sql.*;

public class MainINSERT {

    /**
     * Test INSERT operation with JDBC
     * @param args
     */
    public static void main(String[] args) {

        Connection con = null;
        Statement st = null;

            //Step 1: Load JDBC Driver
            try{
                Class.forName("oracle.jdbc.OracleDriver");
                System.out.println("JDBC Driver found and Loaded!");
            }catch(ClassNotFoundException ce){
                System.out.println("Cannot load driver "+ce.getMessage());
                return; //Close main method
            }

            //Step 2: Create a connection
            try{
                con = DriverManager.getConnection(
                        "jdbc:oracle:thin:@localhost:1521/xe","hr","hr");
                System.out.println("Connected to DB");
            }catch(SQLException ex){
                System.out.println("Unable to connect: "+ex.getMessage());
                return;
            }

            //Step 3: Create Statement
            try {
               st = con.createStatement();
                System.out.println("Statement created!");
            }catch(SQLException ex){
                System.out.println("Unable to create a statement! "+ex.getMessage());
            }
            //Step 4: Execute the statement
            try{
                int rows = st.executeUpdate("INSERT into REGIONS VALUES(5,'Australia')");
                System.out.println("Affected  records "+rows);
            }catch(SQLException ex){
                System.out.println("Unable to insert the data ! "+ex.getMessage());
            }

            //Step 6: Close Connection
            try{
                //close everything
                st.close();
                con.close();
                System.out.println("Closed everything!");
            }catch(SQLException ex){
                System.out.println("Error while closing the connection "+ex.getMessage());
            }
    }
}
