var Calculate = /** @class */ (function () {
    function Calculate() {
    }
    Calculate.prototype.Add = function (a, b) {
        return a + b;
    };
    return Calculate;
}());
var obj = new Calculate();
console.log(obj.Add('1', 2));
//obj.Add(2);
