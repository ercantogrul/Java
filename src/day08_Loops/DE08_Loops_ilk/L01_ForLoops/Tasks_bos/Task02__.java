package day08_Loops.DE08_Loops_ilk.L01_ForLoops.Tasks_bos;

import java.util.Scanner;

public class Task02__ {
    public static void main(String[] args) {
        /* task-> interview question
        girilen ifadenin polindrome olmasını kontrol eden code create ediniz...
        plindrome:her iki yönde okundugunda eşit olan ifadeler :
        örnekler
        "ece"
        "ada"
        "ey edip adanada pide ye"

         */

        Scanner sc = new Scanner(System.in);
        System.out.print("bir metin  giriniz : ");
        String str = sc.nextLine();
        int n = str.length();
        int sI= n-1;
        boolean polidromdur=true;

        for (int i = 0; i <n/2 ; i++) {
           if (str.charAt(i) != str.charAt(sI-i)) {
               polidromdur=false;
               break;
            }
        }
        if (polidromdur) System.out.println("polidromdur");
        else System.out.println("polidrom değildir");

        // 2. yol   adada
        int sayac=0;
        for (int i = 0; i <n ; i++) {
             if (str.charAt(i) == str.charAt(sI-i)) {
                 sayac++;
             }
        }
        if (sayac==n) System.out.println("poidromdur");
        else System.out.println("polidrom değildir");

        // 3.yol
        sayac=0;
        for (int i = 0; i <n ; i++) {
            if (str.charAt(i) != str.charAt(sI-i)) {
                sayac++;
                break;
            }
        }
        if (sayac==0) System.out.println("poidromdur");
        else System.out.println("polidrom değildir");

        //4.yol
       polidromdur=true;
        for (int i = 0; i <n ; i++) {
            if (str.charAt(i) != str.charAt(sI-i)) {
               polidromdur=false;
               break; // içinde bulunduğu loop dan çıkılmasını sağlar
            }

        }

        if (polidromdur) System.out.println("poidromdur");
        else System.out.println("polidrom değildir");





    }


}
