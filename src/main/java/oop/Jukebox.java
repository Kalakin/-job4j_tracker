package oop;

public class Jukebox {

   public void music(int position) {
     if (position <= 1) {
         System.out.println("Пусть бегут неуклюже");
     }
       if   (position >= 2) {
         System.out.println("Спокойной ночи");
       }
          else {
         System.out.println("Песня не найдена");
          }
   }

   public static void main(String[] args) {
    Jukebox kirill = new Jukebox();
    int position = 1;
    kirill.music(position);
   }
}
