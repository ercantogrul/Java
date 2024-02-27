package day08_Loops.DE08_Loops_ilk.L01_ForLoops.Tasks02;

import java.util.Scanner;

public class Task02_03__n_kadar_cift_sayilarin_toplami {
    public static void main(String[] args) {
        // 1 den n kadar çift sayıların toplamını bulan bir program yazınız

        Scanner scan =new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        int n = scan.nextInt();

        int toplam =0;
        for (int i = 0; i < n; i++) {
            if (i%2==0){
                toplam=toplam+i;
            }
            System.out.println(toplam);
        }


    }
}
