package day13_ArrayList.DE13_ArrayList_ilk.Tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class Task13____ {
    /* TASK :
     * If the array is { 3, 5, 1, 2, 7, 9, 2, 3, 5, 7 }
     * type a program to create a new array whose elements are like {3, 5+1, 2+7+9, 2+3+5+7}
     * ardışık array elemanların toplamını hesaplayan bir method create ediniz.
     */
    public static void main(String[] args) {

        int[] array = {3, 5, 1, 2, 7, 9, 2, 3, 5, 7};

        ArrayList<Integer> liste = new ArrayList<>(Arrays.asList(3, 5, 1, 2, 7, 9, 2, 3, 5, 7));

        ardisikTopla(liste);


    }

    private static void ardisikTopla(ArrayList<Integer> liste) {
        int tes = 1; // toplanan eleman sayiyi
        int toplananSayi=0;
        int toplam =0;

        for (int i = 0; i < liste.size(); i++) {
            toplam+=liste.get(i);
            toplananSayi++;
            if (toplananSayi==tes){
                System.out.println(toplam+" ");
                tes++;
                toplananSayi=0;
                toplam=0;
            }
        }
        if (toplananSayi!=0) System.out.println(toplam); // son eleman bir eksik olursa if de toplamadigi icin ekstra toplanacak


    }
}

