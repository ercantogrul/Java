package day13_ilk_13Ders_degerlendirme_sorulari.DE13Ilk13DersDegerlendirmeSorulari.Level_2;

import java.util.ArrayList;
import java.util.Arrays;

public class T18 {
    /* rastgele 20 elemanlı  bir ArrayList üretin  (sayılar 1 ila 100 arasında olsun)
    bu arrayList in  en küçük 2.elemanını ve kaçıncı sırada olduğunu bulunuz

     */
    public static void main(String[] args) {

        String str = "20-8";
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
        int sonuc =0;
        switch (isaret) {
            case ("+") : sonuc =sayi1+sayi2; break;
            case ("-") : sonuc =sayi1-sayi2; break;
            case ("/") : sonuc =sayi1/sayi2; break;
            case ("*") : sonuc =sayi1*sayi2; break;
            case (">") :
                System.out.println(sayi1+" buyuktur "+ sayi2); break;
            case ("<") : System.out.println(sayi1+" kucuktur "+ sayi2); break;
            default :
                System.out.println("Hatali giris"); break;

        }
        System.out.println("sonuc = " + sonuc);
    }





}
