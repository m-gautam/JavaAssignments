package gautam.assignment.main;

import gautam.assignment.data.Initialization;
import gautam.assignment.singleton.Assignment_5b;

import static gautam.assignment.singleton.Assignment_5b.print;

public class Main {
    public static void main(String[] args){

        // Creating instance of Assignment_5 class
        Initialization initialization = new Initialization();
        initialization.printFields();
        initialization.printLocal();

        // Creating instance of Assignment_5b class
        Assignment_5b newObj = print("abc");
        newObj.printField();

    }
}
