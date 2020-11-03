package com.java.Assignment11;

import java.io.*;
import java.util.HashMap;

public class WriteFile {

    // this methods write occurrence of each character to file
    public void writeInFile(HashMap<Character, Integer> occurrence, PrintWriter out){
        for(char ch : occurrence.keySet()){
            if (ch == ' '){
                out.println("space : " + occurrence.get(ch));
            }
            else if(ch == '\n'){
                out.println("newline : " + occurrence.get(ch));
            }
            else {
                out.println(ch + " : " + occurrence.get(ch));
            }
        }
    }
}
