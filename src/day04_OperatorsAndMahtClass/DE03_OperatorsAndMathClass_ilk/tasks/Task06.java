package day04_OperatorsAndMahtClass.DE03_OperatorsAndMathClass_ilk.tasks;

import java.util.Scanner;

public class Task06 {

    public static void main(String[] args) {

        /*Task->
         * Kullanicidan uc basamakli bir sayi alin
         * ve sayinin rakamlarini birler,onlar ve yuzler basamagi olarak yazdirin

         * Ornek : Inputs : 853
         * Output : Girdiginiz sayinin birler basamagi : 3
         *          Girdiginiz sayinin onlar basamagi : 5
         *          Girdiginiz sayinin yuzler basamagi : 8

         */
        Scanner scan =new Scanner(System.in);
        System.out.println("Uc basamakli bir sayi giriniz =");
        int sayi = scan.nextInt();
        int birlerB = sayi%10;
        int yuzlerB = sayi/100;
        int onlarB = (sayi-yuzlerB*100)/10;

        System.out.println("birlerB ="+ (birlerB)+", onlarB ="+ (onlarB)+ ", yuzlerB ="+ (yuzlerB));




    }
}
