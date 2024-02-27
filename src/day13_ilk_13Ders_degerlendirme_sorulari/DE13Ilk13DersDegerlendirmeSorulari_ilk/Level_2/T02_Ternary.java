package day13_ilk_13Ders_degerlendirme_sorulari.DE13Ilk13DersDegerlendirmeSorulari_ilk.Level_2;

import java.util.Arrays;
import java.util.Scanner;

public class T02_Ternary {
    public static void main(String[] args) {
        // 4 adet rastgele sayı üretin veya okutun , Ternary yardımı ile yardımı ile en küçüğünü bulun,
        // sayıları üretiikten veya okuttuktan sanra
        // çözüm sadece 1 satırta bitsin ( yani tek ";" kullanılacak

        Scanner scan = new Scanner(System.in);
        System.out.println("4 sayi giriniz");

        int[] arr = new int[4];

        for (int i = 0; i < 4; i++) {
            arr[i] = (int) (Math.random() * 20 + 1);
        }
        System.out.println(Arrays.toString(arr));

        int enB = (arr[0]>arr[1] && arr[0]>arr[2] && arr[0]>arr[3])? arr[0]:
                (arr[1]>arr[2] && arr[1]>arr[3])? arr[1]:(arr[2]>arr[3])? arr[2]:arr[3];
        System.out.println("enB = " + enB);


    }
}
