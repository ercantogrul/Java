package day13_ilk_13Ders_degerlendirme_sorulari.DE13Ilk13DersDegerlendirmeSorulari_ilk.Level_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class T04__enB_bul {
    public static void main(String[] args) {
        // rastgele 1 ile 100 arasında 20 adet sayı üretin ve
        // en büyüğünü ArrayList kullanarak bulun


        ArrayList<Integer> list = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int sayac = 0;

        for (int i = 0; i < 100; i++) {
            list.add(i, (int) (Math.random() * 20 + 1));
        }
        System.out.println(list);

        int enB = Integer.MIN_VALUE;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i)>enB) enB= list.get(i);
        }
        System.out.println("enB :"+enB);

        //2.yol==================================================
        Collections.sort(list); System.out.println(list);  // bu tercih edilecek yontem degil
        System.out.println("enBüyük sayi :" + (list.get(list.size()-1)));


    }


}
