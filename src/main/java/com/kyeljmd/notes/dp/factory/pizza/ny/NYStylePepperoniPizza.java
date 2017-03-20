package com.kyeljmd.notes.dp.factory.pizza.ny;

import com.kyeljmd.notes.dp.factory.PizzaIngredientFactory;
import com.kyeljmd.notes.dp.factory.pizza.Pizza;

/**
 * @author kdavid   2/4/2017.
 */
public class NYStylePepperoniPizza extends Pizza {
    private PizzaIngredientFactory ingredientFactory;

    public NYStylePepperoniPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
        name = "NY Pepperoni Pizza";
    }

    @Override
    public void prepare() {
        System.out.println("Preparing "+ name);
        this.dough = ingredientFactory.createDough();
        this.cheese = ingredientFactory.createCheese();
        this.sauce = ingredientFactory.createSauce();
        this.pepperoni = ingredientFactory.createPepperoni();
        this.toppings.forEach(t -> System.out.println("Adding Topping: "+ t));
    }

    @Override
    public void cut() {
        System.out.println("Cut into triangular pieces");
    }
}
