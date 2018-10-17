package com.mahendra;

public class Main {

    public static void main(String[] args) {
        //Type of Variable could be Class or Interface or Primitive
        // Variable of BASE type can HOLD Object of DERIVED type
        Display d = new Monitor();
        Storage h = new HardDisk();
        Computer comp = new Computer(d, h);
        //Invoke Constructor
        // Computer(d,h)
        // display = d, disk = h

    }
}
