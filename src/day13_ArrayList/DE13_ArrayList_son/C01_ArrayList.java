package day13_ArrayList.DE13_ArrayList_son;

import java.util.ArrayList;
import java.util.Arrays;

public class C01_ArrayList {
    public static void main(String[] args) {
        int[] dizi1  = {4,5,7,3,2};
        int[] dizi2  = new int[10];
       // Integer[] dss= new Integer[10];

        ArrayList<Integer> aList1 = new ArrayList<>(Arrays.asList(4,5,7,3,2));
        ArrayList<Integer> aList2 = new ArrayList<>(); // Eleman sayısı belirtilmedi
         // List<Integer> aList2 = new ArrayList<>(); // Eleman sayısı belirtilmedi
        System.out.println(aList2.size());
        for (int i = 0; i <10 ; i++) {
            aList2.add(i*i); // Insert işemi , normal array da yok
        }
        System.out.println(aList2.size()); // dizi.length // eleman sayısı
        System.out.println(aList2);
    }
}
