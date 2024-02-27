package asya_hoca_._ArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class S00_n_adet_enB_sayiyi_yazdir {
    public static void main(String[] args) {
        /*
         * verilen arrayin n sayisi kadar maksimun  degerlerini bulan java programi yaziniz
         * not kisa metodlar kullamayiniz
         * Input : {1,2,3,4,5,6,7,8} input n:2 Output : 7 and 8
         */
        Scanner scanner = new Scanner(System.in);

        int[] arr={1,2,3,4,5,6,7,8,67,3,45,15,30,46};

        System.out.println("Kac adet maksimum sayi ciksin");
        int n = scanner.nextInt();
        Arrays.sort(arr);
        for (int i = arr.length-1; i > arr.length-1-n; i--) {
            System.out.println(arr[i]);
        }
    }

}
