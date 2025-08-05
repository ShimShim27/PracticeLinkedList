package org.example;

import org.example.base.LinkedList;
import org.example.impl.DefaultLinkedList;

public class Main {
    public static void main(String[] args) {
        final LinkedList linkedList= new DefaultLinkedList();
        linkedList.setCurrentValue(5);
        printValue(linkedList.getCurrentValue());
        linkedList.setCurrentValue(7);
        printValue(linkedList.getCurrentValue());
        linkedList.setNextValue(2);
        printValue(linkedList.getCurrentValue());
        linkedList.setNextValue(9);
        printValue(linkedList.getCurrentValue());
        linkedList.getPrevValue();
        printValue(linkedList.getCurrentValue());
        linkedList.getPrevValue();
        printValue(linkedList.getCurrentValue());
        linkedList.setCurrentValue(-8);
        printValue(linkedList.getCurrentValue());
        linkedList.getNextValue();
        printValue(linkedList.getCurrentValue());
        linkedList.getNextValue();
        printValue(linkedList.getCurrentValue());
        linkedList.getNextValue();
        printValue(linkedList.getCurrentValue());
        linkedList.setCurrentValue(5);
        printValue(linkedList.getCurrentValue());

        print(String.format("Is sum equal to 8 : %s", linkedList.getSum() == 8));
    }

    private static void printValue(final Integer value) {
        print(String.format("Now printing current value: %s\n", value));
    }
    private static void print(final Object obj) {
        System.out.println(obj);
    }
}