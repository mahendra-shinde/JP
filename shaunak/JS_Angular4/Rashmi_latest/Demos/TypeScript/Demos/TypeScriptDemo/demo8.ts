class myEmployee{
    id: number;
    name: string;
    salary: number;
    constructor(i:number, nm:string, sal: number){
        this.id =i;
        this.name=nm;
        this.salary=sal;
    }
    //Setters 
    set  Name(name: string){
        this.name = name ;
    }
        
    set  Salary(sal: number){
        this.salary = sal ;
    }
        
    set  ID(id: number){
        this.id = id ;
    }
   //getters 
   
   get Name(){
       return this.name;
   }
   
   
   get Salary(){
       return this.salary;
   }
   get Id(){
       return this.id;
   }
   public printInfo():void{
   console.log(`Employee Name  = ${this.Name} `)
   console.log(`Employee ID  = ${this.Id} `)
   console.log(`Employee Salary  = ${this.Salary} `)
   }
   }
   
   var emp = new myEmployee(100,"rashmi",3000);
   emp.printInfo();
   
//    emp.Name="rashmi";
//    emp.printInfo();   emp.Name="rashmi";
//    emp.printInfo();
console.log(emp.Id);