package ru.job4j.oop.polymorph;

public class MainFunc implements Func1, Func2 {

    @Override
    public double func(double x, double y) {
        return Func2.super.func(x, y);
    }
}
