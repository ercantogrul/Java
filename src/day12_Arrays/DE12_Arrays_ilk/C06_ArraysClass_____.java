package day12_Arrays.DE12_Arrays_ilk;

import java.util.Arrays;

public class C06_ArraysClass_____ {
    public static void main(String[] args) {
        int [] dizi = {4,6,33,44,11,5,7,8};
        int [] dizi2 = {4,6,33,44,11,5,7,8};

        Arrays.fill(dizi,55); // dizinin tüm elemanlarini 55 yapar
        System.out.println(Arrays.toString(dizi)); //[55, 55, 55, 55, 55, 55, 55, 55]

        Arrays.sort(dizi2);
        System.out.println(Arrays.toString(dizi2));// diziyi kücükten büyüge siralar, [4, 5, 6, 7, 8, 11, 33, 44]

        System.out.println(Arrays.compare(dizi,dizi2)); // iki dizi esitse sifir, farkli ise -1 verir

        int [] dizi3 = Arrays.copyOf(dizi2,5);// dizinin ilk 5 elemanindan yeni bir dizi olusturdu
        System.out.println(Arrays.toString(dizi3)); //[4, 5, 6, 7, 8]

        dizi2 = Arrays.copyOf(dizi2,5); // diziyi sondan kisalttik
        System.out.println(Arrays.toString(dizi2)); //[4, 5, 6, 7, 8]

        dizi2 = Arrays.copyOf(dizi2,10); // diziyi uzattik, eklenen elemanlar sifir oldu
        System.out.println(Arrays.toString(dizi2));//[4, 5, 6, 7, 8, 0, 0, 0, 0, 0]

        dizi2 = Arrays.copyOfRange(dizi2,3,6); // 3 den 6 ya kadar keser
        System.out.println(Arrays.toString(dizi2));//[7, 8, 0]
    }
}
