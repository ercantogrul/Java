package day12_Arrays.DE12_Arrays_ilk.Tasks;

import java.util.Arrays;

public class _08_array_min_value {

    public static void main(String[] args) {

        /*
        int Array oluşturun ve elemanları : 14 , 19 , 5 , 21
        En küçük (minimum) sayıyı yazdırınız.
         */
        // Kodu aşağıya yazınız..

        int [] array = {14 , 19 , 5 , 21};

        int enK= array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i]<enK){
                enK= array[i];
            }

        }
        System.out.println(enK);

        //=====================ikinci yöntem=================================

        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        int min = array[0];
        System.out.println(min);



    }
}

