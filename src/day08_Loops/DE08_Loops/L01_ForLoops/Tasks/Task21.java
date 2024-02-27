package day08_Loops.DE08_Loops.L01_ForLoops.Tasks;

import java.util.Scanner;

public class Task21 {

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
      //  System.out.println("satir gir : ");
        int n = 8;
        for (int i = 1; i <=n ; i++) { // bu forun görevi n adet satır oluşturmak için
            for (int j = 1; j <=(n-i) ; j++) { //bu forun görevi n-satırSırası(i) kadar boşluk koymak
                System.out.print(" ");
            }
            for (int j = 1; j <=i ; j++) { // bu forun görevi satırSırası(i) kadar "*"veya"!" koymak
                if (i==1 || i==n || j==1 || j==i) System.out.print("* "); // bu ifin göre, "!" mi "*" konulacak onu belirlemek
                else System.out.print("! ");
            }
            System.out.println();// bu printin görevi, satırları oluşturmak
        }



    }

}
































