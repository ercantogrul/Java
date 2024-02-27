package day05_ifStatementTrernaryOperators.DE05_IfStatementTernaryOperators_ilk.tasks_iklhali;

import java.util.Scanner;

public class Task19 {

    /*
    Çin zodyağı hesaplanırken kişinin doğum yılının 12 ile bölümünde kalana göre bulunur.
    Doğum Tarihi %12 = 0 ➜ Maymun
    Doğum Tarihi %12 = 1 ➜ Horoz
    Doğum Tarihi %12 = 2 ➜ Köpek
    Doğum Tarihi %12 = 3 ➜ Domuz
    Doğum Tarihi %12 = 4 ➜ Fare
    Doğum Tarihi %12 = 5 ➜ Öküz
    Doğum Tarihi %12 = 6 ➜ Kaplan
    Doğum Tarihi %12 = 7 ➜ Tavşan
    Doğum Tarihi %12 = 8 ➜ Ejderha
    Doğum Tarihi %12 = 9 ➜ Yılan
    Doğum Tarihi %12 = 10 ➜ At
    Doğum Tarihi %12 = 11 ➜ Koyun
    */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" dogum yili giriniz : ");
        int yil = scan.nextInt();

        if ( yil %12 == 0) {
            System.out.println("maymun yili");
        } else if (yil % 12 == 1) {
            System.out.println("Horoz yili");
        } else if (yil % 12 == 2) {
            System.out.println("Köpek yili");
        } else if (yil % 12 == 3) {
            System.out.println("Domuz yili");
        }else if (yil % 12 == 4) {
            System.out.println("Fare yili");
        }else if (yil % 12 == 5) {
            System.out.println("Öküz yili");
        }else if (yil % 12 == 6) {
            System.out.println("Kaplan yili");
        }else if (yil % 12 == 7) {
            System.out.println("Tavşan yili");
        }else if (yil % 12 == 8) {
            System.out.println("Ejderha yili");
        }else if (yil % 12 == 9) {
            System.out.println("Yılan yili");
        }else if (yil % 12 == 10) {
            System.out.println("At yili");
        }else if (yil % 12 == 11) {
            System.out.println("Koyun yili");
        }






    }
}
