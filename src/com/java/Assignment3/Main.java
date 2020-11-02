package com.java.Assignment3;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        PingHost pingHost = new PingHost();

        Scanner in = new Scanner(System.in);
        pingHost.address = in.nextLine();
        pingHost.n = Integer.parseInt(in.nextLine());
        pingHost.array = new double[pingHost.n];

        pingHost.ping();
//        pingHost.sortArray(pingHost.array, pingHost.n);

        Arrays.sort(pingHost.array);
        pingHost.printMedian();

    }
}
