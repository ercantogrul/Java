package day13_ilk_13Ders_degerlendirme_sorulari.DE13Ilk13DersDegerlendirmeSorulari.Level_2;

import java.util.ArrayList;
import java.util.List;

public class T17__ {
    /* rastgele n elemanlı ( ni klavyeden okutun) bir ArrayList üretin
    (sayılar 1 ila 100 arasında olsun)     bu arrayın en küçük elemanı ile
    en büyük elemanı yer değiştirin(yer değişme işlemi bir method içinde olsun)
     */
    public static void main(String[] args) {
        List<Integer> liste = new ArrayList<>();
        // diziyi dolduralım
        for (int i = 0; i <30 ; i++) {
            int sayi  = (int) (Math.random()*100+1);
            liste.add(sayi);
        }
        int enB = Integer.MIN_VALUE;
        int enK = Integer.MAX_VALUE;
        int enbIdx = 0;
        int enKIdx = 0;
        for (int i = 0; i <liste.size() ; i++) {
            int eleman  = liste.get(i);
            if (eleman>enB) {
                enB = eleman;
                enbIdx = i;
            }
            if (eleman<enK) {
                enK = eleman;
                enKIdx = i;
            }
        }
        System.out.println(liste);
        liste.set(enbIdx,enK);
        liste.set(enKIdx,enB);
        System.out.println(liste);







    }
}
