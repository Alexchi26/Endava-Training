package com.endava;

public class Pizza {

    private PizzaSize size;
    private int cheeseToppings;
    private int pepperoniToppings;
    private int hamToppings;

    public Pizza(PizzaSize size, int cheeseToppings, int pepperoniToppings, int hamToppings){
        this.size = size;
        this.cheeseToppings = cheeseToppings;
        this.pepperoniToppings = pepperoniToppings;
        this.hamToppings = hamToppings;
    }

    public double calcCost(){
        if(this.size == PizzaSize.SMALL){
            return 10 + 2 * (this.cheeseToppings + this.pepperoniToppings + this.hamToppings);
        } else if (this.size == PizzaSize.MEDIUM) {
            return 12 + 2 * (this.cheeseToppings + this.pepperoniToppings + this.hamToppings);
        }else{
            return 14 + 2 * (this.cheeseToppings + this.pepperoniToppings + this.hamToppings);
        }
    }

    public String getDescription(){
        return "This is a " + this.size.toString().toLowerCase() + " pizza, containing "
                + this.cheeseToppings + " cheese toppings, "
                + this.pepperoniToppings + " pepperoni toppings and "
                + this.hamToppings + " ham toppings.";
    }

}
