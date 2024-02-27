package day08_Loops.DE08_Loops_ilk.L01_ForLoops.Tasks;

import java.util.Scanner;

public class Task23_n_sayiya_kadar_olan_sayilarin_kareleri_toplami {
    public static void main(String[] args) {

    /*  task-> 1 den girilen tam sayıya kadar olan sayıların karelerinin toplamını
         print eden code create ediniz.


        Girilen sayı=4
        Kareler toplamı=30
     */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayıyı yazınız : ");
        int n = scanner.nextInt();
        long karelerToplami=0;

        for (int i = 1; i <=n ; i++) {

            karelerToplami =karelerToplami+i*i;   //karelerToplami +=i*i; olabilir
        }




    }
}
