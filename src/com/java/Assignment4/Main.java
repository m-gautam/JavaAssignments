package com.java.Assignment4;

import java.text.ParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        KycForm kyCform = new KycForm();

        // taking input from user
        Scanner inp = new Scanner(System.in);
        int t = inp.nextInt();
        inp.nextLine();
        String s;
        for(int i = 0; i < t; i++){
            s = inp.nextLine();

            String[] dates = s.split(" ");

            String regDate = dates[0];
            String currDate = dates[1];

            kyCform.dateFormat(regDate, currDate);


        }
    }
}
