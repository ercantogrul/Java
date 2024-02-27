package day04_OperatorsAndMahtClass.DE03_OperatorsAndMathClass_ilk.tasks;

import java.util.Scanner;

public class Task05__ {

    /*
    Task->
     * Girilen saati  saniyeye çeviren program yazınız
     * Örnek : 1 saat 10 dakika 50 saniye - > 4250 saniye
     * 1 saat = 3600 saniye
     * 1 dk   = 60 saniye
     *
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("saat giriniz :");
        int saat =scan.nextInt();
        System.out.println("dakika giriniz :");
        int dk =scan.nextInt();
        System.out.println("saniye giriniz giriniz :");
        int sn =scan.nextInt();

        System.out.println("toplam ="+ ((saat*3600)+(dk*60)+(sn))+" saniye yapar");










    }

}



























