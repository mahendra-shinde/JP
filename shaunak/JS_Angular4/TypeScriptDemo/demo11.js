var Car = /** @class */ (function () {
    function Car(engine) {
        this.engine = engine;
    }
    Car.prototype.disp = function () {
        console.log("Function displays engine is : " + this.engine);
    };
    return Car;
}());
var obj = new Car("Honda");
console.log("Reading attribute value Engine as : " + obj.engine);
obj.disp();
