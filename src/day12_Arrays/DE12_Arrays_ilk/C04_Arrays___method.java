package day12_Arrays.DE12_Arrays_ilk;

import java.util.Arrays;

public class C04_Arrays___method {
    public static void main(String[] args) {
        int vrr=10;
       int[] dizi =new  int[10];
        // bu diziyi random olarak( 0 ile 99 arasında sayılar ile) method için de doldurun
       dizi = doldur(dizi.length);
               System.out.println(Arrays.toString(dizi));
       dizi = doldur2(dizi);// ikisi aynı işi yapıyor
               System.out.println(Arrays.toString(dizi));

       int[] dizi2 = doldur(10);
        // oluşan diziyi yaz isimli bir metotta yazdırın
        yaz(dizi);
    }

    private static int[] doldur2(int[] arr) {

        for (int i = 0; i < arr.length ; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        return arr;
    }

    private static void yaz(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    public static int[] doldur(int uzunluk){

        int[] arr = new int[uzunluk];
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        return arr;
    }

}
