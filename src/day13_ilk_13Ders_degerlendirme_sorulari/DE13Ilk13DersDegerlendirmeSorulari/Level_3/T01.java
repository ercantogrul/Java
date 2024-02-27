package day13_ilk_13Ders_degerlendirme_sorulari.DE13Ilk13DersDegerlendirmeSorulari.Level_3;

import java.util.ArrayList;

public class T01 {
    public static void main(String[] args) {
        // Rastgele (0 ile 9 arasında ) 100 adet sayı üretin,
        // a)  her bir sayının kaç kez tekrar üretildiğini edildiğini bulunuz
        // output   0   ?? kez tekrar edilmiştir
        //          1   ?? kez tekrar edilmiştir
        //         ...
        //

        // b) a şıkkını tekrar yapın ama toplam kullandığınız ";" sayısı 5 i geçmesin

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i <10 ; i++) list.add((int) (Math.random()*10));


    }
}
