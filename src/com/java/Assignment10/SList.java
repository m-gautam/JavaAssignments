package com.java.Assignment10;

public class SList<E> {

    public Link<E> head;

    public SListIterator<E> iterator(){
        return new SListIterator<>();
    }

}
