var myEmployee = /** @class */ (function () {
    function myEmployee(i, nm, sal) {
        this.id = i;
        this.name = nm;
        this.salary = sal;
    }
    Object.defineProperty(myEmployee.prototype, "Name", {
        //getters 
        get: function () {
            return this.name;
        },
        //Setters 
        set: function (name) {
            this.name = name;
        },
        enumerable: true,
        configurable: true
    });
    Object.defineProperty(myEmployee.prototype, "Salary", {
        get: function () {
            return this.salary;
        },
        set: function (sal) {
            this.salary = sal;
        },
        enumerable: true,
        configurable: true
    });
    Object.defineProperty(myEmployee.prototype, "ID", {
        set: function (id) {
            this.id = id;
        },
        enumerable: true,
        configurable: true
    });
    Object.defineProperty(myEmployee.prototype, "Id", {
        get: function () {
            return this.id;
        },
        enumerable: true,
        configurable: true
    });
    myEmployee.prototype.printInfo = function () {
        console.log("Employee Name  = " + this.Name + " ");
        console.log("Employee ID  = " + this.Id + " ");
        console.log("Employee Salary  = " + this.Salary + " ");
    };
    return myEmployee;
}());
var emp = new myEmployee(100, "rashmi", 3000);
emp.printInfo();
//    emp.Name="rashmi";
//    emp.printInfo();   emp.Name="rashmi";
//    emp.printInfo();
console.log(emp.Id);
