package ru.job4j.oop.polymorph;

public class TestPolymorphism {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Cat cat = new Cat();
        Dog dog = new Dog();

        animal.eat();
        cat.eat();
        dog.eat();

        System.out.println();

        animal.walk();
        cat.walk();
        dog.walk();

        System.out.println();

        System.out.println();
        System.out.println("Polymorphism begins");
        Animal a = new Cat();
        Animal b = new Dog();
        a.walk();
        b.walk();

        System.out.println();
        eachAnimalWalk(new Cat());
        eachAnimalWalk(new Dog());
    }

    public static void eachAnimalWalk(Animal a) {
        a.walk();
    }
}
