var fname:string = "rashmi"; 
var score1:number = 50;
var score2:number = 42.50
var sum = score1 + score2 
console.log("name is "+ fname) 
console.log("first score: "+ score1) 
console.log("second score: "+ score2) 
console.log("sum of the scores: "+ sum)

var vname:string = "rashmi"
console.log("value vname is  " +vname);

//The variable stores a value of type string

var bname:string;
console.log("value bname is " +bname);
//The variable is a string variable. The variable’s value is set to
// undefined by default	

var cname = "rashmi1";
console.log("value cname is " +cname);
//The variable’s type is inferred from the data type of the value. 
//Here, the variable is of the type string	

var lname;

//The variable’s data type is any. Its value is set to undefined by default.
//Example: Variable Scope

var global_num = 12          //global variable 

class Employee { 
   num_val = 13;             //class variable 
   static sval = 10;         //static field 
   
   storeNum():void { 
      var local_num = 14;    //local variable 
      console.log("inside class" +global_num);
      console.log("inside class 1 " +local_num);
   
   } 
} 
console.log("Global num: "+global_num)  
console.log(Employee.sval)   //static variable  
var obj = new Employee(); 
obj.storeNum();
console.log("Global num: "+obj.num_val) 
//   console.log("inside class 1 " +obj.local_num);