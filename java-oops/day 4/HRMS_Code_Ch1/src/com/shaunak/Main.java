package com.shaunak;

import java.io.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
 * This program demonstrates how to read characters from a text file
 * using a BufferedReader for efficiency.
 *
 * @author www.codejava.netQ
 */
public class Main  {


    public static void main(String[] args) {
    while (true){
        EmployeeDAOImpl EmpImpl = new EmployeeDAOImpl();
        EmpImpl.readFile();
        System.out.println("\nEnter one of the menu options");
        System.out.println("Enter A to add new joinee");
        System.out.println("Enter B to find Employee by id");
        System.out.println("Enter C to find Employee by name");
        System.out.println("Enter D to list all Employees ");
        System.out.println("Enter Q to QUIT ");
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.next();

        switch (choice) {
            // case statements
            // values must be of same type of expression
            case "A":

                //for (int i = 1; i <= 3; i++) {

                System.out.println("Pls. Enter Employee ID in Number Format: ");
                Integer EmployeeId = scanner.nextInt();

                System.out.println("Enter Employee First Name: ");
                String FirstName = scanner.next();

                System.out.println("Enter Employee Last Name: ");
                String LastName = scanner.next();

                System.out.println("Enter Employee Dept Name: ");
                String dept = scanner.next();

                System.out.println("Enter Employee Salary: ");
                Float salary = scanner.nextFloat();

                Employee new_emp = new Employee(EmployeeId, FirstName, LastName, dept, salary);
                //System.out.println(new_Book.toString());
                //System.out.println("Enter");
                EmpImpl.add(new_emp);
                EmpImpl.writeFile();
                //}

                break; // break is optional

            case "B":
                // Statements
                System.out.println("To Search By Employee Id, Enter Employee Id: ");
                Integer Sea_id = scanner.nextInt();
                System.out.println(EmpImpl.findById(Sea_id));
                break; // break is optional

            case "C":
                // Statements
                System.out.println("To Search By Employee Name, Enter First Name: ");
                String Sea_Fname = scanner.next();
                System.out.println(EmpImpl.findByEmployeeFname(Sea_Fname));
                break; // break is optionala

            case "D":

                for (Employee e : EmpImpl.employeeList)
                    System.out.println(e);
                break; // break is optional

            case "Q":
                EmpImpl.writeFile(); // Statements
                System.exit(0);
                break; // break is optional

            // We can have any number of case statements
            // below is default statement, used when none of the cases is true.
            // No break is needed in the default case.
        }
                // Statements
        }

    } //catch (IOException e) {
    // e.printStackTrace();
}

