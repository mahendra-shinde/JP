var Encapsulate = /** @class */ (function () {
    function Encapsulate() {
        this.str = "hello";
        this.str2 = "world";
    }
    return Encapsulate;
}());
var obj1 = new Encapsulate();
console.log(obj1.str); //accessible 
//console.log(obj1.str2)   //compilation Error as str2 is privatec
