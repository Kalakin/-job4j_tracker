package ru.job4j.tracker;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class StartUI {
    public static void main(String[] args) {
        Item item = new Item("New Item");
        item.getCreated();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        System.out.println("Текущие дата и время: " + item.getCreated().format(formatter));

        Item item2 = new Item("Item2");
        item2.toString();
        System.out.println("Время и дата:" + item2.toString());
    }
}
