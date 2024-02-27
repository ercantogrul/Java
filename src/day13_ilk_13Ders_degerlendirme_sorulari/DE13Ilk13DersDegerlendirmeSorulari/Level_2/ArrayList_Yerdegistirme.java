package day13_ilk_13Ders_degerlendirme_sorulari.DE13Ilk13DersDegerlendirmeSorulari.Level_2;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_Yerdegistirme {
    public static void main(String[] args) {
        List<Integer> liste  = new ArrayList<>();
        liste.add(10);
        liste.add(15);
        liste.add(5);
        liste.add(22);
        // 1. ile 3.yü yet değiştirelim
        System.out.println(liste);

        liste.set(3, liste.set(1, liste.get(3))); // array list te yer değiştirme
        System.out.println(liste);

    }
}
