package ru.job4j.oop.polymorph.Primer;

public class Goose implements Animal {
    @Override
    public void sound() {
        System.out.println(getClass().getSimpleName() + " произносит звук: Га-га.");
    }
}
