import { Component, OnInit } from '@angular/core';
import { Emp } from '../model/emp';

@Component({
  selector: 'app-employee-info',
  templateUrl: './employee-info.component.html',
  styleUrls: ['./employee-info.component.css']
})
export class EmployeeInfoComponent implements OnInit {

  constructor() { }

  emp:Emp[] =[
    {
      id:1,
      name:'Rashmi',
      gender:'Female',
      contactPreference:'Email',
      email:'rashmi@gmail.com',
      dateOfBirth:new Date('10/25/1988'),
      department:'IT',
      isActive:true,
      photoPath:'assets/images/rash.png'
    },
    {  id:2,
      name:'Anushka',
      gender:'Female',
      contactPreference:'Phone',
      phoneNumber:2345978640,
      dateOfBirth:new Date('11/20/1979'),
      department:'HR',
      isActive:true,
      photoPath:'assets/images/anu.png'
    },
    {  id:3,
      name:'Parth',
      gender:'Male',
      contactPreference:'Phone',
      phoneNumber:2345978640,
      dateOfBirth:new Date('3/25/1976'),
      department:'IT',
      isActive:false,
      photoPath:'assets/images/parth.png'
    }
  ]

  ngOnInit() {
  }

}
