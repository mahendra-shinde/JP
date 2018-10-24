package com.neha;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class EmployeeDAOImpl implements EmployeeDAO{
    private LinkedList<Employee> employeeList;


    public EmployeeDAOImpl() {
        this.employeeList = new LinkedList<>();
        load();
    }

    @Override
    public void addEmployee(Employee e) {
        employeeList.add(e);
    }

    @Override
    public Employee findbyID(int empID) {
        for (Employee e : employeeList){
            if(e.getEmpID() == empID){
                return e;
            }
        }
        return null;
    }

    @Override
    public List<Employee> findbyName(String name) {
        List<Employee> temp = new ArrayList<>();
        for(Employee e : employeeList){
            if(e.getName().toLowerCase().contains(name.toLowerCase())){
                temp.add(e);
            }
        }
        return temp;
    }

    public boolean isEmpty(){
        return employeeList.isEmpty();
    }

    @Override
    public void listAllEmployees() {
        if(isEmpty()){
            System.out.println("No Employee Found!!!");
        }
        else {
            System.out.println("Total "+employeeList.size() + " Employees Exists:");
            Iterator it = employeeList.iterator();
            while (it.hasNext()) {
                System.out.println(it.next());
            }
        }
    }

    @Override
    public void load() {
        try{
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\web\\employees.txt"));
            employeeList = (LinkedList) ois.readObject();

            System.out.println(employeeList.size());
            ois.close();


            }catch (IOException|ClassNotFoundException ex){
            System.out.println(ex.getMessage());
        }

    }


    @Override
    public void unload() {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\web\\employees.txt"));
            oos.writeObject(employeeList);
            oos.close();

        }catch (IOException ex){
            System.out.println("Exception");
            System.out.println(ex.getMessage());
        }

        System.out.println("All Employee information written on file sucessfully!!!");
    }
}
