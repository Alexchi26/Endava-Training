package com.endava;

import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

import static com.endava.Clone.cloneLinkedList;

public class CloneTest {
    @Test
    public void cloneListTest() {
        LinkedList<Integer> linkedList = new LinkedList<>(List.of(1, -2, 532, 11, 7564, -421));
        LinkedList<Integer> clonedList = cloneLinkedList(linkedList);


        Assert.assertEquals(linkedList, clonedList);


    }
}
