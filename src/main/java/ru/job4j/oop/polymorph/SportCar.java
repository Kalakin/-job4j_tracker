package ru.job4j.oop.polymorph;

public class SportCar implements Vehicle {

    @Override
    public void accelerate() {
        System.out.println("Электронная педаль газа");
    }

    @Override
    public void brake() {
        System.out.println("Усиленная тормозна система");
    }

    @Override
    public void steer() {
        System.out.println("Укороченная рулевая рейка для ускоренного поворота руля");
    }

    @Override
    public void changeGear() {
         System.out.println("Механическая коробка передач. Включить первую, дальше переключать до шестой.");
    }

    @Override
    public void refill() {
        System.out.println("Заправить 100 л бензина");
    }
}
