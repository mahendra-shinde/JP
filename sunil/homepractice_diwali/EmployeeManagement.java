package com.amit.homepractice_diwalivacation;

class EmployeeManagement implements SalaryInterface{

    int empId;
    String empName;
    long empSalary;




    public void display(){

        System.out.println("Employee Id: "+empId+" Employee Name: "+empName+" Employee Salary: "+empSalary);

    }


    public void accept(int id, String name, long salary){

        empId = id;
        empName = name;
        empSalary= salary;


    }

    public EmployeeManagement(int id, String name, long salary)throws Exception {

        empId = id;
//	empName = name;

        setName(name);
//	empSalary= salary;
        setSalary(salary);



    }
    public void setSalary(long salary)throws Exception{

        if (salary<=0 || salary<=this.empSalary){

            throw new Exception("invalid salary");

        }else {


            this.empSalary = salary;

        }

    }


    public long getSalary(){

        return this.empSalary;

    }


    public void setName(String name)throws Exception{

        if (name.trim().length() == 0){


            throw new Exception("Invalid Name");


        }else{


            this.empName=name;

        }

    }


    public String getName(){

        return this.empName;

    }


    private void setEmpId(int id){

        this.empId = id;

    }


    public int getEmpId(){

        return this.empId;

    }

    @Override
    public double calculateSalary() {
        return 0;
    }
}
