package ru.job4j.oop.interfaces;

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Animal(1);
        Person person1 = new Person("Bob");
        animal1.sleep();
        person1.sayHello();
        System.out.println();
        animal1.showInfo();
        person1.showInfo();
        System.out.println();
        Info info1 = new Animal(1);
        Info info2 = new Person("Bob");
        info1.showInfo();
        info2.showInfo();
    }

    public static void outputInfo(Info info) {
     info.showInfo();
    }
}
