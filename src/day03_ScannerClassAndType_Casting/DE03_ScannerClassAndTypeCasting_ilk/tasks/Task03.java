package day03_ScannerClassAndType_Casting.DE03_ScannerClassAndTypeCasting_ilk.tasks;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        /*
         * TASK->
         *
         * Kullaniciya gunde kac saat uyudugunu sorun,
         * ayda yilda ve 40 yilda kac gununun uykuda gectigini yazdirin
         *
         * Ornek : Input : 8
         *         Output : Ayda 10, yilda 121, 40 yilda 4866 gununuz uykuda geciyor
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("gunde kac saat uyudugununuzu giriniz: ");
        int saat = scan.nextInt();
        System.out.println("ayda: "+ (saat*30/24.0)+", yilda: "+ (saat*365/24)+", 40 yilda: "+ (saat*365*40/24.0)+" gün uykuda geciyor");





    }
}
