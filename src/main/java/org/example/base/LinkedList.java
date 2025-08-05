package org.example.base;

import org.example.data.Node;

public interface LinkedList {
    void setCurrentValue(final Integer value);
    void setNextValue(final Integer value);
    Integer getCurrentValue();
    Integer getPrevValue();
    Integer getNextValue();
    Integer getSum();
}
