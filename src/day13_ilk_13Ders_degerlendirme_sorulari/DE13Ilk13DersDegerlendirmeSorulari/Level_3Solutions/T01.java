package day13_ilk_13Ders_degerlendirme_sorulari.DE13Ilk13DersDegerlendirmeSorulari.Level_3Solutions;

import java.util.ArrayList;
import java.util.Arrays;

public class T01 {
    public static void main(String[] args) {
        // Rastgele (0 ile 9 arasında ) 100 adet sayı üretin,
        // a)  her bir sayının kaç kez tekrar üretildiğini edildiğini bulunuz
        // output   0   ?? kez tekrar edilmiştir
        //          1   ?? kez tekrar edilmiştir
        //         ...
        //
        // b) a şıkkını tekrar yapın ama toplam kullandığınız ";" sayısı 5 i geçmesin

        int[] dizi = new int[10];
        for (int i = 0; i <20 ; i++) {
            int sayi  = (int) (Math.random()*10);
            dizi[sayi]++;
            System.out.print(sayi+" ");
        }
        System.out.println();
        for (int i = 0; i < dizi.length ; i++) {
            System.out.println(i+" sayısından "+dizi[i]+" adet vardır");
        }
        System.out.println(Arrays.toString(dizi));
    }
}
