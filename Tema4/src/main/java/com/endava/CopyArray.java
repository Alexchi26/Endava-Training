package com.endava;

import java.util.ArrayList;
import java.util.Collections;

public class CopyArray {
    public static void copyElements(ArrayList<Integer> destination, ArrayList<Integer> source){
        Collections.copy(destination, source);
    }
}
