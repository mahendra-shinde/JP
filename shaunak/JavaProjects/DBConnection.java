package com.ca.app;

import com.ca.db.OracleConnection;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;
import java.sql.*;


public class DBConnection {
    public static void main(String[] args) {
        Connection conn = OracleConnection.getConnection();

        Statement s = null;
        PreparedStatement st=null;
        CallableStatement cs = null;
        ResultSet rs = null;
        try {
            conn.setAutoCommit(false);
            s = conn.createStatement();

//*********************************************************************************************************************
            //test Select
//            rs = s.executeQuery("Select * from Employees");
//            ResultSetMetaData rsMetadata = rs.getMetaData();
//            System.out.println(rsMetadata.getTableName(1));
//            System.out.println(rsMetadata.getColumnName(1));
//            System.out.println(rsMetadata.getColumnType(1));
//            System.out.println(rsMetadata.getColumnCount());
//            System.out.println(rsMetadata.getColumnClassName(2));
//            while (rs.next()) {
//                System.out.println(rs.getInt(1) + " " + rs.getString(2));
////            Log.info(rs.getInt(1) + " " + rs.getString(2));
//            }

//*********************************************************************************************************************
            //test insert
//            int rows = s.executeUpdate("INSERT INTO REGIONS VALUES(5,'ANTARTICA')");
//            System.out.println(rows);

//*********************************************************************************************************************
            //test update
//            int rows = s.executeUpdate("UPDATE REGIONS SET REGION_NAME = '' WHERE REGION_ID = 5");
//            System.out.println(rows);

//*********************************************************************************************************************
            //test Delete
//            System.out.println(s.executeUpdate("DELETE FROM REGIONS WHERE REGION_ID = 5"));

//*********************************************************************************************************************
            //Prepared Statement
//            st=conn.prepareStatement("INSERT INTO REGIONS VALUES(?,?");
//            st.setInt(1,6);
//            st.setString(2,"Antartica");
//            int r = st.executeUpdate();

//*********************************************************************************************************************
          //Call Proc to insert
            int empId=2;
            String name="JONES";
            String role="ACCOUNTANT";
            String city="MUMBAI";
            String country="INDIA";
            String result;

//            cs = conn.prepareCall("{call insertEmployee(?,?,?,?,?,?) }");
//            cs.setInt(1,empId);
//            cs.setString(2,name);
//            cs.setString(3,role);
//            cs.setString(4,city);
//            cs.setString(5,country);
//            cs.registerOutParameter(6, Types.VARCHAR);
//            cs.execute();
//            result = cs.getString(6);
//            System.out.println(result);

//*********************************************************************************************************************
            //Call Proc to display
            cs = conn.prepareCall("{call getEmployee(?,?,?,?,?) }");
            cs.setInt(1,2);
            cs.registerOutParameter(2,Types.VARCHAR);
            cs.registerOutParameter(3,Types.VARCHAR);
            cs.registerOutParameter(4,Types.VARCHAR);
            cs.registerOutParameter(5,Types.VARCHAR);
            cs.execute();
            name = cs.getString(2);
            role = cs.getString(3);
            city = cs.getString(4);
            country = cs.getString(5);
            System.out.println(name+" "+role +" "+ city+" "+ country);

//*********************************************************************************************************************
            //RowSet Example to display
            JdbcRowSet rset = RowSetProvider.newFactory().createJdbcRowSet();
            rset.setUrl("jdbc:oracle:thin:@localhost:1521/orcl");
            rset.setUsername("hr");
            rset.setPassword("hr");
            rset.setCommand("Select first_name, Last_name from employees");
            rset.execute();
            while (rset.next()) {
                System.out.println(rset.getString(1) + " " + rset.getString(2));
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                if ( rs != null )
                    rs.close();
                if ( s != null )
                    s.close();
                if ( conn != null )
                    conn.close();
            } catch (SQLException sqlEx) {
                sqlEx.printStackTrace();
            }
        }
    }
}