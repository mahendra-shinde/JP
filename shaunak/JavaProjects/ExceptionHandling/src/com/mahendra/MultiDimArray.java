package com.mahendra;

public class MultiDimArray {
    public static void main(String[] args) {
        int data[][] = new int[4][3];
        //Create FIRST ROW
        data[0] = new int[]{55,58,65};
        //Create SECOND ROW
        data[1] = new int[]{76,88,91};

        //Third ROW
        data[2] = new int[]{67,77,73};

        data[3] = new int[]{79,55,87};

        //Calculate and print SUM of each ROW
        for(int row = 0; row<data.length;row++){
            int sum = 0;
            for(int col = 0; col< data[row].length;col++){
                sum += data[row][col];
            }
            System.out.println("Sum is "+sum);
        }
    }
}
