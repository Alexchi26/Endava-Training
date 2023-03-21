package com.endava;

import java.util.Collections;
import java.util.LinkedList;

public class Shuffle {

    public static void shuffleLinkedList(LinkedList<Integer> linkedList){
        System.out.println("The linked list before it was shuffled " + linkedList);

        Collections.shuffle(linkedList);
        System.out.println("The linked list after it was shuffled: " + linkedList);
    }
}
