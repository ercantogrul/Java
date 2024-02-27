package day12_Arrays.DE12_Arrays_ilk.Tasks;

import java.util.Arrays;

public class Task10_Elemanlarin_Isaretlerini_Degistirme {

    public static void main(String[] args) {
        /* TASK :
        bir int Array elemanlarinin işaretini(+-)degistiren  bir METHOD create ediniz.
        input : 1,2,-3,4,-5,-6
        output :-1,-2,3,-4,5,6
         */
        int [] array = {1,2,-3,4,-5,-6};

        isaretDegistirme(array);
    }

    private static void isaretDegistirme(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = -1*array[i];
        }
        System.out.println(Arrays.toString(array));

    }


}
