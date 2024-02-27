package day13_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class C00_ArrayList {
    public static void main(String[] args) {
        int [] dizi1 ={1,3,4,6};
        int [] dizi2 = new int[10];
        System.out.println(Arrays.toString(dizi2));


        ArrayList<Integer> aList1 = new ArrayList<>(Arrays.asList(3,4,5,6,7));
        ArrayList<Integer> aList2 = new ArrayList<>(); // eleman sayisini belirtilmedi
        System.out.println(aList2.size());  // 0
        for (int i = 0; i < 10; i++) {
            aList2.add(i*i);   // insert islemi, normal array da yok...sonradan atama islemi
        }
        System.out.println(aList2.size()); // eleman sayisi verir ...// 10
        System.out.println(aList2);  //[0, 1, 4, 9, 16, 25, 36, 49, 64, 81]
    }
}
