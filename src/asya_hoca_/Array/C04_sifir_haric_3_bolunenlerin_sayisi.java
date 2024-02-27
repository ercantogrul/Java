package asya_hoca_.Array;

import java.util.Scanner;

public class C04_sifir_haric_3_bolunenlerin_sayisi {
    public static void main(String[] args) {
        /*
         Kullanicidan aldigimiz 8 elemanli arrayin icinde sıfır hariç
         kac tane 3 e bolunebilen sayi vardir ?(negatif sayilar da dahil olsun)
        */


        System.out.println("Lütfen 8 elemanli bir dizi olusturunuz");
        Scanner scan = new Scanner(System.in);
        int[] array = new int[8];
        int counter = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();
            if (array[i] != 0 && array[i] % 3 == 0) {
                counter++;

            }


        }
        System.out.println("sifir haric üc e bölünen sayilarin sayisi : "+counter);







    }



}
