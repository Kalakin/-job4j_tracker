package ru.job4j.oop.pojo;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFio(" Kalakin Kirill Andreevich ");
        student.setDate(" 2010 ");
        student.setGroup(" management ");

        System.out.println(student.getFio() + " postupil v " + student.getDate() + student.getGroup());
    }
}
