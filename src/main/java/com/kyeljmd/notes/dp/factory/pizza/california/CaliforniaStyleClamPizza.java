package com.kyeljmd.notes.dp.factory.pizza.california;

import com.kyeljmd.notes.dp.factory.PizzaIngredientFactory;
import com.kyeljmd.notes.dp.factory.pizza.Pizza;

/**
 * @author kdavid   2/4/2017.
 */
public class CaliforniaStyleClamPizza extends Pizza {

    private PizzaIngredientFactory ingredientFactory;

    public CaliforniaStyleClamPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
        name = "California Pepperoni  Pizza";
    }

    @Override
    public void prepare() {
        System.out.println("Preparing "+ name);
        this.dough = ingredientFactory.createDough();
        this.cheese = ingredientFactory.createCheese();
        this.sauce = ingredientFactory.createSauce();
        this.pepperoni = ingredientFactory.createPepperoni();
        this.clam = ingredientFactory.createClam();
        this.toppings.forEach(t -> System.out.println("Adding Topping: "+ t));
    }
}
