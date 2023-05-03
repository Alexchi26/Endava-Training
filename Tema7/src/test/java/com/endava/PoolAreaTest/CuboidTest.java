package com.endava.PoolAreaTest;

import com.endava.PoolArea.Cuboid;
import com.endava.PoolArea.Rectangle;
import org.junit.Assert;
import org.junit.Test;

public class CuboidTest {

    @Test
    public void cuboidTest() {

        Rectangle rectangle = new Rectangle(5, 10);

        System.out.println("rectangle.width= " + rectangle.getWidth());
        System.out.println("rectangle.length= " + rectangle.getLength());
        System.out.println("rectangle.area= " + rectangle.getArea());

        Assert.assertEquals(5.0, rectangle.getWidth(), 0.1);
        Assert.assertEquals(10.0, rectangle.getLength(), 0.1);
        Assert.assertEquals(50.0, rectangle.getArea(), 0.1);

        Cuboid cuboid = new Cuboid(5,10,5);

        System.out.println("cuboid.width= " + cuboid.getWidth());
        System.out.println("cuboid.length= " + cuboid.getLength());
        System.out.println("cuboid.area= " + cuboid.getArea());
        System.out.println("cuboid.height= " + cuboid.getHeight());
        System.out.println("cuboid.volume= " + cuboid.getVolume());

        Assert.assertEquals(5.0, cuboid.getWidth(), 0.1);
        Assert.assertEquals(10.0, cuboid.getLength(), 0.1);
        Assert.assertEquals(50.0, cuboid.getArea(), 0.1);
        Assert.assertEquals(250.0, cuboid.getVolume(), 0.1);
    }
}
