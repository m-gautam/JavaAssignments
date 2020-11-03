package Demo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CheckedExceptions {
    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("/Users/User/Documents/test.text");
            BufferedReader fileInput = new BufferedReader(file);

            for (int c = 0; c < 3; c++)
                System.out.println(fileInput.readLine());

            fileInput.close();
        }
        catch (IOException e){
            System.out.println(e);
        }
    }
}
