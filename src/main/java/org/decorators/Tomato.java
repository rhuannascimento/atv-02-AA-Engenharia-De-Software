package org.decorators;

import org.interfaces.Burger;

public class Tomato extends BurgerDecorator {
    public Tomato(Burger burger) {
        super(burger);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Tomate";
    }

    @Override
    public double getCost() {
        return super.getCost() + 1.50;
    }
}
