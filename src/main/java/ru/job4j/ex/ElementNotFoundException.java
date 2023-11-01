package ru.job4j.ex;

public class ElementNotFoundException extends Exception {

    public ElementNotFoundException(String element) {

    }

    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (int i = 0; i < value.length; i++) {
            if (value[i].equals(key)) {
                rsl = i;
                break;
            }
        }
        if (rsl == -1) {
            throw new ElementNotFoundException("Element not found");
        }
        return rsl;
    }

    public static void main(String[] args) {
        try {
            indexOf(String[-1] value, "Element not found");
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}

