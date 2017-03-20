package com.kyeljmd.notes.dp.factory;

import com.kyeljmd.notes.dp.factory.pizza.ingredients.*;

/**
 * Created by kyel on 2/5/2017.
 */
public interface PizzaIngredientFactory {

    Dough createDough();

    Sauce createSauce();

    Cheese createCheese();

    Veggies[] createVeggies();

    Pepperoni createPepperoni();

    Clam createClam();
}
