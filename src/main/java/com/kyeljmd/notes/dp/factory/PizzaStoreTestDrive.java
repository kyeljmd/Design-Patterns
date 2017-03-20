package com.kyeljmd.notes.dp.factory;

import com.kyeljmd.notes.dp.factory.pizza.Pizza;
import com.kyeljmd.notes.dp.factory.pizza.PizzaTypeNotAvailableException;
import com.kyeljmd.notes.dp.factory.pizza.store.NYPizzaStore;

/**
 * Created by kyel on 2/5/2017.
 */
public class PizzaStoreTestDrive {

    public static void main(String[] args) {
        NYPizzaStore nyPizzaStore = new NYPizzaStore();
        try {
            Pizza pizza = nyPizzaStore.createPizza("cheese");
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        } catch (PizzaTypeNotAvailableException e) {
            e.printStackTrace();
        }
    }
}
