package com.endava.Sort;

public class SortableImplementation implements Sortable<SortableImplementation>{
    private int value;

    public SortableImplementation(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public int compareTo(SortableImplementation toBeComparedTo) {
        return Integer.compare(this.value, toBeComparedTo.value);
    }
}
