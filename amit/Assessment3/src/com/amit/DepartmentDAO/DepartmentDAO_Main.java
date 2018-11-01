package com.amit.DepartmentDAO;

public class DepartmentDAO_Main {

    public static void main(String[] args) {

        DepartmentDB jdbc = new DepartmentDB();

        Department dept = jdbc.getDetailsFrmDB(30);

        if (dept == null) {
            System.out.println("No Record found for the give department id");
        }else{
            System.out.println(dept);
        }


    }




}
