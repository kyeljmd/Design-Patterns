package com.kyeljmd.notes.dp.decorator.component;

import com.kyeljmd.notes.dp.decorator.component.Beverage;

/**
 * @author kdavid
 */
public class DarkRoast extends Beverage {

    public String getDescription() { return "Dark Roast"; }

    @Override
    public double cost() {
        return 32;
    }
}
