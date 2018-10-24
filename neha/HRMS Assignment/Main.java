package com.neha;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    private static EmployeeDAOImpl ei = new EmployeeDAOImpl();

    private static void add(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Employee Id:");
        int empId = scanner.nextInt();

        System.out.println("Enter Name:");
        String name = scanner.next();

        System.out.println("Enter Date of Joining in dd/mm/yyyy format:");
            SimpleDateFormat formatter = new SimpleDateFormat("dd/mm/yyyy");
            Date date = null;
            do {
                try {
                    String temp = scanner.next();
                    date = formatter.parse(temp);
                } catch (ParseException ex) {
                    System.out.println("Please enter date in correct format(dd/mm/yyyy)");
                }
            }while (date == null);

            System.out.println("Enter Designation:");
            String desg = scanner.next();

            System.out.println("Enter Salary");
            double sal = scanner.nextDouble();

            System.out.println("Enter Contact No");
            int contactNo = scanner.nextInt();

            System.out.println("Enter email addrees");
            String email = scanner.next();

            Employee emp = new Employee(empId, name, date,desg, sal, contactNo, email);
            ei.addEmployee(emp);
    }

    private static void find(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter EmployeeId to find:");
        int empID = scanner.nextInt();
        Employee emp = ei.findbyID(empID);
        if(emp == null){
            System.out.println("Employee not Found!!!");
        }
        else{
            System.out.println(emp.toString());
        }

    }

    private static void search(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name to search employees:");
        String name = scanner.next();
        List<Employee> emps = ei.findbyName(name);
        if(emps.size()== 0){
            System.out.println("Employee with name: '"+ name + "' not Found!!!");
        }
        else{
            System.out.println("Total "+ emps.size() + " Found!!!");
            Iterator it = emps.iterator();
            while(it.hasNext()){
                System.out.println(it.next());
            }
        }

    }

    private static void displayAll(){
        ei.listAllEmployees();
    }

    public static void main(String[] args) {

        int choice = 0;
        Scanner scanner = new Scanner(System.in);

        do{
            System.out.println("Select Options:");
            System.out.println("1. Add Employee");
            System.out.println("2. Find Employee by Id");
            System.out.println("3. Search Employee by Name");
            System.out.println("4. List All Employees");
            System.out.println("5. Exit");
            choice = scanner.nextInt();
            switch (choice){
                case 1:{
                    add();
                    break;
                }
                case 2:{
                    find();
                    break;
                }
                case 3:{
                    search();
                    break;
                }
                case 4:{
                    displayAll();
                    break;
                }
                case 5:{
                    ei.unload();
                    System.out.println("Exit Successfully");
                    break;
                }
                default:{
                    System.out.println("Please select correct options!!!");
                    break;
                }
            }

        }while(choice !=5);


    }
}
