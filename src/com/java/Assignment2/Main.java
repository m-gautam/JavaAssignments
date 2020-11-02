package com.java.Assignment2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        // taking input
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        // String str="The quick brown fox jumps over the lazy dog";
        ContainsAllAlphabets obj = new ContainsAllAlphabets();
        System.out.println(obj.checkAllCharacters(str));

    }
}
