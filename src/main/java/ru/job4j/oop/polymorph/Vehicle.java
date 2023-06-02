package ru.job4j.oop.polymorph;

public interface Vehicle extends Fuel {
    void accelerate();

    void brake();

    void steer();

    void changeGear();

    static void getDragCoefficient() {
        System.out.println("Формула расчёта аэродинамического сопротивления автомобиля");
    }

    default void chargeBattery() {
        System.out.println("Аккумулятор под капотом. Зарядить.");
    }

}
