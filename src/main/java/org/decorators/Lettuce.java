package org.decorators;

import org.interfaces.Burger;

public class Lettuce extends BurgerDecorator {
    public Lettuce(Burger burger) {
        super(burger);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Alface";
    }

    @Override
    public double getCost() {
        return super.getCost() + 1.00;
    }
}