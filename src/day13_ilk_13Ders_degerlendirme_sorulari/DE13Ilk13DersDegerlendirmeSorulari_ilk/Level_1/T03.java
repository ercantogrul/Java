package day13_ilk_13Ders_degerlendirme_sorulari.DE13Ilk13DersDegerlendirmeSorulari_ilk.Level_1;

import java.util.Arrays;

public class T03 {
    public static void main(String[] args) {
        // rastgele 1 ile 20 arasında 100 adet sayı üretin ve en büyüğünü
        // array int[] kullanarak bulun

        int n = 100;
        int [] dizi = new int[n];
        for (int i = 0; i <n ; i++) {
            dizi[i] = (int) (Math.random()*20+1);
        }
        System.out.println(Arrays.toString(dizi));

        Arrays.sort(dizi);
        System.out.println(Arrays.toString(dizi));
        int max = dizi[dizi.length-1];
        System.out.println("En Büyük deger:"+max);


        int enB= Integer.MIN_VALUE;
        for (int i = 0; i < dizi.length; i++) {
            if (enB<dizi[i]) enB=dizi[i];
        }
        System.out.println("girilen sayilardan en büyük sayi : "+ enB);


    }
}
