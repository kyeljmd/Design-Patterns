package com.kyeljmd.notes.dp.factory.pizza.store;

import com.kyeljmd.notes.dp.factory.pizza.Pizza;
import com.kyeljmd.notes.dp.factory.pizza.PizzaTypeNotAvailableException;

/**
 * @author kdavid   2/4/2017.
 */
public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza = null;
        try {
            pizza = createPizza(type);
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        } catch (PizzaTypeNotAvailableException e) {
            e.printStackTrace();
        }
        return pizza;
    }

    public abstract Pizza createPizza(String type) throws PizzaTypeNotAvailableException;
}
