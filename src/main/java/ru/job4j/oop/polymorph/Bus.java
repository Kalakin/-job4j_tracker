package ru.job4j.oop.polymorph;

public class Bus implements Transport {

    @Override
    public void going() {
        System.out.println("Ехать");
    }

    @Override
    public void pasangers(int peoples) {
        System.out.println("Пассажиры");
    }

    @Override
    public void refuel(int gallons) {
        System.out.println("Цена за топливо равна: " + gallons * 30 + "рублей.");
    }

    public static void main(String[] args) {
        Transport bus1 = new Bus();
        bus1.refuel(10);
        bus1.going();
        bus1.pasangers(6);
    }
}
