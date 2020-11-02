package com.java.Assignment7.inheritance.rodent;

public class Gerbil extends Rodent {

    public Gerbil(){
        System.out.println("inside gerbil class\n");
    }

    @Override
    public void habitat(){
        System.out.println("Gerbils are desert or semi-desert species,inhabiting vast expanses of sandy territory\n");
    }

    @Override
    public void group() {
        System.out.println("Gerbil are mammals\n");
    }
}
