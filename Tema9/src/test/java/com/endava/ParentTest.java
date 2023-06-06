package com.endava;

import com.endava.Parent.Parent;
import com.endava.Parent.ParentSubClass1;
import com.endava.Parent.ParentSubClass2;
import org.junit.Test;

public class ParentTest {

    @Test
    public void ObjectsTest() {

        Parent testObject1 = new ParentSubClass1();
        Parent testObject2 = new ParentSubClass2();

        testObject1.message();
        testObject2.message();
    }
}
