class Car{
    engine:string;

    constructor(engine:string){
        this.engine=engine;
    }

    disp():void{
        console.log("Function displays engine is : " +this.engine)
    }
}

var obj = new Car("Honda")

console.log("Reading attribute value Engine as : "+ obj.engine);

obj.disp();
