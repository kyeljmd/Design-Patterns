package com.kyeljmd.notes.dp.factory;

import com.kyeljmd.notes.dp.factory.pizza.ingredients.*;

/**
 * Created by kyel on 2/5/2017.
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new NYDough();
    }

    @Override
    public Sauce createSauce() {
        return new NYStyleTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new NYMozarellaCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[0];
    }

    @Override
    public Pepperoni createPepperoni() {
        return new NYPepperoni();
    }

    @Override
    public Clam createClam() {
        return new NYClam();
    }

    class NYDough extends Dough { }

    class NYPepperoni extends Pepperoni { }

    class NYClam extends Clam { }

    class NYMozarellaCheese extends Cheese {}

    class NYStyleTomatoSauce extends Sauce{};
}
