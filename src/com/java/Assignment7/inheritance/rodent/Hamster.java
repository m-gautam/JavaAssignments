package com.java.Assignment7.inheritance.rodent;

public class Hamster extends Rodent {

    public Hamster(){
        System.out.println("inside hamster class\n");
    }

    @Override
    public void habitat(){
        System.out.println("They like to live in warm, dry areas, sand dunes and the edges of deserts.\n");
    }

    @Override
    public void group() {
        System.out.println("Hamster are mammals\n");
    }
}
