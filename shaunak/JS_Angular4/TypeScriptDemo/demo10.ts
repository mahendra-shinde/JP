class Calculate {
    Add(a: number, b?: number): number {
        return a + b;
    }
}

var obj = new Calculate();
console.log(obj.Add(1, 2));
console.log("*****************");
console.log(obj.Add(2));



