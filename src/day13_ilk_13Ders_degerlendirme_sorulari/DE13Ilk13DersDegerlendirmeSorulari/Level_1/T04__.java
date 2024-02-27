package day13_ilk_13Ders_degerlendirme_sorulari.DE13Ilk13DersDegerlendirmeSorulari.Level_1;

import java.util.ArrayList;
import java.util.Collections;

public class T04__ {
    public static void main(String[] args) {
        // rastgele 1 ile 20 arasında 100 adet sayı üretin ve
        // en büyüğünü ArrayList kullanarak bulun
        ArrayList<Integer> liste = new ArrayList<>();
        liste = listeDoldur(liste);
        long t1 = System.currentTimeMillis();
        //int enBuyuk = enBuyuguBul(liste);
        int enBuyuk = enBuyuguBulSort(liste);
        long t2 = System.currentTimeMillis();
        System.out.println(t2-t1);


    }

    private static int enBuyuguBulSort(ArrayList<Integer> liste) {
        // tercih edilmez
        Collections.sort(liste);
        return liste.getLast();
    }

    private static int enBuyuguBul(ArrayList<Integer> liste) {
        int enB = Integer.MIN_VALUE;
        for (int i = 0; i <liste.size() ; i++) {
            if (liste.get(i)>enB) enB = liste.get(i);
        }
        return enB;
    }

    private static ArrayList<Integer> listeDoldur(ArrayList<Integer> liste) {
        for (int i = 0; i <100000 ; i++) {
            int sayi = (int) (Math.random()*20+1);
            liste.add(sayi);
        }
        return liste;
    }
}
