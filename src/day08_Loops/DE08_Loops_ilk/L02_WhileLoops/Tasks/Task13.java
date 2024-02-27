package day08_Loops.DE08_Loops_ilk.L02_WhileLoops.Tasks;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        /*
        task -> x karakteri girilene kadar "javaCAN" x karakteri girildiğinde ise
        "javaTAR" print eden code create ediniz. (javaTar yaz ve çık)
        do-while lopp
         */
        Scanner scan = new Scanner(System.in);
        char c = 'x';
        /*
         for (int i = 0; i !=c; i++) {
            System.out.println("bir karakter giriniz");
            char ch = scan.next().charAt(0);
            if (c!=ch){
                System.out.println("javaCAN");

            } else if (c==ch) {
                System.out.println("javaTAR");
                break;
            }
         */


            boolean flag=true;
            int i =0;
            do{
                System.out.println("bir karakter giriniz");
                char ch1 = scan.next().charAt(0);
                if (c!=ch1){
                    System.out.println("javaCAN");
                } else if (c==ch1) {
                    System.out.println("javaTAR");
                    flag=false;
                }
                i++;

            } while (flag);

            //==============================

        while (flag){
            System.out.println("bir karakter giriniz");
            char ch1 = scan.next().charAt(0);
            if (c!=ch1){
                System.out.println("javaCAN");
            } else if (c==ch1) {
                System.out.println("javaTAR");
                flag=false;
            }
            i++;
        }
















    }
}
