package com.endava;

import org.junit.Assert;
import org.junit.Test;

public class WallTest {

    public static void main(String[] args) {

        // Test code provided by Udemy
        Wall wall = new Wall(5,4);
        System.out.println("area= " + wall.getArea());

        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());
    }

    @Test
    public void wallTest() {

        Wall testWall1 = new Wall();
        Wall testWall2 = new Wall();
        Wall testWall3 = new Wall(5.7, 4.7);
        Wall testWall4 = new Wall(-5.2, -0.4);

        testWall1.setWidth(4.0);
        testWall1.setHeight(6.2);

        testWall2.setWidth(0.5);
        testWall2.setHeight(-5.6);

        Assert.assertEquals(4.0, testWall1.getWidth(), 0.1);
        Assert.assertEquals(6.2, testWall1.getHeight(), 0.1);
        Assert.assertEquals(24.8, testWall1.getArea(), 0.1);


        Assert.assertEquals(0.5, testWall2.getWidth(), 0.1);
        Assert.assertEquals(0, testWall2.getHeight(), 0.1);
        Assert.assertEquals(0, testWall2.getArea(), 0.1);

        Assert.assertEquals(5.7, testWall3.getWidth(), 0.1);
        Assert.assertEquals(4.7, testWall3.getHeight(), 0.1);
        Assert.assertEquals(26.79, testWall3.getArea(), 0.1);

        Assert.assertEquals(0, testWall4.getWidth(), 0.1);
        Assert.assertEquals(0, testWall4.getHeight(), 0.1);
        Assert.assertEquals(0, testWall4.getArea(), 0.1);
    }
}
