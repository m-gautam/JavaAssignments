package com.java.Assignment11;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class ReadFile {
    public void readFromFile(FileReader file, HashMap<Character, Integer> occurrence) throws IOException {
        int i;
        while((i = file.read()) != -1){
            char ch = (char) i;

            int v;
            if(occurrence.containsKey(ch)){
                v = occurrence.get(ch);
                occurrence.put(ch, v+1);
            }
            else{
                occurrence.put(ch, 1);
            }
        }
    }
}
