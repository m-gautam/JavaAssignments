package com.java.Assignment7.inheritance.rodent;

public class Rats extends Rodent {

    public Rats(){
        System.out.println("inside rats class\n");
    }

    @Override
    public void habitat(){
        System.out.println("House rats typically like warmer climates, while brown rats live in temperate climates.\n");
    }

    @Override
    public void group() {
        System.out.println("Rats are mammals\n");
    }
}
