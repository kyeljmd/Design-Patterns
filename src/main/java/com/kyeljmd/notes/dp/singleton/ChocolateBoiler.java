package com.kyeljmd.notes.dp.singleton;

/**
 * @author kdavid
 */
public class ChocolateBoiler {

    private boolean empty;

    private boolean boiled;

    private volatile static ChocolateBoiler chocolateBoiler;

    private ChocolateBoiler() {
        empty = true;
        boiled = false;
    }


    public synchronized static ChocolateBoiler instance() {
        if(chocolateBoiler != null) {
            chocolateBoiler = new ChocolateBoiler();
        }
        return chocolateBoiler;
    }

    public void fill() {
        if(isEmpty()) {
            empty= false;
            boiled = false;
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}
