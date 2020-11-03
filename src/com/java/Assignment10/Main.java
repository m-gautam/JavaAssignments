package com.java.Assignment10;

public class Main {

    public static void main(String[] args){
        SList<Integer> list = new SList<>();
        SListIterator<Integer> sListIterator = list.iterator();

        // inserting the nodes in linked list
        sListIterator.insert(20, list.head);
        sListIterator.insert(30, list.head);
        sListIterator.insert(40, list.head);
        sListIterator.insert(50, list.head);

        sListIterator.print(list.head);

        sListIterator.delete(40, list.head);
        sListIterator.delete(60, list.head);

        sListIterator.print(list.head);
    }
}
