package day07_StringManuplation.DE07_StringManuplation_ilk;

public class C04_Contains_icermek {
    public static void main(String[] args) {
             /*
        String iersinde istenen stringini varlığını kontrol eder boolean değer return eder..
         */

        String str = "başarı gayrete aşıktır :) javaCAN'lara selam olsun";

        if (str.contains(" :) ")) System.out.println("içerir");
        else System.out.println("içermez");

        if (str.contains("CAN"))  {
            System.out.println("icerir");
        }else System.out.println( "icermezz");
        //================================================================

        // *** contains method'u aranan metnin sayisiyla ilgilenmez
        //     sadece VAR veya YOK sonucu dondurur
        //  BOOLEAN DÖNDÜRÜR

        String str1 ="Merhaba Dunya";
        boolean sonuc = str1.contains("aba");  System.out.println(sonuc); // true
        boolean sonuc1 = str1.contains(" aba ");  System.out.println(sonuc1); // false (cunku bosluklar var)

        if (str.contains("aba")){System.out.println("icermektedir");
        }else System.out.println("aranan metin bulunamadi");





    }


}
