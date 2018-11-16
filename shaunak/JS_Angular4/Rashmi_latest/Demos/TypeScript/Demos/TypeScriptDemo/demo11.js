var Car = /** @class */ (function () {
    //constructor 
    function Car(engine) {
        this.engine = engine;
    }
    //function 
    Car.prototype.disp = function () {
        console.log("Function displays Engine is  :   " + this.engine);
    };
    return Car;
}());
//create an object 
var obj = new Car("Honda");
//access the field 
console.log("Reading attribute value Engine as :  " + obj.engine);
//access the function
obj.disp();
