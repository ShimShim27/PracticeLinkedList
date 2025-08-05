package org.example;

import org.example.base.LinkedList;
import org.example.impl.DefaultLinkedList;

public class Main {
    public static void main(String[] args) {
        final LinkedList linkedList= new DefaultLinkedList();
        linkedList.setCurrentValue(5);
        linkedList.setCurrentValue(7);
        linkedList.setNextValue(2);
        linkedList.setNextValue(9);
        linkedList.getPrevValue();
        linkedList.getPrevValue();
        linkedList.setCurrentValue(-8);
        linkedList.getNextValue();
        linkedList.getNextValue();
        linkedList.getNextValue();
        linkedList.setCurrentValue(5);
        System.out.println(linkedList.getSum() == 8);
    }
}