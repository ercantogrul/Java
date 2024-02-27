package day08_Loops.DE08_Loops_ilk.L02_WhileLoops.Tasks;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        /*
        task-> girilen iki tamsayı arasındaki tamsayıları print eden code create ediniz.
        for loop & while loop
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("bir tam sayi giriniz: ");
        int sayi1 = sc.nextInt();
        System.out.println("ikinci tam sayi giriniz: ");
        int sayi2 = sc.nextInt();

        /*
         if (sayi1>sayi2) {
              for (int i = sayi1; i >sayi2 ; i--) {
                    System.out.print(i+" ");
               }
          }else for (int i = sayi2; i >sayi1 ; i--) {
                     System.out.print(i+" ");
          }
         */
        //=====================================================
        int max = sayi1>sayi2? sayi1:sayi2;
        int min = sayi1>sayi2? sayi2:sayi1;

        min =min+1;
        while ((min)<=max){
            System.out.print(min+", ");
            min++;
        }










    }
}
