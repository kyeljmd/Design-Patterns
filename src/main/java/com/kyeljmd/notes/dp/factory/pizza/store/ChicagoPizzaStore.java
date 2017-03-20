package com.kyeljmd.notes.dp.factory.pizza.store;

import com.kyeljmd.notes.dp.factory.ChicagoIngredientFactory;
import com.kyeljmd.notes.dp.factory.PizzaIngredientFactory;
import com.kyeljmd.notes.dp.factory.pizza.Pizza;
import com.kyeljmd.notes.dp.factory.pizza.PizzaTypeNotAvailableException;
import com.kyeljmd.notes.dp.factory.pizza.chicago.ChicagoStyleCheesePizza;
import com.kyeljmd.notes.dp.factory.pizza.chicago.ChicagoStyleClamPizza;
import com.kyeljmd.notes.dp.factory.pizza.chicago.ChicagoStylePepperoniPizza;

/**
 * @author kdavid   2/4/2017.
 */
public class ChicagoPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) throws PizzaTypeNotAvailableException {

        PizzaIngredientFactory factory = new ChicagoIngredientFactory();
        switch (type) {
            case "cheese":
                return new ChicagoStyleCheesePizza(factory);
            case "pepperoni":
                return new ChicagoStylePepperoniPizza(factory);
            case "clam":
                return new ChicagoStyleClamPizza(factory);
            default:
                throw new PizzaTypeNotAvailableException();
        }
    }
}
