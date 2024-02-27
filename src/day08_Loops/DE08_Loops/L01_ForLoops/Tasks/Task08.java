package day08_Loops.DE08_Loops.L01_ForLoops.Tasks;

import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
/*
        task-> girilen boyutta kare çarpım tablosu print eden code create ediniz
          Örnek Ekran çıktısı
       1  2  3  4  5
       2  4  6  8 10
       3  6  9 12 15
       4  8 12 16 20
       5 10 15 20 25

       5x5
         */
        Scanner input=new Scanner(System.in);
        System.out.println("bizim gızzz birinç sayı gir bakennn : ");
        // int boyut=input.nextInt();

        int n = 7;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n ; j++) {
                System.out.printf("%3d",i*j);
            }
            System.out.println();
        }






    }
}
