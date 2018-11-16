class Encapsulate { 
    str:string = "hello" 
    private str2:string = "world" 
 }
  
 var obj = new Encapsulate() 
 console.log(obj.str)     //accessible 
 //console.log(obj.str2)   //compilation Error as str2 is privatec