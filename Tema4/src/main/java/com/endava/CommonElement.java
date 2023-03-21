package com.endava;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CommonElement {

    private CommonElement() {
        throw new IllegalStateException("Utility class");
    }

    public static List<String> findCommonElements(String[] firstArray, String[] secondArray) {
        ArrayList<String> commonElementsList = new ArrayList<>();

        for (String firstIterator : firstArray) {
            for (String secondIterator : secondArray) {
                if (Objects.equals(firstIterator, secondIterator)) {
                    commonElementsList.add(firstIterator);
                }
            }
        }

        System.out.println("The list of the element found in comun is: " + commonElementsList);
        return commonElementsList;
    }
}
