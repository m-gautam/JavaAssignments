package com.java.Assignment6;

public class VampireNumber2 {

    public void parseNumber(int n){
        int d1 = n/1000;
        int d2 = (n%1000)/100;
        int d3 = (n%100)/10;
        int d4 = (n%10);

        int [] arr = new int[16];

        int t1 = d1*10 + d2;
        int t2 = d3*10 + d4;

        arr[0] = d1*10 + d2;
        arr[1] = d3*10 + d4;

        arr[2] = d1*10 + d2;
        arr[3] = d4*10 + d3;

        arr[4] = d1*10 + d3;
        arr[5] = d2*10 + d4;

        arr[6] = d1*10 + d3;
        arr[7] = d2*10 + d4;

        arr[8] = d1*10 + d3;
        arr[9] = d4*10 + d2;

        arr[10] = d2*10 + d3;
//        arr[11] =



        if(t1*t2 == n){
            System.out.println(n);
        }
//        els
    }




}
