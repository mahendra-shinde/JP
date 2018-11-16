var fname = "Bijal";
var score1 = 50;
var score2 = 48.20;
var sum = score1 + score2;
console.log("Name is: " + fname);
console.log("first score: " + score1);
console.log("Second Score: " + score2);
console.log("Sum is :" + sum);
var vname = "Shaunak";
console.log("Value vname is :" + vname);
var bname;
console.log("Value bname is " + bname);
var cname = "Shaunak1";
console.log("Value cname is :" + cname);
var lname;
var global_num = 12;
var Employee = /** @class */ (function () {
    function Employee() {
        this.num_val = 13;
    }
    Employee.prototype.storeNum = function () {
        var local_num = 14;
        console.log("Local Number is: " + local_num);
        console.log("Inside Class: " + global_num);
    };
    Employee.sval = 10;
    return Employee;
}());
console.log("Global Num: " + global_num);
console.log("Emp Sval is: " + Employee.sval);
var obj = new Employee();
console.log("Global num: " + obj.num_val);
obj.storeNum();
