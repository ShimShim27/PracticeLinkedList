package org.example.base;

import org.example.data.Node;

public interface LinkedList {
    void setCurrentValue(final int value);
    void setNextValue(final int value);
    Integer getCurrentValue();
    Integer getPrevValue();
    Integer getNextValue();
    Integer getSum();
}
