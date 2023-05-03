package com.endava.PoolAreaTest;

import com.endava.PoolArea.Rectangle;
import org.junit.Assert;
import org.junit.Test;

public class RectangleTest {

    @Test
    public void rectangleTest() {

        Rectangle rectangleTest1 = new Rectangle(4.5, 7.3);
        Rectangle rectangleTest2 = new Rectangle(-4.5, -7.3);

        Assert.assertEquals(4.5, rectangleTest1.getWidth(), 0.1);
        Assert.assertEquals(7.3, rectangleTest1.getLength(), 0.1);

        Assert.assertEquals(0, rectangleTest2.getWidth(), 0.1);
        Assert.assertEquals(0, rectangleTest2.getLength(), 0.1);

        Assert.assertEquals(32.85, rectangleTest1.getArea(), 0.1);
        Assert.assertEquals(0, rectangleTest2.getArea(), 0.1);
    }
}
