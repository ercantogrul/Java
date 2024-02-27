package day12_Arrays.DE12_Arrays_ilk;

import day12_Arrays.DE12_Arrays_ilk.BizimArrays;

import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {
        String[] sDizi = {"Ali","Gül","Asu","Mehmet","Hasan"};
        String[] sDizi2= {"","","","",""};
        String[] sDizi3= new String[5]; // tümünü null yaptı
        char[] chArr = new char[10];
        // dizinin eleman sayısı belirtilmek zorundadır
        System.out.println(sDizi.length);     // dizinin eleman sayısı ))5
        System.out.println(sDizi[sDizi.length-1]); // dizinin son elemanı  // Hasan
        System.out.println(sDizi[1].length()); // dizinin 1. eelmanının yani "gül" ün uzunluğu // 3

        int [] arr = new int[10];
        int [] arr2={3,4,6,2,66,1,2,3};

        System.out.println(Arrays.toString(arr)); // diziyi baştan sona yazdırır     // [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
        System.out.println(Arrays.toString(sDizi2)); // diziyi baştan sona yazdırır // [, , , , ]
        System.out.println(Arrays.toString(sDizi3)); // diziyi baştan sona yazdırır // [null, null, null, null, null]
        System.out.println("jvlckxvjlz"+Arrays.toString(chArr)); // diziyi baştan sona yazdırır //

        System.out.println(Arrays.toString(sDizi));
        BizimArrays.yaz(sDizi);
        System.out.println(BizimArrays.yazString(sDizi)); //[Ali, Gül, Asu, Mehmet, Hasan]

        System.out.println(BizimArrays.yazString(arr2));  //[3, 4, 6, 2, 66, 1, 2, 3]
        System.out.println(Arrays.toString(arr2));   //[3, 4, 6, 2, 66, 1, 2, 3]



    }
}
