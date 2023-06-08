package ru.job4j.oop.polymorph;

public class College {
    public static void main(String[] args) {
        Student freshman = new Freshman();
        Freshman fresh = new Freshman();
        Object obj = fresh;
    }
}
