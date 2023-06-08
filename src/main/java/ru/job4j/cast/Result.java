package ru.job4j.cast;

public class Result {
    public static void main(String[] args) {
        Vehicle train = new Train();
        Vehicle bus = new Bus();
        Vehicle plane = new Plane();

        Vehicle[] vehicles = new Vehicle[]{train, bus, plane};
        for (Vehicle v : vehicles) {
            v.move();
        }
    }
}

