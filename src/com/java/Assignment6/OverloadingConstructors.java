package com.java.Assignment6;

public class OverloadingConstructors {

    int n;

    public OverloadingConstructors(){

    }

    public OverloadingConstructors(int n){
        this();
        this.n = n;
    }
}
