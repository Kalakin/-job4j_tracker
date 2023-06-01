package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean turn = true;
        int count = 11;
        while (count > 0) {
            String player = turn ? "Первый игрок" : "Второй игрок";
            System.out.println(player + " введите число от 1 до 3:");
            int matches = Integer.parseInt(input.nextLine());
            turn = !turn;
            if (matches <= 3 && count >= matches) {
                   count = count - matches;
               } else {
                   System.out.println("Можно ввести число от 1 до 3 и не более остатка");
                 matches = Integer.parseInt(input.nextLine());
               }
               if (count == 0) {
                  System.out.println("Этот игрок победил");
               } else {
                turn = turn == !turn;
               }
            }

       if (!turn) {
           System.out.println("Выиграл первый игрок");
       } else {
           System.out.println("Выиграл второй игрок");
       }
    }
}
