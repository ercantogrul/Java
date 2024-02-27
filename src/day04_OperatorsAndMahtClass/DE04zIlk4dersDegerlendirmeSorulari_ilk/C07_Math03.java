package day04_OperatorsAndMahtClass.DE04zIlk4dersDegerlendirmeSorulari_ilk;

import java.util.Scanner;

public class C07_Math03 {
    public static void main(String[] args) {

        // verilen 3 double sayıdan ortanca olanı ekrana yazdırın
        // enBuyuk , enKucuk , Toplamı
        // toplamdan (en buyuk ve en kucuğu) cıkartın
        // tek satırda yazın

        Scanner scan = new Scanner(System.in);
        System.out.println("ekrana double birinci sayiyi giriniz");
        double d1 = scan.nextDouble();
        System.out.println("ekrana double birinci sayiyi giriniz");
        double d2 = scan.nextDouble();
        System.out.println("ekrana double birinci sayiyi giriniz");
        double d3 = scan.nextDouble();

        double enBd1d2 = Math.max(d1,d2);
        double enB = Math.max(enBd1d2,d3);  //

        double toplam = d1+d2+d3;   //

        double enKd1d2 = Math.min(d1,d2);
        double enK = Math.min(enKd1d2,d3);  //

        System.out.println("enB : "+ enB);
        System.out.println("enK : "+ enK);
        System.out.println("ortanca : "+ (toplam-(enB+enK)));

    }
}
