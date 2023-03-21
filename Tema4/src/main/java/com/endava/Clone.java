package com.endava;

import java.util.LinkedList;

public class Clone {

    public static LinkedList<Integer> cloneLinkedList(LinkedList<Integer> originalList){
        System.out.println("The original list: " + originalList);

        LinkedList<Integer> clonedList = new LinkedList<>(originalList);
        System.out.println("The cloned list : " + clonedList);

        return clonedList;
    }
}
