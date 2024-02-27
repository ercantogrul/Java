package asya_hoca_.Array;

import java.util.Arrays;

public class S14__ {
    public static void main(String[] args) {
        /*
        /1'den 100'e kadar 3'e bölünebilen sayıları listesini 10'lu yazdırarak
            //{{3,6,9},{12,15,18},{21,24,27,}..}
         */
        int counter = 0;
        for (int i = 0; i < 100; i++) {
            if (i % 3 == 0) counter++;
        }
        System.out.println(counter);

        int [] [] dizi = new int[10][counter/10+1];
        System.out.println(Arrays.deepToString(dizi));


    }
}
