package day08_Loops.DE08_Loops_ilk.L01_ForLoops.Tasks;

import java.util.Scanner;

public class Task26_rakkamlarToplami_onemli {
    public static void main(String[] args) {

        // Soru 7- Kullanicidan pozitif bir tamsayi alip, rakamlar toplamini yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Rakamlarini toplamak uzere pozitif bir tamsayi giriniz");
        int girilenSayi = scanner.nextInt();

        int sayi = girilenSayi;  // 1453
        int birlerBasmagi = 0;
        int rakamlarToplami = 0;

        int basamakSayisi = (sayi + "").length(); // 4

        for (int i = 1; i <= basamakSayisi; i++) {

            birlerBasmagi = sayi % 10;
            rakamlarToplami += birlerBasmagi;
            sayi /= 10;
        }

        System.out.println("Girilen " + girilenSayi + " sayisinin rakamlar toplami : " + rakamlarToplami);

    }
}
