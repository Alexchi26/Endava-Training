package com.endava;

import java.util.ArrayList;
import java.util.Collections;

public class SwapTwoElements {
    public static void swapElements(ArrayList<Integer> list, Integer firstElement, Integer secondElement){
        Collections.swap(list, firstElement, secondElement);
    }
}
