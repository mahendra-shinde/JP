package com.mahendra;

public class Point {
    private int x, y;

    public Point(int x, int y) {
        System.out.println("Value of X:"+x+", Y: "+y);
        this.x = x;
        this.y = y;
    }


    public static void main(String arg[]){
        int a = 100;
        int b = 78;
        Point p = new Point(a,b);

    }
}
