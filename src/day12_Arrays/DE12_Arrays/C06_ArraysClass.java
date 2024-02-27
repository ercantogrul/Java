package day12_Arrays.DE12_Arrays;

import java.util.Arrays;

public class C06_ArraysClass {
    public static void main(String[] args) {
        int[] dizi = {4,6,33,44,11,5,7,8};
        int[] dizi2 = {4,6,33,44,11,5,7,8};
        Arrays.fill(dizi,55); // dizinin tüm elemanlarını 55 yapar
        System.out.println(Arrays.toString(dizi));// diziyi print eder

        Arrays.sort(dizi); // diziyi küçükten büyüğe sıralar

        System.out.println(Arrays.compare(dizi, dizi2)); // iki dizi eşitse sıfr farklı ise 1 verir

        int[] dizi3 = Arrays.copyOf(dizi2,5); // dizinin ilk 5 elemanından yeni bir dizi oluşturdu

        dizi2 = Arrays.copyOf(dizi2,5);// diziyi sondan kısalttık
        System.out.println(Arrays.toString(dizi2));
        dizi2 = Arrays.copyOf(dizi2,10);// diziyi uzattık, eklenen elemanlar sıfır oldu
        System.out.println(Arrays.toString(dizi2));
        dizi2 = Arrays.copyOfRange(dizi2,3,6); // 3. elemandan , 6.elemana kadar olan kısmı alır

        System.out.println(Arrays.toString(dizi2));


    }
}
