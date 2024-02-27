package day12_Arrays.DE12_Arrays_ilk.Tasks;

import java.util.Arrays;

public class _20_Arrayboth_Ends {

    public static void main(String[] args) {

     /*
     Oluşturacağınız int array'ini, length'i(eleman sayısı) 2 olan ve int array'inin(ilk oluşturduğunuz array)
     ilk ve son elementlerini kapsayan yeni array'e return edin.

    Oluşturacağınız int array'i =   ([1, 2, 3, 4])
    Sonuç bu şekilde olmalıdır. [1, 4]
      */
        //Kodu aşağıya yazınız..
        int[] array = {1, 2, 3, 4};
        int [] yeni = new int[2];
        for (int i = 0; i < array.length; i++) {
           yeni[0]=array[0];
           yeni[1]=array[array.length-1];
        }
        System.out.println(Arrays.toString(yeni));


    }
}