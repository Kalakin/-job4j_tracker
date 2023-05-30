package ru.job4j.enumeration;

import ru.job4j.enumeration.Status;

public class CarService {
    public static void main(String[] args) {
        Status toyota = Status.FINISHED;
        Status volvo = Status.WAITING;
        System.out.println("Статус toyota:" + toyota);
        System.out.println("Статус volvo:" + volvo);
        Order order = new Order(1, "Mercedes-benz GLK", Status.IN_WORK);
        System.out.println("Заказ-наряд №" + order.getNumber() + " на автомобиль " + order.getCar()
                + ", статус ремонта: " + order.getStatus().getInfo());
    }
}
