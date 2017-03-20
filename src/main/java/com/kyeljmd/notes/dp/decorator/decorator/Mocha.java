package com.kyeljmd.notes.dp.decorator.decorator;

import com.kyeljmd.notes.dp.decorator.component.Beverage;

/**
 * Concrete Implementation of the Decorator that will be used to decorate the component
 */
public class Mocha extends CondimentDecorator {

    private Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() { return beverage.getDescription()  +", Mocha"; }    @Override


    public double cost() {
        switch (beverage.getSize()) {
            case VENTI:
                return beverage.cost() + .20;
            case GRANDE:
                return beverage.cost() + .15;
            default:
                return beverage.cost() + .10;
        }
    }
}
