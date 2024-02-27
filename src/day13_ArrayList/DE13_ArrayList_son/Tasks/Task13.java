package day13_ArrayList.DE13_ArrayList_son.Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task13 {
    /* TASK :
     * If the array is { 3, 5, 1, 2, 7, 9, 2, 3, 5, 7 }
     * type a program to create a new array whose elements are like {3, 5+1, 2+7+9, 2+3+5+7}
     * ardışık array elemanların toplamını hesaplayan bir method create ediniz.
     */
    public static void main(String[] args) {

        ArrayList<Integer> liste = new ArrayList<>(Arrays.asList(3, 5, 1, 2, 7, 9, 2, 3, 5));
        ardisikToplam(liste);

    }

    private static void ardisikToplam(ArrayList<Integer> liste) {
        int tes=1; // toplanacak eleman sayisi
        int toplanSayi=0;
        int toplam=0;
        for (int i = 0; i <liste.size() ; i++) {
            toplam = toplam + liste.get(i);
            toplanSayi++;
            if (toplanSayi==tes) {
                System.out.print(toplam+" ");
                tes++;
                toplanSayi=0;
                toplam=0;
            }
        }
        if (toplanSayi !=0) System.out.println(toplam);
    }
}

