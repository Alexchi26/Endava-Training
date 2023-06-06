package com.endava;

import com.endava.Ex49.Monster;
import com.endava.Ex49.Player;
import org.junit.Test;

public class Ex49Test {

    @Test
    public void outputTest() {
        Player player = new Player("Alex", 100, 10);
        Monster monster = new Monster("Goblin", 50, 4);

        System.out.println(player);
        System.out.println(monster);
    }
}
