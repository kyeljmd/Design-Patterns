package com.kyeljmd.notes.dp.decorator.component;

/**
 * This class will act as our "Component" from the Class diagram
 * implementation classes of Components are classes that will be "decorated"
 */
public abstract class Beverage {

    public enum Size {TALL, GRANDE, VENTI};

    Size size = Size.TALL;

    private String description = "Unknown Beverage";

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() { return description; }

    public abstract double cost();
}
