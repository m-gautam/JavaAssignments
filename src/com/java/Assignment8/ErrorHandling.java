package com.java.Assignment8;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ErrorHandling {
    private static final int SIZE = 10;
    private PrintWriter out = null;
    private final int[] arr = new int[SIZE];

    public void writeInFile(){
//        String str = null;
        try{
            System.out.println("inside try Statement");
            out = new PrintWriter(new FileWriter("/Users/user/Documents/Study/LDP/Java assignments/" +
                    "src/com/java/Assignment8/Outfile.txt"));
            for(int i = 0; i < 10; i++){
                out.println(866164);
                arr[i] = 1;
            }
        }
        // checked exception
        catch (IOException e){
            System.err.println("Caught IO Exception " + e);
        }

        // Runtime Exception : if access index of array which does not exist
        catch (ArrayIndexOutOfBoundsException e){
            System.err.println("Error : IndexOutOfBoundsException " + e);
        }

        // Runtime exception : if variable is null and is used to access it.
        catch (NullPointerException e){
            System.err.println("Error : NUllPointerException " + e);
        }

        finally{
            if(out != null){
                System.out.println("Closing PrintWriter");
                out.close();
            }
            else{
                System.out.println("PrintWriter not open");
            }
        }
    }
}
