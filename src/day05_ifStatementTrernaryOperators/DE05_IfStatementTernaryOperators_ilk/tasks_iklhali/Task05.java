package day05_ifStatementTrernaryOperators.DE05_IfStatementTernaryOperators_ilk.tasks_iklhali;

import java.util.Scanner;

public class Task05 {

    public static void main(String[] args) {
		/* Task->
		 Girilen bir sayı için
		 sayi 3 basamakli ise console ' a "3 basamakli"
		 sayi 2 basamakli ise console'a "2 basamakli"
		 sayi 3 basamakli yada 2 basamakli degilse "ikisi de degil"  print eden code create ediniz
		 */

        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayi giriniz: ");
        int sayi1 = scan.nextInt();

        if (sayi1/100>=1) {
            System.out.println("sayi uc basamaklidir");
        } else if (sayi1/100<1 && sayi1/10>=1) {
            System.out.println("sayi iki basamaklidir");
        }else
            System.out.println("ikiside degil");

        String durum;
        durum= sayi1/100>=1? "sayi uc basamaklidir" : sayi1/100<1 && sayi1/10>=1? "sayi iki basamaklidir" : "ikiside degil";





    }
}
