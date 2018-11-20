export enum EmployeeType { Daily=0, Permanent, Contract, Retired }

export class Employee{
    id: number;
    name:string;
    salary:number;
    empType:EmployeeType;

    constructor(id,name,salary,empType:EmployeeType){
        this.id=id;
        this.name=name;
        this.salary=salary;
        this.empType=empType;
    }
}