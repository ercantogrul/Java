package day14_ForEachLoops;

import java.util.ArrayList;
import java.util.Arrays;

public class C00_ForEach {
    public static void main(String[] args) {
        // For Each liste baştan sona taranır
        ArrayList<Integer> liste = new ArrayList<>(Arrays.asList(3, 5, 1, 2, 7, 9, 2, 3, 5));
        int toplam = 0;
        for (Integer eleman : liste) {
            toplam += eleman;
        }
//        for (<dizinin veri tipi>  <sıra ile listenin elemanı> : <dizinin adı>) {
//            toplam += eleman;
//        }

        // önceki hali
        for (int i = 0; i <liste.size() ; i++) {
            int eleman = liste.get(i);
            toplam += eleman;
        }


        int[] dizi = {3, 5, 1, 2, 7, 9, 2, 3, 5};
        for (int eleman : dizi) {
            System.out.print(eleman+" ");
        }
        System.out.println();
        int[][] dizi2 = new int[10][20];
        for (int[] eleman : dizi2) {
            for (int icEleman : eleman) {
                System.out.print(icEleman);
            }
            System.out.println();
        }

    }
}
