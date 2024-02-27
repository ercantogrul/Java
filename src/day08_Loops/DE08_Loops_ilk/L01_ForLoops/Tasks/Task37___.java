package day08_Loops.DE08_Loops_ilk.L01_ForLoops.Tasks;

import java.util.Scanner;

public class Task37___ {
    public static void main(String[] args) {

        /*
 Type code to ask user to enter the number of row
 and print the shape below according to that number: n

       *
      * *
     * * *
    * * * *
   * * * * *
  * * * * * *
 * * * * * * *
      ***
      ***
      ***
      ***
      ***
  */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of rows");

        int n = 7;
        String str ="";

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }


      int n2=5;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j <=4 ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 3; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}

