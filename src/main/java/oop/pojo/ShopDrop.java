package oop.pojo;

public class ShopDrop {
   public static Product[] delete(Product[] products, int index) {
       products[index] = null;
       for (int i = 0; i < products.length; i++) {
           Product product = products[i];
           if (product == null) {
              product = products[products.length - 1];
           }
       }
       return products;
   }
}