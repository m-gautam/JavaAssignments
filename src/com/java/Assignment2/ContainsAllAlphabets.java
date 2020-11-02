package com.java.Assignment2;

public class ContainsAllAlphabets {

    public boolean checkAllCharacters(String str){
        int[] count = new int[26];
        int ct = 0;

        // Traversing over input string
        for(char c : str.toCharArray()){

            // Contains all the alphabets
            String alphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

            int index = alphabets.indexOf(Character.toUpperCase(c));
            if(index != -1 && count[index] == 0){
                count[index] = 1;
                ct += 1;
            }
        }

        return ct == 26;

    }
}