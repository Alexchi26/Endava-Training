package com.endava;

import java.util.List;

public class PizzaOrder {
    private List<Pizza> pizzas;

    public PizzaOrder() {

    }

    public PizzaOrder(List<Pizza> pizzas) {
        if (pizzas.size() < 4) {
            this.pizzas = pizzas;
        } else {
            System.out.println("You cannot add more than 3 pizza to your order.");
        }
    }

    public void setPizzas(List<Pizza> pizzas) {
        if (pizzas.size() < 4) {
            this.pizzas = pizzas;
        } else {
            System.out.println("You cannot add more than 3 pizza to your order.");
        }

    }

    public List<Pizza> getPizzas() {
        return pizzas;
    }

    public double calcTotal() {
        double totalCost = 0.0;
        for (Pizza pizza : pizzas) {
            totalCost += pizza.calcCost();
        }
        return totalCost;
    }
}
