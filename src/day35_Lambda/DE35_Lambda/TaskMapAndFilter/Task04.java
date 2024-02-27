package day35_Lambda.DE35_Lambda.TaskMapAndFilter;

import java.util.ArrayList;
import java.util.List;

public class Task04 {
    /* Rastgele 20 Integer(1 den 100 e kadar) elemandan oluşan bir List yapın
    Bu list i aynı stream içerisinde yan yana yazdırın,
    sonra yine bunların yanına, list in toplamını yazdırın
    Tüm bunlar aynı stream içerisinde olmalı.
     */
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <20 ; i++) {
            int sayi = (int) (Math.random()*100+1);
            list.add(sayi);
        }
        System.out.println(list);
        System.out.println(list.stream().mapToInt(Task04::yazdir).sum());
        // veya alta yazsın diye
        System.out.println();
        int toplam = list.stream().mapToInt(Task04::yazdir).sum();
        System.out.println("\n"+toplam);


    }

    private static int yazdir(int p) {
        System.out.print(p+" ");
        return p;
    }
}
