package day08_Loops.DE08_Loops_ilk.L01_ForLoops.Tasks;

import java.util.Scanner;

public class Task04__iki_sayi_arasindaki_sayilar {

    public static void main(String[] args) {
// task-> girilen iki tamsayı arasındaki çift sayıları print eden code create ediniz...



        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int sayi1 = input.nextInt();
        System.out.print("Bir sayı daha giriniz : ");
        int sayi2 = input.nextInt();


        if (sayi1>sayi2){
            for (int i = sayi1; i >sayi2 ; i--) {
                if (i%2==0){
                    System.out.print("iki tamsayı arasındaki çift sayılar:"+i+", ");
                }
            }
        }else
            for (int i = sayi2; i >sayi1 ; i--) {
                if (i%2==0){
                    System.out.print("iki tamsayı arasındaki çift sayılar:"+i+", ");
                }
            }





    }
}
