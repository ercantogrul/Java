package day32_Enum.DE32_Enum.enum1;


import java.util.Arrays;

import static day32_Enum.DE32_Enum.enum1.Renkler.*;


public class Main {

    public static void main(String[] args) {

        Renkler r1= BLUE;
        Renkler r2= GREEN;
        if (r1 == Renkler.WHITE) System.out.println("aynıdır");
        else System.out.println("aynı değildir");
        switch (r1) {
            case RED -> System.out.println("renk kırmızıdır");
            case BLACK -> System.out.println("renk siyahtır");
        }

        System.out.println(r1.name()); // adını döndürüür
        String renk1 = r1.name(); // stringe cevirdik
        renk1 = r1.toString(); // stringe cevirdik
        System.out.println(r1.ordinal()); // sırasını (index ini )döndürür
        System.out.println(Renkler.BLACK.ordinal()); // sırasını döndürür
        System.out.println(r1.equals(r2)); // true veya false
        System.out.println(r1.compareTo(r2)); // -4 dönderir
        // alt ve üstteki tammen aynı
        System.out.println(r1.ordinal()-r2.ordinal()); // -4
        System.out.println(GREEN.compareTo(BLUE)); // +4 dönderir

        Renkler[] colors = Renkler.values();// enum dan bir dizi oluşturduk
        System.out.println(Arrays.toString(colors));

    }
}
