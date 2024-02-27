package day13_ilk_13Ders_degerlendirme_sorulari.DE13Ilk13DersDegerlendirmeSorulari_ilk.Level_2;

import java.util.Arrays;

public class T06_switch_case_SAYIYI_yazi_ile_yaz_yasinBey {
    public static void main(String[] args) {
        /* String str= "20+8" şeklinde bir strin geriliyor bu string 2 sayı ve ortasında bir
        matematiksel işlemden oluşmaktadır, ortasındaki matematiksel işleme göre işlemi yapıp sonucu yazdırın
        output: = 20+8 = 28
        ortasındaki işlem 4 işlemin yanı sıra  "<" = küçüğünü bul, ">" büyüğünü bul işlemide olabilir
        switch  kullanın, case içerisinde ise her bir işlem için bir metot olsun

         */

        String str = "20+8";
        String isaret = str.replaceAll("[0-9]", "");
        System.out.println(isaret);
        String sayiAyrimi = str.replaceAll("[\\p{Punct}]", "a");
        System.out.println(sayiAyrimi);
        String[] arr = sayiAyrimi.split("a");
        arr[1] = arr[1].trim();
        arr[0] = arr[0].trim();
        int sayi1 = Integer.parseInt(arr[0]);
        int sayi2 = Integer.parseInt(arr[1]);
        System.out.println("sayi1 = " + sayi1);
        System.out.println("sayi2 = " + sayi2);
        System.out.println(Arrays.toString(arr));
        int sonuc = 0;
        switch (isaret) {
            case ("+"): sonuc = toplam(sayi1, sayi2);break;
            case ("-"): sonuc = sayi1 - sayi2;break;
            case ("/"): sonuc = sayi1 / sayi2;break;
            case ("*"): sonuc = sayi1 * sayi2;break;
            case (">"): System.out.println(sayi1 + " buyuktur " + sayi2);break;
            case ("<"): System.out.println(sayi1 + " kucuktur " + sayi2);break;
            default: System.out.println("Hatali giris");break;

        }
        System.out.println("sonuc = " + sonuc);
    }

    private static int toplam(int sayi1, int sayi2) {
        return sayi1 + sayi2;
    }
}
