package com.java.Assignment7.inheritance.cycle;

public class Bicycle extends Cycle {
    public Bicycle() {
        System.out.println("inside bicycle class");
    }

    public void balance(){
        System.out.println("balance of cycle depends on user");
    }
}
