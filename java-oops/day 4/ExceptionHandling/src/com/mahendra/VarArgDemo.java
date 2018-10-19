package com.mahendra;

import java.util.Arrays;

public class VarArgDemo {

    static int doSum(int[] data){
        int sum=0;
        for(int i=0;i<data.length;i++){
            sum += data[i];
        }
        return sum;
    }

    static int doSum2(int ... data){
        int sum=0;
        for(int i=0;i<data.length;i++){
            sum += data[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int []array = {10,2,30};
        int sum1 = doSum(array);
        int sum2 = doSum2(10,2,30,6,7,8,6,33,666,12,90);
        Arrays.sort(array);

        Arrays.fill(array,2);

        String data = Arrays.toString(array);

        System.out.println("Array values :"+data);
    }
}
