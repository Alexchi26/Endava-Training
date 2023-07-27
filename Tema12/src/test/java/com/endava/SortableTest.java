package com.endava;

import com.endava.Sort.SortableImplementation;
import org.junit.Test;

import static com.endava.Sort.BubbleSortWithGenericClass.bubbleSort;

public class SortableTest {

    @Test
    public void sortableTest() {

        SortableImplementation[] arrayToBeSorted = {
                new SortableImplementation(0),
                new SortableImplementation(-3),
                new SortableImplementation(785),
                new SortableImplementation(34),
                new SortableImplementation(5)
        };

        System.out.println("The array before sorting: ");
        for (SortableImplementation element : arrayToBeSorted) {
            System.out.print(element.getValue() + " ");
        }

        bubbleSort(arrayToBeSorted);

        System.out.println("\n" + "The array after sorting: ");
        for (SortableImplementation element : arrayToBeSorted) {
            System.out.print(element.getValue() + " ");
        }
    }
}
