var fname:String = "Bijal";
var score1:number = 50;
var score2:number = 48.20;
var sum = score1+score2;
console.log("Name is: " + fname);
console.log("first score: "+score1);
console.log("Second Score: "+score2);
console.log("Sum is :" + sum);

var vname:string = "Shaunak";
console.log("Value vname is :" + vname);

var bname:string;
console.log("Value bname is " + bname);

var cname = "Shaunak1";
console.log("Value cname is :" +cname);

var lname;


let global_num = 12;

class Employee{
    num_val = 13;
    static sval = 10;

    storeNum():void {
        let local_num = 14;
        console.log("Local Number is: "+local_num);
        console.log("Inside Class: "+global_num);
    }
}

console.log("Global Num: " +global_num);
console.log("Emp Sval is: " +Employee.sval);
var obj = new Employee();
console.log("Global num: " +obj.num_val);
obj.storeNum();
