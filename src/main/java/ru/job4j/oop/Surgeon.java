package ru.job4j.oop;

public class Surgeon extends Doctor {

    private int experience;

    public Surgeon(String name, String surname, String education, String birthday, int age, int experience) {
        super(name, surname, education, birthday, age);
        this.experience = experience;
    }
}
