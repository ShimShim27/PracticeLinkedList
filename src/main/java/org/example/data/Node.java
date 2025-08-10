package org.example.data;

import lombok.Data;

@Data
public class Node {
    private int value;
    private Node next;
    private Node prev;
}
