package com.mahendra;

public class ZooMain {
    public static void main(String[] args) {
        Animal a1 = new Goat();
        Animal a2 = new Tiger();

        ZooKeeper keeper = new ZooKeeper();
        keeper.feed(a1);
        keeper.feed(a2);

    }
}
