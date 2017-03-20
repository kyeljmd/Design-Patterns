package com.kyeljmd.notes.dp.factory;

import com.kyeljmd.notes.dp.factory.pizza.ingredients.*;

/**
 * Created by kyel on 2/5/2017.
 */
public class ChicagoIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ChicagoDough();
    }

    @Override
    public Sauce createSauce() {
        return new ChicagoStyleTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ChicagoMozarellaCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[0];
    }

    @Override
    public Pepperoni createPepperoni() {
        return new ChicagoPepperoni();
    }

    @Override
    public Clam createClam() {
        return new ChicagoClam();
    }

    class ChicagoDough extends Dough { }

    class ChicagoPepperoni extends Pepperoni { }

    class ChicagoClam extends Clam { }

    class ChicagoVeggies extends Veggies {}

    class ChicagoMozarellaCheese extends Cheese {}

    class ChicagoStyleTomatoSauce extends Sauce{};
}
