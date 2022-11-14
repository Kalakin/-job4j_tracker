package ru.job4j.oop;

public class Builder extends Engineer {

    private String character;

    public Builder(String name, String surname, String education, String birthday, String work, String character) {
        super(name, surname, education, birthday, work);
        this.character = character;
    }
}