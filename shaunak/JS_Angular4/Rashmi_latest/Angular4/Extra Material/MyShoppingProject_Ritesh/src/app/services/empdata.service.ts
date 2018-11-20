import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class EmpdataService {

  getEmployees(): any[] {
    return [
      { code: "emp101", name: "Rashmi", gender: "Female", annualSalary: 5500, dateOfBirth: "25/6/1985" },
      { code: "emp102", name: "Anushka", gender: "Female", annualSalary: 5700.95, dateOfBirth: "9/6/1982" },
      { code: "emp103", name: "Parth", gender: "Male", annualSalary: 5700.95, dateOfBirth: "10/6/1982" }

    ];
  }
  constructor() { }
}
