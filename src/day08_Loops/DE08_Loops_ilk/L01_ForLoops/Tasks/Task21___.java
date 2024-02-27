package day08_Loops.DE08_Loops_ilk.L01_ForLoops.Tasks;

import java.util.Scanner;

public class Task21___ {

    /*
             *
            * *
           * ! *
          * ! ! *
         * ! ! ! *
        * ! ! ! ! *
       * ! ! ! ! ! *
      * * * * * * * *
      şekli print eden code create ediniz.
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
       // System.out.println("satir gir : ");
        int n = 8;

        for (int i = 1; i <=n ; i++) {            //n adet satir olusturmak icin
            for (int j = 1; j <=(n-i) ; j++) {    // n-satir sirasi(i) kadar bosluk birakmak
                System.out.print(" ");
            }
            for (int j = 1; j <=i ; j++) {         // bu fr un görevi satir sirasi(i) kadar "*" veya "!" koymak
                if (i==1 || i==n||j==1 ||j==i) System.out.print("* ");  // bu if in görevi  konulacak "*" veya "!" belirlemek
                else System.out.print("! ");


            }
            System.out.println();         // bu printin görevi, satir olusturmak
        }
























    }

}
































