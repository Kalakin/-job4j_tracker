package oop;

public class PizzaExtraCheese extends Pizza {
    public static final String DOPOLNITEL  = " + extra Cheese ";

    public String name() {
        return super.name() + DOPOLNITEL;
    }
}
