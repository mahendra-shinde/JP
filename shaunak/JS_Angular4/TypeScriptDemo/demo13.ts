class Encapsulate { 
    str:string = "hello" 
    private str2:string = "world" 
 }
  
 var obj1 = new Encapsulate() 
 console.log(obj1.str)     //accessible 
 //console.log(obj1.str2)   //compilation Error as str2 is privatec