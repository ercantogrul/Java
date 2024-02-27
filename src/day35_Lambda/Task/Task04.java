package day35_Lambda.Task;

import java.util.ArrayList;
import java.util.List;

public class Task04 {
    /* Rastgele 20 Integer(1 den 100 e kadar) elemandan oluşan bir List yapın
    Bu list i aynı strim içerisinde yan yana yazdırın,
    sonra yine bunların yanına, list in toplamını yazdırın
    Tüm bunlar aynı stream içerisinde olmalı.
     */
    public static void main(String[] args) {
        List<Integer> liest = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            int sayi = (int) (Math.random() * 100 + 1);
            liest.add(sayi);
        }
        System.out.println(liest);

        System.out.println(liest.stream().mapToInt(Task04::yazdir).sum());
        // veya
        System.out.println();
        int toplam = liest.stream().mapToInt(Task04::yazdir).sum();
        System.out.println("\n"+toplam);


    }

    private static int yazdir(Integer p) {
        System.out.print(p+" ");
        return  p;
    }
}
