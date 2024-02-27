package asya_hoca_.Array;

import java.util.Arrays;
import java.util.Scanner;

public class S09_uc_e_bolunebilen_dizi_elemanlari {
    public static void main(String[] args) {
         /* task->
         Kullanicidan aldigimiz 8 elemanli arrayin icinde
         kac tane 3 e bolunebilen sayi vardir ?(negatif sayilar da dahil olsun)
        */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen 8 elemanli bir dizi olusturunuz");
        int n = scan.nextInt();
        int [] array = new int[n];

        for (int i = 0; i <array.length ; i++) {
            System.out.println("dizinin elemanlarini giriniz");
            array [i] = scan.nextInt();
        }
        System.out.println(Arrays.toString(array));

        uceBolunmeKontrolu(array);



    }

    private static void uceBolunmeKontrolu(int[] array) {
        int counter =0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]%3==0) {
                counter++;

            }


        }System.out.println(counter);
    }
}
