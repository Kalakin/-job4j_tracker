package oop;

public class Doctor extends Profession {

    private int age;

    public Doctor(String name, String surname, String education, String birthday, int age) {
        super(name, surname, education, birthday);
        this.age = age;
    }
}
