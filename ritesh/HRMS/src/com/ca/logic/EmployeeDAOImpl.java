package com.ca.logic;

import com.ca.dao.EmployeeDAO;
import com.ca.entity.Employee;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class EmployeeDAOImpl implements EmployeeDAO {

    private static final String FILENAME = "EMP.DAT";
    private static final String FILEPATH = "D:\\Projects\\";
    private static LinkedList<Employee> employeeList = new LinkedList<>();


    public EmployeeDAOImpl(){
        readFile();
    }

    @Override
    public void add(Employee emp) {
        employeeList.add(emp);
    }

    @Override
    public Employee findById(int empId) {
        for (Employee e : employeeList) {
            if ( e.getEmpId() == empId ) {
                return e;
            }
        }
        return null;
    }

    @Override
    public List<Employee> findByFirstName(String firstName) {
        List<Employee> temp = new ArrayList<>();
        for (Employee e : employeeList) {
            if ( e.getFirstName().toLowerCase().contains(firstName.toLowerCase()) ) {
                temp.add(e);
            }
        }
        return temp;
    }

    @Override
    public List<Employee> getEmployeesList() {
        return employeeList;
    }

    public void saveFile(){
        writeFile();
    }

    static void writeFile() {
        try {
            File file = new File(FILEPATH + FILENAME);
            if ( !file.exists() ) {
                file.createNewFile();
            }
            FileOutputStream out = new FileOutputStream(file, false);
            ObjectOutputStream objout = new ObjectOutputStream(out);
            objout.writeObject(employeeList);
            objout.close();
        } catch (IOException ioex) {
            ioex.getMessage();
        }


    }


    static void readFile() {
        try {
            File file = new File(FILEPATH + FILENAME);
            if (file.exists() ) {
                if(file.length()!=0) {
                    FileInputStream in = new FileInputStream(FILEPATH + FILENAME);
                    ObjectInputStream oin = new ObjectInputStream(in);


                    Object obj = oin.readObject();
                    if ( obj != null && obj instanceof LinkedList ) {
                        employeeList = (LinkedList) obj;
                        //System.out.println(obj.toString());
                    }
                }
            }
        } catch (IOException ioEx) {
            System.out.println(ioEx.getMessage());
            ioEx.printStackTrace();
        } catch (ClassNotFoundException cnfEx) {
            System.out.println(cnfEx.getMessage());
            cnfEx.printStackTrace();
        }
    }

}
