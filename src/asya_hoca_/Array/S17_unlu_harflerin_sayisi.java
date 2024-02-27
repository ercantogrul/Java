package asya_hoca_.Array;

import java.util.Arrays;

public class S17_unlu_harflerin_sayisi {
    public static void main(String[] args) {

/*
    Verilen Stringi array e cevirerek unlu harflerin sayisini bulan prgram yazin
    String s= "Apex,nesne yonelimli bir programlama dilidir"
                a e i o u */

        String s = "Apex,nesne yonelimli bir programlama dilidir";
        String[] kelime=s.replace(",","").replace(" ","").split("");
        System.out.println(Arrays.toString(kelime));
        String[] harf={"a","e","o","u","i"};

        int count=0;
        for (int i = 0; i < kelime.length; i++) {//kelime
            for (int j = 0; j < harf.length; j++) {//harf
                if(kelime[i].equalsIgnoreCase(harf[j])){
                    count++;
                }
            }
        }
        System.out.println(count);




    }
}
