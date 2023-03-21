package com.endava;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static com.endava.CommonElement.findCommonElements;

public class CommonElementTest {

    @Test
    public void commonElementTest() {
        String[] firstArray = {"John", "JOHN", "john", "Alex"};
        String[] secondArray = {"John", "JohN", "alex"};

        ArrayList<String> expectedList = new ArrayList<>(List.of("John"));

        Assert.assertEquals(expectedList, findCommonElements(firstArray, secondArray));
    }
}
