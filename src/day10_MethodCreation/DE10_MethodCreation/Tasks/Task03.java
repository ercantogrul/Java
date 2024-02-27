package day10_MethodCreation.DE10_MethodCreation.Tasks;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        //task-> girilen Saati saniyeye mil'i km'ye kg'yi gr'a çeviren METHOD create ediniz.


        Scanner input = new Scanner(System.in);
        System.out.print("Dönüştüreceğiniz birimi giriniz : ");
        String birim = input.nextLine().toLowerCase();//saat mil kg cinsi

        System.out.print("Dönüştüreceginiz birimin mikatrını giriniz : ");
        double miktar = input.nextDouble();//saat mil km miktarı
        cevir(birim,miktar);

        String sonuc = Task03.cevir2(birim,miktar);
        System.out.println(sonuc);

    }//main sonu

    private static String cevir2(String birim, double miktar) {
        String str="";
        switch (birim) {
            case "kg"   : str = miktar+"kg = "+(miktar*1000)+" gramdır"; break;
            case "saat" : str = (int)miktar+"saat = "+(int)(miktar*3600)+" saniyedir"; break;
            case "mil"  : str = miktar+"mil = "+(miktar*1.61)+" kilometredir"; break;

        }
        return str.toUpperCase();
    }

    private static void cevir(String birim, double miktar) {
        switch (birim) {
            case "kg"   : gram_hesapla(miktar); break;
            case "saat" : saniye_hesapla(miktar); break;
            case "mil"  : km_hesapla(miktar); break;
        }
    }

    private static void km_hesapla(double miktar) {
        System.out.println(miktar+"mil = "+(miktar*1.61)+" kilometredir");
    }

    private static void saniye_hesapla(double miktar) {
        System.out.println((int)miktar+"saat = "+(int)(miktar*3600)+" saniyedir");
    }

    private static void gram_hesapla(double miktar) {
        System.out.println(miktar+"kg = "+(miktar*1000)+" gramdır");
        boolean bb = example(15,7);
        System.out.println(example(7,44));

    }

    private static boolean example(int a,int b){

        return a>b;
    }

}
