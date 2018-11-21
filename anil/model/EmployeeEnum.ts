export enum EmployeeType {
    Daily = 0, Permanent, Contract, Retired
}

export class EmployeeEnum {

    id:number;
    name:string;
    salary:number;
    type:EmployeeType;

    constructor(id:number,name:string,sal:number,type:EmployeeType){
        this.id=id;
        this.name=name;
        this.salary=sal;
        this.type=type;
    }

}