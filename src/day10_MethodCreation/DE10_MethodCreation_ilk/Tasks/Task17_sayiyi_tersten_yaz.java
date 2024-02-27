package day10_MethodCreation.DE10_MethodCreation_ilk.Tasks;

import java.util.Scanner;

public class Task17_sayiyi_tersten_yaz {
    public static void main(String[] args) {
        /*
            Task-> girilen bir tamsayıyı  tersinden print eden METHOD create ediniz
            input:1453
            output:3541

         */
        Scanner scan = new Scanner(System.in);
        System.out.println("bir tamsayi giriniz");
        int sayi = scan.nextInt();
        String str =sayi+"";

        String sonuc = sayiyiTerstenPrint(str);
        System.out.println(sonuc);

    }

    private static String sayiyiTerstenPrint(String str) {
        String yeni ="";
        for (int i = str.length()-1; i >=0 ; i--) {
            yeni = yeni + str.charAt(i);
        }
        str = yeni;
        return str;
    }

}

