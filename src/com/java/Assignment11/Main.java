package com.java.Assignment11;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) throws Exception{

        CharacterOccurrence characterOccurrence = new CharacterOccurrence();

        FileReader file = new FileReader(args[0]);
        WriteFile writeFile = new WriteFile();

        characterOccurrence.out = new PrintWriter(new FileWriter("Output.txt"));
        ReadFile readFile = new ReadFile();

        readFile.readFromFile(file, characterOccurrence.occurrence);
        writeFile.writeInFile(characterOccurrence.occurrence, characterOccurrence.out);

        characterOccurrence.out.close();
    }
}
