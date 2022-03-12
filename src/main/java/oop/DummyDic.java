package oop;

public class DummyDic {
    public String engToRus() {
        String eng = "Translate";
        return eng;
    }

    public static void main(String[] args) {
        DummyDic translate = new DummyDic();
        String result = translate.engToRus();
        System.out.println("Неизвестное слово " + result);

    }
}
