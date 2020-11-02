package com.java.Assignment1;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        FileSearch fileSearch = new FileSearch();

        // creates a directory variable
        File folder = new File("/Users/user/");

        // Taking input for regular expression
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String reg = br.readLine();

        while(!reg.equals("")) {
            fileSearch.iterateDirectory(folder, reg);
            reg = br.readLine();
        }

    }
}
