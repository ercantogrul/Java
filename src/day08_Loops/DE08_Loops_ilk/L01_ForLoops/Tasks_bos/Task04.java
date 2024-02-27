package day08_Loops.DE08_Loops_ilk.L01_ForLoops.Tasks_bos;

import java.util.Scanner;

public class Task04 {

    public static void main(String[] args) {
// task-> girilen iki tamsayı arasındaki çift sayıları print eden code create ediniz...

        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int sayi1 = input.nextInt();
        System.out.print("Bir sayı daha giriniz : ");
        int sayi2 = input.nextInt();
        int max = sayi1>sayi2? sayi1 :sayi2;
        int min = sayi1>sayi2? sayi2 :sayi1;


        int sayacC=0;
        for (int i = min; i <max ; i++) {
           if(i%2==0){

               System.out.println(i+", ");
           }

        }





    }
}
