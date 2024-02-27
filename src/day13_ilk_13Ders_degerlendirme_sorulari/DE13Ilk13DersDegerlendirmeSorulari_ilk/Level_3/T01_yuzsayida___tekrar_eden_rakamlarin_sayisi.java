package day13_ilk_13Ders_degerlendirme_sorulari.DE13Ilk13DersDegerlendirmeSorulari_ilk.Level_3;

import java.util.ArrayList;

public class T01_yuzsayida___tekrar_eden_rakamlarin_sayisi {
    public static void main(String[] args) {
        // Rastgele (0 ile 9 arasında ) 100 adet sayı üretin,
        // a)  her bir sayının kaç kez tekrar üretildiğini edildiğini bulunuz
        // output   0   ?? kez tekrar edilmiştir
        //          1   ?? kez tekrar edilmiştir
        //         ...
        //

        // b) a şıkkını tekrar yapın ama toplam kullandığınız ";" sayısı 5 i geçmesin
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            list.add((int) (Math.random() * 10));
        }
        System.out.println(list);

        for (int i = 0; i < 10; i++) {
            int counter = 0;
            for (int j = 0; j < list.size(); j++) {
                if (i == list.get(j)) {
                    counter++;
                }
            }
            System.out.println(i + " sayisi : " + counter + " adet vardir");

        }

        //2.yol cok güzel ve kolay
        System.out.println();
        int [] dizi =new int[10];  // dizi: [0,0,0,0,0,0,0,0,0]
        for (int i = 0; i < 20; i++) {
            int sayi = (int) (Math.random()*10);
            dizi [sayi] ++;  // dizi: [0,0,2,0,0,0,3,0,0]
            System.out.print(sayi+" ");  // her sayidan kac adet varsa sayarak diziye atar

        }
        System.out.println();

        for (int i = 0; i < dizi.length; i++) {
            System.out.println(i+" sayisindan "+dizi[i]+ " adet vardir");

        }





    }


}

