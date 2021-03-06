package com.kyeljmd.notes.dp.factory.pizza.chicago;

import com.kyeljmd.notes.dp.factory.PizzaIngredientFactory;
import com.kyeljmd.notes.dp.factory.pizza.Pizza;

/**
 * @author kdavid   2/4/2017.
 */
public class ChicagoStylePepperoniPizza extends Pizza {
    private PizzaIngredientFactory ingredientFactory;

    public ChicagoStylePepperoniPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
        name = "Chicago Pepperoni  Pizza";
    }

    @Override
    public void prepare() {
        System.out.println("Preparing "+ name);
        this.dough = ingredientFactory.createDough();
        this.cheese = ingredientFactory.createCheese();
        this.sauce = ingredientFactory.createSauce();
        this.clam = ingredientFactory.createClam();
        this.pepperoni = ingredientFactory.createPepperoni();
        this.toppings.forEach(t -> System.out.println("Adding Topping: "+ t));
    }
    @Override
    public void cut() {
        System.out.println("Cut into square pieces");
    }
}
