package day05_ifStatementTrernaryOperators.DE05_IfStatementTernaryOperators_ilk.tasks_iklhali;

import java.util.Scanner;

public class task17__tas_kagit_makas {
    public static void main(String[] args) {

         /*
        Task-> taş- kağıt -makas oyununu simüle eden code create ediniz
         */

        Scanner scan = new Scanner(System.in);
        System.out.println(" ilk isareti giriniz : ");
        String str = scan.next();

        System.out.println(" ikinci isareti alin : ");
        int sayi = (int) (Math.random()*3);
        System.out.println(sayi);
        boolean tas = sayi==0;
        boolean kagit = sayi==1;
        boolean makas = sayi==2;

        if (str.equalsIgnoreCase("tas") && sayi==1 ) System.out.println("bilgisayar kazanir");
        if (str.equalsIgnoreCase("tas") && sayi==2 ) System.out.println("kullanici kazanir");
        if (str.equalsIgnoreCase("kagit") && sayi==0 ) System.out.println("kullanici kazanir");
        if (str.equalsIgnoreCase("kagit") && sayi==2 ) System.out.println("bilgisayar kazanir");
        if (str.equalsIgnoreCase("makas") && sayi==0 ) System.out.println("bilgisayar kazanir");
        if (str.equalsIgnoreCase("makas") && sayi==1 ) System.out.println("kullanici kazanir");
        else
            System.out.println("tekrar deneyin");









    }
}
