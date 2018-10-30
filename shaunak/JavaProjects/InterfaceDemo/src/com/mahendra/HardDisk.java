package com.mahendra;

public class HardDisk implements Storage {
    @Override
    public void read() {
        System.out.println("Reading from HDD");
    }

    @Override
    public void write() {
        System.out.println("Writing to HDD");
    }
}
