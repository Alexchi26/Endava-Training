package com.endava;

import java.util.LinkedList;

public class InsertElementLinkedList {

    public static void addElementToASpecifiedPosition(LinkedList<Integer> linkedList, Integer position, Integer elementToBeAdded) {
        System.out.println("The linked list before adding the specified element: " + linkedList);

        linkedList.add(position, elementToBeAdded);
        System.out.println("The linked list after adding the specified element: " + linkedList);
    }
}
