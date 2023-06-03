package ru.job4j.oop.polymorph;

public class Bus implements Transport {

    @Override
    public void going() {

    }

    @Override
    public void pasangers(int peoples) {

    }

    @Override
    public void refuel(int gallons) {
        System.out.println("Цена за топливо равна: ");
    }

    public static void main(String[] args) {
        Transport bus1 = new Bus();
        bus1.refuel(10);
    }
}
