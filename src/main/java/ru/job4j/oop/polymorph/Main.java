package ru.job4j.oop.polymorph;

public class Main {
    public static void main(String[] args) {
        Vehicle sportCar = new SportCar();
        Fuel fuel = new SportCar();
        sportCar.changeGear();
        sportCar.accelerate();
        sportCar.steer();
        sportCar.brake();
        fuel.refill();
    }
}
