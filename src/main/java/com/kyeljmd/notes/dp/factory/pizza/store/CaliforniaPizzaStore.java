package com.kyeljmd.notes.dp.factory.pizza.store;

import com.kyeljmd.notes.dp.factory.CaliforniaPizzaFactory;
import com.kyeljmd.notes.dp.factory.PizzaIngredientFactory;
import com.kyeljmd.notes.dp.factory.pizza.Pizza;
import com.kyeljmd.notes.dp.factory.pizza.PizzaTypeNotAvailableException;
import com.kyeljmd.notes.dp.factory.pizza.california.CaliforniaStyleCheesePizza;
import com.kyeljmd.notes.dp.factory.pizza.california.CaliforniaStyleClamPizza;
import com.kyeljmd.notes.dp.factory.pizza.california.CaliforniaStylePepperoniPizza;

/**
 * @author kdavid   2/4/2017.
 */
public class CaliforniaPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) throws PizzaTypeNotAvailableException {
        PizzaIngredientFactory californiaFactory = new CaliforniaPizzaFactory();
        switch (type) {
            case "cheese":
                return new CaliforniaStyleCheesePizza(californiaFactory);
            case "pepperoni":
                return new CaliforniaStylePepperoniPizza(californiaFactory);
            case "clam":
                return new CaliforniaStyleClamPizza(californiaFactory);
            default:
                throw new PizzaTypeNotAvailableException();
        }
    }
}
