package day05_ifStatementTrernaryOperators.DE05_IfStatementTernaryOperators_ilk.tasks_iklhali;

import java.util.Scanner;

public class Task21 {
    public static void main(String[] args) {
        /* 5 sayıdan en küçüğünü (if kullanarak bulunuz )
         */

        Scanner scan = new Scanner(System.in);
        System.out.println(" bes sayi giriniz : ");
        int s1 = scan.nextInt();
        int s2 = scan.nextInt();
        int s3 = scan.nextInt();
        int s4 = scan.nextInt();
        int s5 = scan.nextInt();
        if (s1<s2 && s1<s3 && s1<s4 && s1<s5) {
            System.out.println("enK :" +s1);
        } else if (s2<s1 && s2<s3 && s2<s4 && s2<s5) {
            System.out.println("enK : " + s2);
        }else if (s3<s1 && s3<s2 && s3<s4 && s3<s5) {
            System.out.println("enK : " + s3);
        }else if (s4<s1 && s4<s3 && s4<s2 && s4<s5) {
            System.out.println("enK : " + s4);
        }else if (s5<s1 && s5<s3 && s5<s4 && s5<s2) {
            System.out.println("enK : " + s5);
        }

        int b1 = Math.min(s1,s2);
        int b2 = Math.min(s3,s4);
        int b3 = Math.min(s5,b1);
        int enK = Math.min(b2,b3);
        System.out.println("enBuyuk sayi: "+ enK);


    }
}
