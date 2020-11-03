package com.java.Assignment10;

public class Link<E> {

        Link<E> next;
        public E data;

        public Link(E theData) {
            this.data = theData;
            next = null;
        }

}
