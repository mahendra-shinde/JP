package com.shaunak;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BookDAOImpl bookImpl = new BookDAOImpl();

        for (int i = 1; i <= 3; i++) {

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

            Employee new_emp = new Employee(EmployeeId,FirstName,LastName,dept,salary);
            //System.out.println(new_Book.toString());
            System.out.println("Enter" );
            bookImpl.add(new_Book);
        }
        System.out.println("To Search By Author, Enter Author Name: ");
        String Sea_author = scanner.next();
        System.out.println(bookImpl.findByAuthor(Sea_author));

        System.out.println("To Search By BookId, Enter Book Id: ");
        Integer Sea_id = scanner.nextInt();
        System.out.println(bookImpl.findById(Sea_id));
    }

}