package com.java.Assignment6;

public class OverloadingConstructors {

    int n;

    public OverloadingConstructors(){
        System.out.println("Called from other constructor");
    }

    public OverloadingConstructors(int n){
        this();
//        this.n = n;
    }
}
