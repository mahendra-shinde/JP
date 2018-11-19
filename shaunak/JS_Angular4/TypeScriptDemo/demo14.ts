interface ILoan { 
    interest:number;
 } 
 
 class AgriLoan implements ILoan { 
    interest:number 
    rebate:number 
    
    constructor(interest:number,rebate:number) { 
       this.interest = interest 
       this.rebate = rebate
       this.interest=interest-rebate; 
   } 
 } 
 
 var obj2 = new AgriLoan(10,1) 
 console.log("Interest is : "+obj2.interest+" Rebate is : "+obj2.rebate );