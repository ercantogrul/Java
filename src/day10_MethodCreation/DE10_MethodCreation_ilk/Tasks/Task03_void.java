package day10_MethodCreation.DE10_MethodCreation_ilk.Tasks;

import java.util.Scanner;

public class Task03_void {
    public static void main(String[] args) {
        //task-> girilen Saati saniyeye
        // mil'i km'ye
        // kg'yi gr'a çeviren METHOD create ediniz.


        Scanner input = new Scanner(System.in);
        System.out.print("döndüreceginiz birimi giriniz : ");
        String birim = input.nextLine().toLowerCase();//saat mil kg

        System.out.print("döndüreceginiz birimin miktarini giriniz : ");
        double miktar = input.nextDouble();//saat mil km miktarı

        cevir(birim,miktar);
    }
    private static void cevir(String birim, double miktar) {
        switch (birim) {
            case "kg"  : gram_hesaplama(miktar);break;
            case "saat": saniye_hesaplama(miktar);break;
            case "mil" : km_hesaplama(miktar);break;
        }
    }
    private static void km_hesaplama(double miktar) {
        System.out.println(miktar+"mil =" +(miktar*1.61+ "km dir"));
    }
    private static void saniye_hesaplama(double miktar) {
        System.out.println(miktar+"saat =" +(miktar*3600+ "saniyedir"));
    }
    private static void gram_hesaplama(double miktar) {
        System.out.println(miktar+"kg =" +(miktar*1000+ "gramdir"));
    }
    }
