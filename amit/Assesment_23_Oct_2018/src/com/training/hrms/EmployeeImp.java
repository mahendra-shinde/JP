package com.training.hrms;

import com.training.hrms.empInterface;


import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class EmployeeImp implements empInterface {

    static File file = new File("D:\\emp");;
    static ArrayList<Employee> employeesList;
    static{
       // file = new File("D:\\emp");
        try {
            if(file.exists()){
                System.out.println("EMPLOYEE DATA SOURCE FILE LOADED");

                FileInputStream in = new FileInputStream(file);
                ObjectInputStream inObj = new ObjectInputStream(in);
                Object emp = inObj.readObject();

                employeesList = (ArrayList<Employee>) emp;

                /*for (Employee e : employeesList) {


                    System.out.println(e);
                }*/

            }
            else
            {
                System.out.println("EMPLOYEE DATA FILE NOT FOUND.. CREATING EMPLOYEE DATA FILE..");
                file.createNewFile();}

        }catch(IOException | ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
    }

    public void ListAllEmployees() {
        File file = new File("D:\\emp");
        try {
            FileInputStream in = new FileInputStream(file);
            ObjectInputStream inObj = new ObjectInputStream(in);
           Object emp = inObj.readObject();

           ArrayList<Employee> employeesList = (ArrayList<Employee>) emp;

            for (Employee e : employeesList) {


                System.out.println(e);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


    ArrayList<Employee> empList = new ArrayList<>();
    @Override
    public void add(Employee emp) {
        try{

            employeesList.add(emp);
            FileOutputStream in = new FileOutputStream(file);
            ObjectOutputStream objout = new ObjectOutputStream(in);
            objout.writeObject(employeesList);
            //objout.close();

        }catch(IOException e){

            System.out.println(e.getMessage());
        }

       // empList.add(emp);
    }


    @Override
    public Employee findById(int empid) {
        for(Employee b : employeesList){
            if(b.getEmpId()==empid){
                return b;
            }
        }
        return null;
    }

    @Override
    public List<Employee> findByfirstName(String firstName) {
        List<Employee> temp = null;

        if (!employeesList.isEmpty()){
            temp =new ArrayList<>();
            for(Employee b : employeesList){

                if(b.getFirstName().toLowerCase().contains(firstName.toLowerCase())){
                    temp.add(b);
                }
            }

        }
        else{
            System.out.println("No Record found");

        }
        return temp;

    }



}
