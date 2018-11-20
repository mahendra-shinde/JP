import { Component, OnInit } from '@angular/core';
import { Employee, EmployeeType } from '../model/employee';

@Component({
  selector: 'app-employee',
  templateUrl: './employee.component.html',
  styleUrls: ['./employee.component.css']
})
export class EmployeeComponent implements OnInit {
  fname = "John";
  lname = "Smith";
  gender = "Male";
  age = 30;
  annualSalary;
  dateOfBirth;
  code;
  ShowFullName: boolean = true;
  Subjects: string[] = ["MS.NET", "Java", "Sharepoint"];

  Employees: any[] = [
    { code: "emp101", fname: "Rashmi", gender: "Female", annualSalary: 5500, dateOfBirth: "25/6/1985" },
    { code: "emp102", fname: "Anushka", gender: "Female", annualSalary: 5700.95, dateOfBirth: "9/6/1982" },
    { code: "emp103", fname: "Parth", gender: "Male", annualSalary: 5700.95, dateOfBirth: "10/6/1982" }
  ];

  constructor() { }


  displayFullName(): string {
    return this.fname + " " + this.lname;
  }

  emp: Employee = new Employee(1, "Emp1", 1000,EmployeeType.Daily);

  ngOnInit() {
  }


}
