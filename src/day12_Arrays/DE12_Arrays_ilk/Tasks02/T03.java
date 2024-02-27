package day12_Arrays.DE12_Arrays_ilk.Tasks02;

import java.util.Arrays;

public class T03 {
    public static void main(String[] args) {
        // Girilen bir int değerlerini rakamlara göre sıralayan kod create ediniz
        int num = 81763134;
        // input : 81763134;
        // output: 11334678
        // stringe cevir
        // stringi,  string dizisine çevir
        // sırala
        // diziyi str ye çevir
        // str yi int e çevir

        siralama1(num);

    }
    private static void siralama1(int num) {
        String str = ""+num; //stringe cevir==81763134

        String[] arr = str.split(""); // diziye cevrildi
        Arrays.sort(arr);  // siralandi

        //ilk  diziyi str ye çevir==========================
        String yeni="";
        for (int i = 0; i < arr.length; i++) {
            yeni+=arr[i];
        }
        System.out.println(yeni);

        int son = Integer.parseInt(yeni); //str yi int e çevir
        System.out.println(son);

        // ikinci yol  //str yi int e çevir===================
        str=Arrays.toString(arr).replaceAll("\\D","");
        System.out.println(str);

        int a = Integer.parseInt(str); //str yi int e çevir
        System.out.println(a);


    }
}
