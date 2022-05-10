package oop.pojo;

public class Library {
    public static void main(String[] args) {
        Book effectiveJava = new Book("Effective java", 900);
        Book headFirstJava = new Book("Head first java ", 764);
        Book cleanCode = new Book("Clean code", 486);
        Book pinokkio = new Book(" Pinokkio ",  92);
        Book[] books = new Book[4];
        books[0] = effectiveJava;
        books[1] = headFirstJava;
        books[2] = cleanCode;
        books[3] = pinokkio;
        for (int index = 0; index < books.length; index++) {
            Book bk = books[index];
            System.out.println(bk.getName() + " - " + bk.getPages());
        }
            System.out.println("Change books ");
            Book change = books[0];
            books[0] = books[3];
            books[3] = change;
        for (int index = 0; index < books.length; index++) {
            Book bk = books[index];
            System.out.println(bk.getName() + " - " + bk.getPages());
        }
        System.out.println(" Only clean");
        for (int index = 0; index < books.length; index++) {
            Book bk = books[index];
            if (bk.getName().equals("Clean code")) {
                System.out.println(bk.getName() + " - " + bk.getPages());
            }
        }
    }
}
