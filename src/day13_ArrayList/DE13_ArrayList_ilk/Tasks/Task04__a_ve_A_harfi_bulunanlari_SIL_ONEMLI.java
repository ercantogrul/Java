package day13_ArrayList.DE13_ArrayList_ilk.Tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class Task04__a_ve_A_harfi_bulunanlari_SIL_ONEMLI {
    public static void main(String[] args) {
        /* TASK :

         * Input olarak verilen listteki isimlerden
         * icinde ‘a’ ve 'A'  harfi bulunanlari silen bir code create ediniz.
         *
         * INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
         * OUTPUT : [Veli,Omer]
         */

        ArrayList<String> isimList = new ArrayList<>(Arrays.asList("Ali", "Veli", "Ayse", "Fatma", "Omer"));
        ArrayList<String> aOlmayanIsimList = new ArrayList<>();//a olmayan isimlerin ekleneceği boş list tanımlandı
        System.out.println("isimList = " + isimList);



        yontem1(isimList);
        yontem2(isimList);


    }

    private static void yontem2(ArrayList<String> isimList) {
        ArrayList<String> aolmayanIsimlist =new ArrayList<>();
        for (int i = 0; i < isimList.size(); i++) {
            String eleman =isimList.get(i);


            if (!eleman.toLowerCase().contains("a")) aolmayanIsimlist.add(eleman);



        }
        System.out.println(isimList);

    }

    private static void yontem1(ArrayList<String> isimList) {
        for (int i = 0; i < isimList.size(); i++) {
            String eleman =isimList.get(i);
            //eleman = eleman.replace("a","").replace("A",""); eleman icindeki harfleri sildi

            if (eleman.toLowerCase().contains("a")){
                isimList.remove(isimList.get(i)); // remov 0. elemani silince 1 eleman 0 indexe gider. dolayisi ile bu elemani atlar
                i--;
            }

        }
        System.out.println(isimList);


    }
}
