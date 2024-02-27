package day05_ifStatementTrernaryOperators.DE05_IfStatementTernaryOperators_ilk.tasks_iklhali;

import java.util.Scanner;

public class Task13__t {

    public static void main(String[] args) {
        /*
          TASK -> girilen iki sayiyi seçilen dört işlemden birine uygulayıp sonucu print eden code crate ediniz

         */
        Scanner scan = new Scanner(System.in);
        System.out.println(" iki sayi giriniz : ");
        int s1 = scan.nextInt();
        int s2 = scan.nextInt();
        System.out.println("istediginiz islem turunu giriniz (+,-,*,/)");
        char islem = scan.next().charAt(0);

        if (islem=='+') System.out.println("Toplam= " +(s1+s2));
        if (islem=='-') System.out.println("Toplam= " +(s1-s2));
        if (islem=='*') System.out.println("Toplam= " +(s1*s2));
        if (islem=='/') System.out.println("Toplam= " +(s1/s2));
        //==Ternary======







    }
}
