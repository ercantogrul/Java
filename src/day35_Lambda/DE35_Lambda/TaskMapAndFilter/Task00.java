package day35_Lambda.DE35_Lambda.TaskMapAndFilter;

import java.util.ArrayList;
import java.util.List;

public class Task00 {
     /* Rastgele 20 Integer(1 den 100 e kadar) elemandan oluşan bir List yapın
    a) Bu list in (stream kullanarak) tek  elemanlarını yazdırın
    b) Bu list in (stream kullanarak) tek  elemanlarını yazdırın (filter içinde motot kullanın)


      */
     public static void main(String[] args) {
         List<Integer> list = new ArrayList<>();
         for (int i = 0; i < 20; i++) {
             int sayi = (int) (Math.random() * 100 + 1);
             list.add(sayi);
         }
         System.out.println(list);
         // a)
         System.out.println(" a) ");
         list.stream().filter(p -> p % 2 == 1).forEach(p -> System.out.print(p + " "));
         System.out.println("\n b) ");
         // b) esas cevabı
         list.stream().forEach(Task00::tekseYazdir);
         // veya b) filter içerisinde bir metot çağırıyorsak boolean return tipi olmak zorunda
         System.out.println("\nb)2");
         list.stream().filter(Task00::tekseYazdir2).forEach(p -> System.out.print(p + " "));
         System.out.println("\n------------");

         list.stream().filter(Task00::tekseYazdir2).map(p->p+1);

         // sonuc, filter sadece filtreleme, map sadece işlemden geçirme içindir, farklı bir amaç ile kullanmayalım


     }

    public static void tekseYazdir(int p) {
        if (p % 2 == 1) System.out.print(p + " ");
    }

    public static boolean tekseYazdir2(int p) {
        if (p % 2 == 1) {
            System.out.print(p + " ");
            return true;
        } else return false;
    }
}

