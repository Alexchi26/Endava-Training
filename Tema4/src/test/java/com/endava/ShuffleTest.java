package com.endava;

import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

import static com.endava.Shuffle.shuffleLinkedList;


public class ShuffleTest {
    @Test
    public void shuffleLinkedListTest() {
        LinkedList<Integer> linkedList = new LinkedList<>(List.of(1, -2, 532, 11, 7564, -421));
        LinkedList<Integer> expectedLinkedList = new LinkedList<>(List.of(1, -2, 532, 11, 7564, -421));

        shuffleLinkedList(linkedList);

        Assert.assertNotEquals(expectedLinkedList, linkedList);


    }
}
