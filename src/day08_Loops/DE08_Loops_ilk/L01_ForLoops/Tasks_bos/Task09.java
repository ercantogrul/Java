package day08_Loops.DE08_Loops_ilk.L01_ForLoops.Tasks_bos;

import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {
           /*
        task-> girilen boyutta aşağıdaki şekli  print eden code create ediniz
          Örnek Ekran çıktısı
      *
      * *
      * * *
      * * * *

         */
        Scanner sc = new Scanner(System.in);

//        System.out.println("kare için boyut giriniz : ");
//        int boyut = sc.nextInt();
        int boyut=5;

        for (int i = 1; i < 5; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
