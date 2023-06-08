package ru.job4j.oop.polymorph;

public interface Transport {
    void going();

    void pasangers(int peoples);

   default String refuel(String gallons) {
     return null;
   }
}
