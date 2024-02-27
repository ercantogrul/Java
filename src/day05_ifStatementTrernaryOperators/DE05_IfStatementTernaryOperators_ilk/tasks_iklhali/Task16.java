package day05_ifStatementTrernaryOperators.DE05_IfStatementTernaryOperators_ilk.tasks_iklhali;

import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        /* Task->
         Girilen bir sayı için

		 Eger sayi pozitif ise; 10dan buyuk olup olmadigini kontrol edin
		 Eger 10 dan buyuk ise "Buyuksun!" yazdirin
		 Eger 10 dan kucuk ise "Normalsin!" yazdirin

		 Eger sayi pozitif degil ise; -10dan buyuk olup olmadigini kontrol edin
		 Eger -10 dan buyuk ise "Negatifsin!" yazdirin
		 Eger -10 dan kucuk ise "Cok Negatifsin!" yazdirin

         */
        Scanner scan = new Scanner(System.in);
        System.out.println(" bir sayi giriniz : ");
        int s1 = scan.nextInt();

        if ( s1 > 0 && s1>10) {
            System.out.println("buyuksun");
        } else if ( s1>0 && s1<10) {
            System.out.println("Normalsin");
        }
        if (s1<0 && s1>-10) {
            System.out.println("Negativsin");}
        if (s1<0 && s1<-10) {
            System.out.println("Cok Negativsin");
        }
        String durum = s1>0 && s1>10? "Buyuksun" : s1>0 && s1<10? "Normalsin" :s1<0 && s1>-10? "Negativsin" : s1<0 && s1<-10? "Cok Negativsin" : "tekrar dene";



    }
}
