package day13_ilk_13Ders_degerlendirme_sorulari.DE13Ilk13DersDegerlendirmeSorulari_ilk.Level_2;

import java.util.Scanner;

public class T06_switch_case_SAYIYI_yazi_ile_yaz__ {
    public static void main(String[] args) {
        /* String str= "20+8" şeklinde bir strin geriliyor bu string 2 sayı ve ortasında bir
        matematiksel işlemden oluşmaktadır, ortasındaki matematiksel işleme göre işlemi yapıp sonucu yazdırın
        output: = 20+8 = 28
        ortasındaki işlem 4 işlemin yanı sıra  "<" = küçüğünü bul, ">" büyüğünü bul işlemide olabilir
        switch  kullanın, case içerisinde ise her bir işlem için bir metot olsun

         */
        Scanner scan = new Scanner(System.in);
        System.out.println("20+8 şeklinde string bir sayi giriniz");
        String str = scan.nextLine();

        // 3 ayrı yol ile işareti bulalım
        String isaret = str.replaceAll("\\w", ""); // yüm harf ve rakamları siler gerisi kalır
        System.out.println(isaret);
        isaret = str.replaceAll("[0-9]", ""); // 0 dan 9 kadar kadar siler gerisi kalır
        System.out.println(isaret);
        isaret = str.replaceAll("\\d", ""); // rakamları siler
        System.out.println(isaret);


        int isaretIndexi = str.indexOf(isaret);
        int ilkSayi=Integer.valueOf(str.substring(0, isaretIndexi));
        int ikinciSayi=Integer.valueOf(str.substring(isaretIndexi + 1));
        System.out.println("ilkSayi: "+ilkSayi);
        System.out.println("ikinciSayi :"+ikinciSayi);
        switch (isaret) {
            case "+": System.out.println("Sayilarin toplami : " + (ilkSayi+ikinciSayi));break;
            case "-": System.out.println("Sayilarin cikarma : " + (ilkSayi-ikinciSayi));break;
            case "*": System.out.println("Sayilarin carpimi : " +(ilkSayi*ikinciSayi));break;
            case "/": System.out.println("Sayilarin bölümü : " +(ilkSayi/ikinciSayi));break;
            case ">": System.out.println("Sayilardan büyük olani : " + Math.max(ilkSayi,ikinciSayi));break;
            case "<": System.out.println("Sayilardan büyük olani : " + Math.min(ilkSayi,ikinciSayi));break;
            default : System.out.println("Yanlis giris yaptiniz...");
        }
    }
}
