package com.endava;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class PizzaTest {
    @Test
    public void testPizza() {
        Pizza smallPizza = new Pizza(PizzaSize.SMALL, 2, 5, 10);
        Pizza mediumPizza = new Pizza(PizzaSize.MEDIUM, 4, 2, 7);
        Pizza largePizza = new Pizza(PizzaSize.LARGE, -1, 654654, 6546546);

        double smallPizzaCost = smallPizza.calcCost();
        double expectedResult = 10 + 2 * (2 + 5 + 10);
        assertEquals(expectedResult, smallPizzaCost, 0.0);
    }

    @Test
    public void testPizzaOrder() {

        Pizza firstPizza = new Pizza(PizzaSize.SMALL, 2, 5, 7);
        Pizza secondPizza = new Pizza(PizzaSize.MEDIUM, 1, 3, 2);
        Pizza thirdPizza = new Pizza(PizzaSize.SMALL, 0, 6, 0);
        Pizza fourthPizza = new Pizza(PizzaSize.LARGE, 8, 7, 8);

        List<Pizza> pizzas = List.of(firstPizza, secondPizza, thirdPizza);
        PizzaOrder pizzaOrder = new PizzaOrder();
        pizzaOrder.setPizzas(pizzas);

        assertEquals(pizzas.size(), pizzaOrder.getPizzas().size());

        double expectedTotalCost = firstPizza.calcCost() + secondPizza.calcCost() + thirdPizza.calcCost();

        assertEquals(expectedTotalCost, pizzaOrder.calcTotal(), 0);


    }

    @Test
    public void shouldNotAddMorePizzaThanTheMaximumSize() {
        Pizza firstPizza = new Pizza(PizzaSize.SMALL, 2, 5, 7);
        Pizza secondPizza = new Pizza(PizzaSize.MEDIUM, 1, 3, 2);
        Pizza thirdPizza = new Pizza(PizzaSize.SMALL, 0, 6, 0);
        Pizza fourthPizza = new Pizza(PizzaSize.LARGE, 8, 7, 8);

        List<Pizza> pizzas = List.of(firstPizza, secondPizza, thirdPizza, fourthPizza);
        PizzaOrder pizzaOrder = new PizzaOrder();
        pizzaOrder.setPizzas(pizzas);

        assertNull(pizzaOrder.getPizzas());
    }
}
