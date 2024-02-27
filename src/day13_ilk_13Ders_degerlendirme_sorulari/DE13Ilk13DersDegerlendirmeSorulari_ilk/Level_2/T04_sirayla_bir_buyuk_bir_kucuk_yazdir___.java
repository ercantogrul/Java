package day13_ilk_13Ders_degerlendirme_sorulari.DE13Ilk13DersDegerlendirmeSorulari_ilk.Level_2;

public class T04_sirayla_bir_buyuk_bir_kucuk_yazdir___ {
    public static void main(String[] args) {
        // Aşağıdaki stringin harfleri bir büyük bir küçük olacak şekilde yazdırın
        // string değiştiğinde de proğram çalışmalı, boşlukları es geçin
        // String str = "merhaba arkadaşlar"
        // output str = "MeRhAbA aRkAdAşLaR" şeklinde yazmalı
        String str = "merhaba arkadaşlar";
        str = str.trim();

        boolean flag = true;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                if (flag) {
                    System.out.print(str.substring(i, i + 1).toUpperCase());
                    flag = false;
                } else {
                    System.out.print(str.substring(i, i + 1).toLowerCase());
                    flag = true;
                }
            } else System.out.print(" ");


        }

    }


}
