package com.amit.homepractice_diwalivacation;

public class EmployeeMain {

    public static void main(String[] args){


        try{

            EmployeeManager em = new EmployeeManager(125, "prashant",259000,2500);
            System.out.println(em.getName()+em.getSalary()+em.getEmpId());


            /*
            EmployeeManagement e = new EmployeeManagement(123,"Amit",99000);

            //e.accept(123,"Amit",99000);
            //e.display();

            EmployeeManagement e1 = new EmployeeManagement(131,"Anil",110000);

            //e1.accept(131,"Anil",110000);
            //e1.display();

            EmployeeManagement e3 = new EmployeeManagement(133,"OP",1980000);

            e3.setSalary(20000000);
            e3.setName("");

            e3.display();

            //e3.setSalary(e3.getSalary()+2000);



		*//*e3.getSalary();

		e3.display();

		e3.setName("Anil");
		e3.display();

		e3.setEmpId(135);
		e3.display();*//*
*/

        }catch(Exception ex){

            ex.getMessage();
            ex.printStackTrace();

        }






    }
}
