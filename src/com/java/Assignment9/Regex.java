package com.java.Assignment9;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Regex {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            String str = in.nextLine();

            System.out.println(Pattern.matches("[A-Z][a-z ',]+[.]", str));
        }
}
