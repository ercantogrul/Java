package day12_Arrays;

import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {
        String[] sDizi = {"Ali","Gül","Asu","Mehmet","Hasan"};
        String[] sDizi2 = {"","","","",""};
        String[] sDizi3 = new String [5]; // tümünü null yapti
        char[] chArr =new char[10];// 10 elemanli bir dizi
        //dizinin eleman sayisi belirtmek zorundadir
        System.out.println(sDizi.length);   // dizinin eleman sayisi //5
        System.out.println(sDizi[sDizi.length-1]);  // dizinin son elemani //Hasan
        System.out.println(sDizi[1].length());  // dizinin 1. elemaninin yani "Gül" ün uzunlugu=3

        //=====================================================================

        int[] arr = new int[10];
        System.out.println(Arrays.toString(arr)); // diziyi bastan sona yazdiri //[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
        System.out.println(Arrays.toString(sDizi2)); // diziyi bastan sona yazdiri
        System.out.println(Arrays.toString(sDizi3)); // diziyi bastan sona yazdiri
        System.out.println(Arrays.toString(chArr)); // diziyi bastan sona yazdiri
        System.out.println(chArr[1]+0);
        System.out.println(arr);




    }
}
