package day12_Arrays.DE12_Arrays.Sorular;

import java.util.Arrays;

public class S01 {
    public static void main(String[] args) {
        /*
         Soru 1- 5 elemanlı arr adında bir int dizisi oluşturun, elemanları 3,6,1,3,5 olsun
         */
        // yol 1
        int[] arr = {3,6,1,3,5};
        // yol2
        int[] arr2=new int [] {5,1,11,4,6};
        //yol 3
        int[] arr3=new int[5];
        arr3[0] = 3;    int a1=3;
        arr3[1] = 6;    int a2=6;
        arr3[2] = 1;    int a3=1;
        arr3[3] = 3;    int a4=3;
        arr3[4] = 5;    int a5=5;
        // soru 2. arr dizinin ilk ve son elemanını print ediniz
        System.out.println(arr[0]);
        System.out.println(arr[arr.length-1]); //son elemanı print eder
        // soru 3 : dizinin ilk ve son elemanını toplayıp bir toplam değişkenine atın
        int toplam = arr[0] + arr[arr.length-1];
        // soru 4 : bu diziyi baştan sona kadar for içerisinde yazdırın. Arrays class kullanmadan
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
        // soru 5 : arr dizisinin elemanlarının toplamını bulunuz ve yazdırınız
        toplam = 0;
        for (int i = 0; i < arr.length ; i++) {
            toplam += arr[i];
        }
        System.out.println(toplam);
        // soru 6 elemanlarını toplayın
        int[] arrT = new int[arr.length];
        // arr = {3, 6, 1, 3, 5};
        // arr2= {5, 1,11, 4, 6};
        // arrT=  8, 7,12, 7,11 şeklinde oluşmalı
        for (int i = 0; i < arrT.length ; i++) {
            arrT[i] = arr[i]+arr2[i];
        }
        System.out.println(Arrays.toString(arrT));
    }
}
