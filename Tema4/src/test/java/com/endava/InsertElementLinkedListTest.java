package com.endava;

import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

import static com.endava.InsertElementLinkedList.addElementToASpecifiedPosition;

public class InsertElementLinkedListTest {
    @Test
    public void addingAnElementTest() {
        LinkedList<Integer> linkedList = new LinkedList<>(List.of(1, 2, 3, 4, 5, 6));
        LinkedList<Integer> expectedLinkedList = new LinkedList<>(List.of(1, 7, 2, 3, 4, 5, 6));

        addElementToASpecifiedPosition(linkedList, 1, 7);

        Assert.assertEquals(expectedLinkedList, linkedList);


    }
}
