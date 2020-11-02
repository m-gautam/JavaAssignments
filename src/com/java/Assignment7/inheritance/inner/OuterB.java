package com.java.Assignment7.inheritance.inner;

public class OuterB {

    public static class InnerB extends OuterA.InnerA {

        InnerB(int a) {
            super(a);
            System.out.println("ClassB");
        }
    }
}
