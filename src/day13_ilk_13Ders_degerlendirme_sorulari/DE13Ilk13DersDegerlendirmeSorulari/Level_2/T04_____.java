package day13_ilk_13Ders_degerlendirme_sorulari.DE13Ilk13DersDegerlendirmeSorulari.Level_2;

public class T04_____ {
    public static void main(String[] args) {
        // Aşağıdaki stringin harfleri bir büyük bir küçük olacak şekilde yazdırın
        // string değiştiğinde de proğram çalışmalı, boşlukları es geçin
        // String str = "merhaba arkadaşlar"
        // output str = "MeRhAbA aRkAdAşLaR" şeklinde yazmalı

        String str =  "merhaba ark adaşlar";
        System.out.println(str);
        boolean buyukSirasi=true;
        String yStr="";
        for (int i = 0; i <str.length() ; i++) {
            String harf = str.substring(i,i+1);
            if (harf.equals(" ")) {
                yStr = yStr + " ";
                continue;
            }
            if (buyukSirasi) {
                yStr=yStr + harf.toUpperCase();
                buyukSirasi=false;
            } else {
                yStr= yStr + harf.toLowerCase();
                buyukSirasi=true;
            }

        }
        System.out.println(yStr);
    }



}
