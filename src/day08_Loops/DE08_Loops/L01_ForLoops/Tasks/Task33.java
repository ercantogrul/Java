package day08_Loops.DE08_Loops.L01_ForLoops.Tasks;

import java.util.Scanner;

public class Task33 {
    /*
        Bir sayinin mükemmel olup olmadiğini bulan bir program yaziniz.
        Mükemmel sayi : bir sayinin kendisi hariç bölenlerinin toplamı, kendisine eşitse o sayi mükemmeldir.
        ORNEK:
        INPUT     : 6
        OUTPUT : 1,2,3
                      1+2+3 = 6 = 6 (Mükemmel)



        */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        System.out.print("Lutfen bir sayi giriniz : ");
//        int sayi = scan.nextInt();
        // 1 den 1000 e kadar mükemmel sayıları yazdıralm
        for (int i = 1; i <1000 ; i++) {
            int toplam = 0;
            for (int j = 1; j <i ; j++) {
                // toplam+= sayi%i==0? i:0; , burası alttakinin aynı,
                if (i%j==0) toplam +=j;
            }
            if (toplam==i) System.out.println(i+" Mukemmel sayıdır");

        }




    }


}
