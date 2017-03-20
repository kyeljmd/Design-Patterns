package com.kyeljmd.notes.dp.factory.pizza.store;

import com.kyeljmd.notes.dp.factory.NYPizzaIngredientFactory;
import com.kyeljmd.notes.dp.factory.PizzaIngredientFactory;
import com.kyeljmd.notes.dp.factory.pizza.*;
import com.kyeljmd.notes.dp.factory.pizza.ny.NYStyleCheesePizza;
import com.kyeljmd.notes.dp.factory.pizza.ny.NYStyleClamPizza;
import com.kyeljmd.notes.dp.factory.pizza.ny.NYStylePepperoniPizza;

/**
 * @author kdavid   2/4/2017.
 */
public class NYPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) throws PizzaTypeNotAvailableException {

        PizzaIngredientFactory pizzaIngredientFactory = new NYPizzaIngredientFactory();

        switch (type) {
            case "cheese":
                return new NYStyleCheesePizza(pizzaIngredientFactory);
            case "pepperoni":
                return new NYStylePepperoniPizza(pizzaIngredientFactory);
            case "clam":
                return new NYStyleClamPizza(pizzaIngredientFactory);
            default:
                throw new PizzaTypeNotAvailableException();
        }
    }
}
