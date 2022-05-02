package oop;

public class Engineer extends Profession {

    private String work;

    public Engineer(String name, String surname, String education, String birthday, String work) {
        super(name, surname, education, birthday);
        this.work = work;
    }
}
