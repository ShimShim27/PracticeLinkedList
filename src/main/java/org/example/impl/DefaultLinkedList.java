package org.example.impl;

import org.example.base.LinkedList;
import org.example.data.Node;

public class DefaultLinkedList implements LinkedList {

    private Node currentNode;

    @Override
    public void setCurrentValue(final int value) {
        createCurrentNode();
        currentNode.setValue(value);
    }

    @Override
    public void setNextValue(final int value) {
        createCurrentNode();
        Node next = currentNode.getNext();
        next = next == null ? new Node(): next;
        next.setValue(value);
        currentNode.setNext(next);
        next.setPrev(currentNode);
    }

    @Override
    public Integer getCurrentValue() {
        return currentNode == null? null : currentNode.getValue();
    }

    @Override
    public Integer getPrevValue() {
        if (currentNode == null || currentNode.getPrev() == null){
            return null;
        }
        currentNode = currentNode.getPrev();
        return currentNode.getValue();
    }

    @Override
    public Integer getNextValue() {
        createCurrentNode();
        final Node next = currentNode.getNext();
        currentNode = next == null ? currentNode : next;
        return next == null ? null : next.getValue();
    }

    @Override
    public Integer getSum() {
        if (currentNode == null){
            return null;
        }

        Integer sum = null;
        Node cursor = currentNode;
        Node prev;
        while ((prev =cursor.getPrev()) != null) {
            cursor = prev;
        }

        while (cursor != null) {
            if (sum == null){
                sum = 0;
            }
            sum += cursor.getValue();
            cursor = cursor.getNext();
        }
        return sum;
    }

    private void createCurrentNode() {
        currentNode = currentNode == null ? new Node() : currentNode;
    }
}
