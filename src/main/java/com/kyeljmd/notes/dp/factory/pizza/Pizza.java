package com.kyeljmd.notes.dp.factory.pizza;


import com.kyeljmd.notes.dp.factory.pizza.ingredients.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kdavid
 */
public abstract class Pizza {

    protected String name;

    protected Dough dough;
    protected Sauce sauce;
    protected Cheese cheese;
    protected Pepperoni pepperoni;
    protected Clam clam;

    protected List<String> toppings = new ArrayList<String>();

    public Pizza() {
    }

    public abstract void prepare();

    public void bake() {
        System.out.println("Baking for 25 minutes");
    }

    public void cut() {
        System.out.println("Cutting the Pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in the official store box");
    }

}
