package com.training.hrms;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Scanner;

public class hrms {

    public static void main(String[] args) {

        System.out.println("*******WELCOME TO HRMS SYSTEM*************");
        System.out.println("SELECT NUMBER TO PERFORM FOLLOWING ACTIONS \n 1. To Add New Employee \n 2. To Search Employee From Employee Name \n " +
                "3. To Find Employee from ID \n 4. To List All Employees \n 5. To quit HRMS SYSTEM ");

        EmployeeImp empimp = new EmployeeImp();
        Scanner sc = new Scanner(System.in);
        while(true){
            int choice = sc.nextInt();

            switch (choice) {
                case 1:

                    System.out.println("ADD NEW EMPLOYEE IN SYSTEM");

                    Scanner emp = new Scanner(System.in);
                    String firstName = emp.nextLine();
                    String lastName = emp.nextLine();
                    Integer  empid = emp.nextInt();
                    double salary = emp.nextDouble();
                    String deptId = emp.next();

                    empimp.add(new Employee(empid, deptId, firstName, lastName, salary ));



                    System.out.println("Record Added SuccessFully");

                    System.out.println("Enter Your next Choice");
                    break;
                case 2:
                    System.out.println("SEARCHING EMPLOYEE FROM EMPLOYEE NAME");

                    InputStreamReader re = new InputStreamReader(System.in);

                    BufferedReader br = new BufferedReader(re);
                    try{

                        List<Employee> empname =empimp.findByfirstName(br.readLine());
                            for(Employee a : empname){
                                System.out.println(a);
                            }

                       /* for (int i=0;i<empname.size();i++){

                            System.out.println(empname.get(i));
                        }
*/
                    }
                    catch(Exception e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    System.out.println("SEARCHING EMPLOYEE FROM EMPLOYEE ID");

                    InputStreamReader re1 = new InputStreamReader(System.in);

                    BufferedReader br1 = new BufferedReader(re1);
                    try{

                        Employee eid =empimp.findById(Integer.parseInt(br1.readLine()));


                        System.out.println("Author: "+eid.getFirstName()+", title: "+eid.getLastName());


                    }
                    catch(Exception e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    System.out.println("Display all employees");
                    empimp.ListAllEmployees();
                    break;

                case 5:
                    System.out.println("Shutting down HRMS system");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wrong choice entered. Try Agaian");
                    break;
            }



        }


    }
}
