package ru.job4j.oop;

public class PizzaExtraCheeseExtraTomato extends  PizzaExtraCheese {
    public static final String DOPOLNITEL2 = " + extra Tomato ";

    public String name() {
        return super.name() + DOPOLNITEL2;
    }

}
