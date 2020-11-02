package com.java.Assignment7.inheritance.factory;

public class Tricycle implements Cycle{
    @Override
    public void balance() {
        System.out.println("It is stable");
    }

    @Override
    public void wheels() {
        System.out.println("It has three wheels");
    }

    @Override
    public void build() {
        System.out.println("tricycle structure");
    }
}
