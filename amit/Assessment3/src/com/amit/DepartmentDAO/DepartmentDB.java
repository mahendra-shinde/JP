package com.amit.DepartmentDAO;

import com.amit.DepartmentDAO.Department;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;
import java.sql.SQLException;

public class DepartmentDB {

    //public static void main(String[] args) {

    public Department getDetailsFrmDB(int deptmId){

        Department department = null;

        try{

            //registering and loading db
            Class.forName("oracle.jdbc.OracleDriver");


            JdbcRowSet rowsSet = RowSetProvider.newFactory().createJdbcRowSet();
            rowsSet.setUrl("jdbc:oracle:thin:@localhost:1521:orcl");
            rowsSet.setUsername("hr");
            rowsSet.setPassword("hr");
            //passing the department id as parameter to the query
            rowsSet.setCommand("select * from departments where department_id="+deptmId);
            rowsSet.execute();
            rowsSet.next();



            //assigning value from DB to the variables
            int deptid = rowsSet.getInt(1);
            String  deptname = rowsSet.getString(2);
            int mid = rowsSet.getInt(3);
            int lid = rowsSet.getInt(4);

            //passing the variable to the department class
           department = new Department(deptid,deptname, mid, lid );

            rowsSet.close();


        }catch(ClassNotFoundException | SQLException  e){

            System.out.println("Cannot load driver "+e.getMessage());
            //e.printStackTrace();
            return null;

        }
        return department;
    }
}
