package impl;

import org.example.impl.DefaultLinkedList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class DefaultLinkedListTest {
    private DefaultLinkedList defaultLinkedList;

    @BeforeEach
    public void init() {
        defaultLinkedList = new DefaultLinkedList();
    }

    @Test
    @DisplayName("Get and set linked list current value")
    public void GetAndSetCurrentValue_Should_GetAndSetCurrentValue(){
        assertNull(defaultLinkedList.getCurrentValue());
        defaultLinkedList.setCurrentValue(5);
        assertEquals(5, defaultLinkedList.getCurrentValue());
        defaultLinkedList.setCurrentValue(50);
        assertEquals(50, defaultLinkedList.getCurrentValue());
    }

    @Test
    @DisplayName("Get and set linked list next value")
    public void GetAndSetNextValue_Should_GetAndSetNextValue(){
        assertNull(defaultLinkedList.getNextValue());
        defaultLinkedList.setNextValue(5);
        assertEquals(5, defaultLinkedList.getNextValue());
        defaultLinkedList.setNextValue(4);
        assertEquals(4, defaultLinkedList.getNextValue());

        defaultLinkedList.setNextValue(8);
        defaultLinkedList.getNextValue();
        defaultLinkedList.setNextValue(28);
        assertEquals(28, defaultLinkedList.getNextValue());

        defaultLinkedList.getNextValue();
        defaultLinkedList.getNextValue();
        defaultLinkedList.getNextValue();
        assertNull(defaultLinkedList.getNextValue());
    }


    @Test
    @DisplayName("Get and set linked list current node")
    public void GetPrevValue_Should_ReturnAccuratePreviousValue(){
        assertNull(defaultLinkedList.getPrevValue());
        defaultLinkedList.setNextValue(20);
        defaultLinkedList.getNextValue();
        defaultLinkedList.setNextValue(29);
        defaultLinkedList.getNextValue();
        defaultLinkedList.setNextValue(0);
        defaultLinkedList.getNextValue();
        defaultLinkedList.setNextValue(-22);
        defaultLinkedList.getNextValue();
        assertEquals(0, defaultLinkedList.getPrevValue());
        assertEquals(29, defaultLinkedList.getPrevValue());

        defaultLinkedList.getPrevValue();
        defaultLinkedList.getPrevValue();
        defaultLinkedList.getPrevValue();
        assertNull(defaultLinkedList.getPrevValue());
    }

    @Test
    @DisplayName("Get and set test combination of previous and next")
    public void GetAndSetOfMixPrevNext_ShouldReturn_AccurateGetAndSetOfMixPrevNext() {
        defaultLinkedList.setCurrentValue(5);
        assertNull(defaultLinkedList.getPrevValue());
        assertNull(defaultLinkedList.getNextValue());

        defaultLinkedList.setNextValue(10);
        assertNull(defaultLinkedList.getPrevValue());
        assertEquals(10, defaultLinkedList.getNextValue());

        defaultLinkedList.getNextValue();

        defaultLinkedList.setNextValue(-1);
        defaultLinkedList.getNextValue();

        defaultLinkedList.setNextValue(28);
        defaultLinkedList.getNextValue();


        defaultLinkedList.getNextValue();
        defaultLinkedList.getNextValue();

        defaultLinkedList.setNextValue(12);
        defaultLinkedList.getNextValue();

        defaultLinkedList.getPrevValue();

        defaultLinkedList.setNextValue(39);
        defaultLinkedList.getNextValue();

        defaultLinkedList.getPrevValue();

        assertEquals(81, defaultLinkedList.getSum());

    }

    @Test
    @DisplayName("Get sum should return accurate sum")
    public void GetSum_ShouldReturn_AccurateSum() {
        defaultLinkedList.setNextValue(11);
        defaultLinkedList.getNextValue();
        defaultLinkedList.setNextValue(20);
        defaultLinkedList.getNextValue();
        defaultLinkedList.setNextValue(4);
        defaultLinkedList.getNextValue();
        defaultLinkedList.setNextValue(5);
        defaultLinkedList.getNextValue();
        defaultLinkedList.setNextValue(23);
        defaultLinkedList.getNextValue();
        defaultLinkedList.setNextValue(28);
        defaultLinkedList.getNextValue();

        defaultLinkedList.getPrevValue();
        defaultLinkedList.getPrevValue();
        defaultLinkedList.getPrevValue();

        defaultLinkedList.setCurrentValue(12);

        defaultLinkedList.getNextValue();
        defaultLinkedList.getNextValue();

        assertEquals(99, defaultLinkedList.getSum());
    }



    @Test
    @DisplayName("Get sum should not change reference")
    public void GetSum_ShouldNot_ChangeReference() {
        defaultLinkedList.setNextValue(77);
        defaultLinkedList.getNextValue();
        defaultLinkedList.setNextValue(11);
        defaultLinkedList.getNextValue();
        defaultLinkedList.setNextValue(28);
        defaultLinkedList.getNextValue();
        defaultLinkedList.setNextValue(35);
        defaultLinkedList.getNextValue();
        defaultLinkedList.setNextValue(-10);
        defaultLinkedList.getNextValue();
        defaultLinkedList.setNextValue(12);
        defaultLinkedList.getNextValue();
        defaultLinkedList.setNextValue(83);
        defaultLinkedList.getNextValue();

        defaultLinkedList.getPrevValue();
        defaultLinkedList.getPrevValue();
        defaultLinkedList.getPrevValue();
        defaultLinkedList.getNextValue();

        assertEquals(-10, defaultLinkedList.getCurrentValue());

    }

}
