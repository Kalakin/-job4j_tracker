package ru.job4j.io;

import java.util.Random;
import java.util.Scanner;

public class MagicBall {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Я великий оракул, что ты хочешь узнать?");
        String name = input.nextLine();
        int answer = new Random().nextInt(3);
        switch (answer) {
            case 0 :
                System.out.println("Да");
                return;
            case 1 :
                System.out.println("Нет");
                return;
            default:
                System.out.println("Может быть");
        }
    }
}

