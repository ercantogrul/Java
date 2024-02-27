package day08_Loops.DE08_Loops_ilk.L02_WhileLoops.Tasks;

import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        // task-> girilen şifrenin asagidaki sartlari kontrol edin
        // ve kullaniciya duzeltmesi gereken tum eksikleri soyleyin,
        // eger tum sartlari saglarsa, "sifre basariyla kaydedildi" print edin
        // - ilk harf kucuk harf olmali
        // - son karakter rakam olmali
        // - sifre bosluk icermemeli
        // - uzunlugu en az 10 karakter olmali
        // abcde12345

        Scanner oku = new Scanner(System.in);

        /*
        for (int i = 1; i <3 ; i++) {
            System.out.println(i +" . sifre demesi");
            String gsifre = oku.nextLine();
            if (sifre.equals(gsifre)) {
                System.out.println("sifre dogru");break;
            }else
                System.out.println("ilk harf kucuk harf olmali");
                System.out.println("son karakter rakam olmali");
                System.out.println("sifre bosluk icermemeli");
                System.out.println("uzunlugu en az 10 karakter olmali");
         */

                //=========================================================
             System.out.println("sifre giriniz");
             String sifre = "abc123ab12";
             int n = sifre.length();


            int j =1;
            while (j<=3){
                System.out.println(j +" . sifre demesi");
                String girilensifre = oku.nextLine();
                if (sifre.equals(girilensifre)) {
                    System.out.println("sifre dogru");break;
                }else
                    System.out.println("ilk harf kucuk harf olmali");
                    System.out.println("son karakter rakam olmali");
                    System.out.println("sifre bosluk icermemeli");
                    System.out.println("uzunlugu en az 10 karakter olmali");

                j++;
            }







    }
}
