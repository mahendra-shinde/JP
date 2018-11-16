var AgriLoan = /** @class */ (function () {
    function AgriLoan(interest, rebate) {
        this.interest = interest;
        this.rebate = rebate;
        this.interest = interest - rebate;
    }
    return AgriLoan;
}());
var obj2 = new AgriLoan(10, 1);
console.log("Interest is : " + obj2.interest + " Rebate is : " + obj2.rebate);
