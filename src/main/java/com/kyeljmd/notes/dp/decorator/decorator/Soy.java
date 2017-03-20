package com.kyeljmd.notes.dp.decorator.decorator;

import com.kyeljmd.notes.dp.decorator.component.Beverage;

/**
 * Concrete Implementation of the Decorator that will be used to decorate the component
 */
public class Soy extends CondimentDecorator {

    private Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() { return beverage.getDescription()  +", Soy"; }    @Override

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
