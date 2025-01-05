package org.decorators;

import org.interfaces.Burger;

public class Bacon extends BurgerDecorator {
    public Bacon(Burger burger) {
        super(burger);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Bacon";
    }

    @Override
    public double getCost() {
        return super.getCost() + 2.50;
    }
}