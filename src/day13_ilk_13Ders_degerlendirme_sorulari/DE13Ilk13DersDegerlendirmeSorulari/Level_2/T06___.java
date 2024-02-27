package day13_ilk_13Ders_degerlendirme_sorulari.DE13Ilk13DersDegerlendirmeSorulari.Level_2;

public class T06___ {
    public static void main(String[] args) {
        /* String str= "20+8" şeklinde bir strin geriliyor bu string 2 sayı ve ortasında bir
        matematiksel işlemden oluşmaktadır, ortasındaki matematiksel işleme göre işlemi yapıp sonucu yazdırın
        output: = 20+8 = 28
        ortasındaki işlem 4 işlemin yanı sıra  "<" = küçüğünü bul, ">" büyüğünü bul işlemide olabilir
        switch  kullanın, case içerisinde ise her bir işlem için bir metot olsun

         */
        String str = "110/8";
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
        System.out.println(ilkSayi);
        System.out.println(ikinciSayi);
        switch (isaret) {
            case "+": System.out.println("Sayilarin toplami : " + (ilkSayi+ikinciSayi));break;
            case "-": System.out.println("Sayilarin toplami : " + (ilkSayi-ikinciSayi));break;
            case "*": System.out.println("Sayilarin toplami : " +(ilkSayi*ikinciSayi));break;
            case "/": System.out.println("Sayilarin toplami : " +(ilkSayi/ikinciSayi));break;
            case ">": System.out.println("Sayilardan büyük olani : " + Math.max(ilkSayi,ikinciSayi));break;
            case "<": System.out.println("Sayilardan büyük olani : " + Math.min(ilkSayi,ikinciSayi));break;
            default : System.out.println("Yanlis giris yaptiniz...");
        }
    }
}
