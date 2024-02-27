package day08_Loops.DE08_Loops_ilk.L02_WhileLoops.Tasks;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        // task ->  Girilen bir sayıya kadar  olan tek sayıları print eden code create ediniz.
        Scanner oku = new Scanner(System.in);
        /*

        for (int i = 0; i < n; i++) {
            if (i%2!=0) {
                System.out.print(i+", ");
            }
        }
         */

//===================================================
        System.out.println("bir sayi giriniz");
        int n = oku.nextInt();
        int j=0;
        while (j<n) {
            if (j%2!=0)
            System.out.print(j+", ");
            j++;
        }












    }
}
