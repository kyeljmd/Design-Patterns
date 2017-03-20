package com.kyeljmd.notes.dp.decorator.component;

import com.kyeljmd.notes.dp.decorator.component.Beverage;

/**
 * @author kdavid
 */
public class Espresso extends Beverage {

    @Override
    public String getDescription() {
        return "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
