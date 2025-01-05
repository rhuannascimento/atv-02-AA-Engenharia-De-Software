package org.base;

import org.interfaces.Burger;

public class BasicBurger implements Burger {
    @Override
    public String getDescription() {
        return "Pão e carne";
    }

    @Override
    public double getCost() {
        return 5.00;
    }
}