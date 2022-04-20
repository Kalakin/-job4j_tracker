package oop;

public class ToyCat extends Cat2 {
    public boolean canBeWashByWashMachine() {
        return true;
    }

    public static void main(String[] args) {
        Cat2 cat = new Cat2();
        System.out.println(cat.canPurr());
        ToyCat toy = new ToyCat();
        System.out.println(toy.canPurr());
        System.out.println(toy.canBeWashByWashMachine());
    }
}

