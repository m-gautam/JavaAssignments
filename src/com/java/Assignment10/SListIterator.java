package com.java.Assignment10;

public class SListIterator<E> {

    void insert(E ndata, Link<E> head){
        Link<E> tNode = head;
        Link<E> newNode = new Link<>(ndata);


        if(head == null){
            head = newNode;
            return;
        }

        while (tNode.next != null){
            tNode = tNode.next;
        }
        tNode.next = newNode;
    }

    void delete(E ndata, Link<E> head){
        Link<E> tNode = head;

        if(tNode.data == ndata){
            head = tNode.next;
            return;
        }

        while(tNode.next != null){
            if(tNode.next.data == ndata){
                tNode.next = tNode.next.next;
            }
            tNode = tNode.next;

        }
    }

    void print(Link<E> head){
        Link<E> tNode = head;
        while (tNode != null){
            System.out.println(tNode.data);
            tNode = tNode.next;
        }
    }
}
