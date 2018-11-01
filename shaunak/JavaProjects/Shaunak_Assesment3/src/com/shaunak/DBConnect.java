package com.shaunak;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;
import java.sql.*;

import static javax.sql.rowset.RowSetProvider.*;


public class DBConnect {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //creating rowset object
        JdbcRowSet rwset = newFactory().createJdbcRowSet();

    try{
        //loading driver
        Class.forName("oracle.jdbc.OracleDriver");
        System.out.println("JDBC Driver found and Loaded!");

        //row set connection parameters
        rwset.setUrl("jdbc:oracle:thin:@localhost:1521/orcl");
        rwset.setUsername("hr");
        rwset.setPassword("hr");

        // SQL Statement to fetch data
        rwset.setCommand("Select department_id, department_name, manager_id, location_id from departments where department_id=30");
        rwset.execute();

        // Displaying result
        while (rwset.next())
        {
            int department_id = (rwset.getInt(1));
            String department_name = rwset.getString(2);
            int manager_id = (int)rwset.getInt(3);
            int location_id=(int)rwset.getInt(4);

            // Creating an Object type Dept1
            Department dept1= new Department(department_id, department_name, manager_id, location_id);

            System.out.println("Department_id"+" "+"Departmane_name"+" "+"Manager_id"+" "+"Location_id");
            System.out.println(dept1.getDepartment_id()+"            "+dept1.getDepartment_name()+"      "+dept1.getManager_id()+"        "+dept1.getLocation_id());

        }
    }catch (SQLException e)
    {
        System.out.println(e.getMessage());
    }
        finally
    {

        rwset.close();
    }
        System.out.println("Closing Rowset");

    }
}
