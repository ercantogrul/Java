package day12_Arrays.DE12_Arrays_ilk.Tasks;
import java.util.Arrays;
public class _07_array_max_value {
    public static void main(String[] args) {
        /*int Array oluşturun ve elemanları : 12,2,5,15,8
            En büyük değeri yazdırınız.
         */
        // code start here

        int [] array = {12,2,5,15,8};

        int enB = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i]>enB) {
                enB=array[i];
            }
        }
        System.out.println("En Büyük deger:" +enB);

        //=============ikinci yöntem===============
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        int max = array[array.length-1];
        System.out.println("En Büyük deger:"+max);
        int min = array[0];
        System.out.println("En Kücük deger:"+min);


    }
}

