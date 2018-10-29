package com.mahendra;

public class Computer {
    //Non Accessible outsiders
    private Display display;
    private Storage disk;


    //Accessible to Outsiders
    public Computer(Display display, Storage disk) {
        this.display = display;
        this.disk = disk;
        //Test them
        this.display.show();
        this.disk.read();
    }


}
