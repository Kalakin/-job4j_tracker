package ru.job4j.oop.polymorph;

public class College {
    public static void main(String[] args) {
        Freshman freshman = new Student();
        Student student = (Student) freshman;
        Object obj = freshman;
    }
}
