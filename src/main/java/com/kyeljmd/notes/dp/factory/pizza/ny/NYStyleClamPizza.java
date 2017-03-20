package com.kyeljmd.notes.dp.factory.pizza.ny;

import com.kyeljmd.notes.dp.factory.pizza.Pizza;
import com.kyeljmd.notes.dp.factory.PizzaIngredientFactory;

/**
 * @author kdavid   2/4/2017.
 */
public class NYStyleClamPizza extends Pizza {

    private PizzaIngredientFactory ingredientFactory;

    public NYStyleClamPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
        name = "NY Style Clam Pizza";
    }

    @Override
    public void prepare() {
        System.out.println("Preparing "+ name);
        this.dough = ingredientFactory.createDough();
        this.cheese = ingredientFactory.createCheese();
        this.sauce = ingredientFactory.createSauce();
        this.clam = ingredientFactory.createClam();
        this.toppings.forEach(t -> System.out.println("Adding Topping: "+ t));
    }

    @Override
    public void cut() {
        System.out.println("Cut into triangular pieces");
    }
}
