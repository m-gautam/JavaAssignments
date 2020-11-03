package com.java.Assignment8;

public class Main {
    public static void main(String[] args){
//        ErrorHandling obj = new ErrorHandling();
//        obj.writeInFile();

        int [] arr = {1, 2, 3, 4};

        Demo demo = new Demo();
            try
            {
                demo.getException("hello world",null);
            }
            catch(MyException me)
            {
                System.out.println(me); //it calls the toString() method of user-defined Exception
            }
    }
}
