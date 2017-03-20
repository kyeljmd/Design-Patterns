package com.kyeljmd.notes.dp.decorator.decorator;

import com.kyeljmd.notes.dp.decorator.component.Beverage;

import java.io.FilterInputStream;

/**
 * Concrete Implementation of the Decorator that will be used to decorate the component
 */
public class Whip extends CondimentDecorator {

    private Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() { return beverage.getDescription()  +", Whip"; }    @Override

    public double cost() {
        switch (beverage.getSize()) {
            case VENTI: return beverage.cost() + .20;
            case GRANDE: return beverage.cost() + .15;
            default: return beverage.cost() + .10;
        }
    }
}
