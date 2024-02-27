package day13_ilk_13Ders_degerlendirme_sorulari.DE13Ilk13DersDegerlendirmeSorulari_ilk.Level_2;

import java.util.Arrays;
import java.util.Scanner;

public class T16_array_enB_enK_yerlerini_degistirme {
    /* rastgele n elemanlı ( ni klavyeden okutun) bir array üretin
    (sayılar 1 ila 100 arasında olsun)     bu arrayın en küçük elemanı ile
    en büyük elemanı yer değiştirin(yer değişme işlemi bir method içinde olsun)
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        int n = scan.nextInt();

        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100 + 1);
        }
        System.out.println("ilk array: " + Arrays.toString(array));

        yerdegistirme(array);


    }

    private static void yerdegistirme(int[] array) {

        int enB = Integer.MIN_VALUE;
        int enK = Integer.MAX_VALUE;
        int enBidx = 0;
        int enKidx = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > enB) {
                enB = array[i];
                enBidx = i;
            }
            if (array[i] < enK) {
                enK = array[i];
                enKidx = i;
            }
        }
        System.out.println("en kucuk sayi : " + enK);
        System.out.println("en buyuk sayi : " + enB);

        int temp = array[enBidx];
        array[enBidx] = array[enKidx];
        array[enKidx] = temp;

        System.out.println("yeni array : "+Arrays.toString(array));




    }
}