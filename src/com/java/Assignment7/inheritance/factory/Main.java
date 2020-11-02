package com.java.Assignment7.inheritance.factory;

public class Main {
    public static void main(String[] args) {

        CycleFactory cf = new CycleFactory();

        Cycle newCycle = cf.buildCycle("tricycle");
        newCycle.build();

        Cycle newCycle2 = cf.buildCycle("bicycle");
        newCycle2.build();

    }
}
