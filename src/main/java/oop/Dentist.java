package oop;

public class Dentist extends Doctor {

    private String clinic;

    public Dentist(String name, String surname, String education, String birthday, int age, int experience) {
        super(name, surname, education, birthday, age);
        this.clinic = clinic;
    }
}