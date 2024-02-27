package day05_ifStatementTrernaryOperators.DE05_IfStatementTernaryOperators_ilk.tasks_iklhali;

import java.util.Scanner;

public class Task09 {

    public static void main(String[] args) {
        /*
        Task01
           girilen bir sayının negatif ve pozitifliğini kontrol eden code create ediniz..
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayi giriniz: ");
        int s1 = scan.nextInt();
        if (s1 < 0) {
            System.out.println("negativ");
        }
        if (s1 > 0) {
            System.out.println("pozitiv");
        }
        String kontrol = s1<= 0? "negativ" : "pozitiv";
        System.out.println(kontrol);


    }
}
