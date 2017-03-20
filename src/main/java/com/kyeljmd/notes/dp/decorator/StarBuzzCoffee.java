package com.kyeljmd.notes.dp.decorator;

import com.kyeljmd.notes.dp.decorator.decorator.Mocha;
import com.kyeljmd.notes.dp.decorator.decorator.Soy;
import com.kyeljmd.notes.dp.decorator.component.Beverage;
import com.kyeljmd.notes.dp.decorator.component.DarkRoast;
import com.kyeljmd.notes.dp.decorator.component.Espresso;

/**
 * @author kdavid
 */
public class StarBuzzCoffee  {

    public static void main(String[] args) {
        Espresso espresso = new Espresso();
        System.out.println(espresso.getDescription()+" "+espresso.cost());

        Beverage darkRoast = new DarkRoast();
        darkRoast.setSize(Beverage.Size.VENTI);
        darkRoast = new Mocha(darkRoast);
        darkRoast = new Soy(darkRoast);

        System.out.println(darkRoast.getDescription()+" "+darkRoast.cost());
    }


}
