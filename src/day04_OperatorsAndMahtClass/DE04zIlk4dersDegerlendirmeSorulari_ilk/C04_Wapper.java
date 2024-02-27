package day04_OperatorsAndMahtClass.DE04zIlk4dersDegerlendirmeSorulari_ilk;

import java.util.Scanner;

public class C04_Wapper {
    public static void main(String[] args) {
        // Klavyeden girilen biri int, diğeri double, iki sayıdan büyük olanını Wapper
        // class kullanarak ekrana yazdırınız

        Scanner scan = new Scanner(System.in);
        System.out.println("int bir sayi giriniz");
        int sayi1 = scan.nextInt();


        System.out.println("double bir sayi giriniz");
        double dd = scan.nextDouble();


        System.out.println("en Buyuk sayi: "+ Math.max(sayi1,dd));

        //System.out.println(Double.max(s1,d1));



    }
}
