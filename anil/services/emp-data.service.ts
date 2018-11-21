import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class EmpDataService {

  constructor() { }

  getEmployees(): any[] {
    return [
      {
        Code: 'emp101',
        Name: "Rashmi",
        Gender: 'Female',
        AnnualSalary: 5500,
        DateofBirth: '9/6/1985'
      },
      {
        Code: 'emp102',
        Name: "Anushka",
        Gender: 'Female',
        AnnualSalary: 5500,
        DateofBirth: '9/6/1985'
      },
      {
        Code: 'emp103',
        Name: "Parth",
        Gender: 'Male',
        AnnualSalary: 5500.95,
        DateofBirth: '9/6/1982'
      }
    ];
  }
}
