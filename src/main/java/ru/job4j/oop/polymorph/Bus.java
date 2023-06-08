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
    public int refuel(int gallons) {
        int result = gallons;
        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
        Transport bus1 = new Bus();
        bus1.refuel(100);
        bus1.going();
        bus1.pasangers(6);
    }
}
