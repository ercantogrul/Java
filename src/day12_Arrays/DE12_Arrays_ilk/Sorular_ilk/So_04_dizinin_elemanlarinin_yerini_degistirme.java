package day12_Arrays.DE12_Arrays_ilk.Sorular_ilk;

import java.util.Arrays;

public class So_04_dizinin_elemanlarinin_yerini_degistirme {
    public static void main(String[] args) {
         /* Soru - 1 : 10 elemanlı bir int list dizisi oluşturun ve içerisini
         1 ila 100 arasında rastgele sayılarla doldururun ve diziyi yazdırın==========================
         */

        int[] list = new int[10];
        for (int i = 0; i < list.length; i++) {
            list[i] = (int) (Math.random() * 100 + 1);
        }
        System.out.println(Arrays.toString(list));  // ornegin [60, 56, 29, 21, 23, 26, 16, 20, 99, 83]

        // soru 2: list dizisinin en büyük elemanini bulunuz=================================

        int enB = list[0];
        for (int i = 0; i < list.length; i++) {
            if (list[i] > enB) enB = list[i];
        }
        System.out.println((enB));

        // soru 3: en büyük elemanin yerini bulunuz==========================================
        enB = list[0];
        int enBidx = 0; // en büyük sayinin indexi bulnak icin index int i tanimladik
        for (int i = 0; i < list.length; i++) {
            if (list[i] > enB) {
                enB = list[i];
                enBidx = i; // en son en büyük sayinin indexi ne oldugunu ögrenmek icin...
            }
        }
        System.out.println((enBidx));

        // soru 4 : bu bulunduğunuz en büyük eleman ile 0. elemanı yer değiştiriniz=====================
        int temp = list[0];
        list[0] = list[enBidx];
        list[enBidx] = temp;

        System.out.println("list = " + Arrays.toString(list));

    }
}
