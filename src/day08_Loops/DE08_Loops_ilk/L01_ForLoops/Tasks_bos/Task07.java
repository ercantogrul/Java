package day08_Loops.DE08_Loops_ilk.L01_ForLoops.Tasks_bos;

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        /*
        Task ->
        girilen boyuttta bir kare için
         Ekran Çıktısı
            Bir sayı giriniz: 7
            1 0 0 0 0 0 0
            0 1 0 0 0 0 0
            0 0 1 0 0 0 0
            0 0 0 1 0 0 0
            0 0 0 0 1 0 0
            0 0 0 0 0 1 0
            0 0 0 0 0 0 1


            Bir sayi giriniz: 5
            1 0 0 0 0
            0 1 0 0 0
            0 0 1 0 0
            0 0 0 1 0
            0 0 0 0 1

            şekli print eden code create ediniz
            Scanner sc=new  Scanner(System.in);
        System.out.println("kare için boyut giriniz : ");
        int boyut=sc.nextInt();
         */
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if (i==j) {
                    System.out.print(1);
                }
                System.out.print(0);
            }
            System.out.println();
        }
        System.out.println("=====================================");

        int n=5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <n; j++) {
                //System.out.print(""+i+j+" ");
                if((i+j)==(n-1)) System.out.print("1 ");
                else System.out.print("0 ");
            }
            System.out.println();
        }














    }
}
