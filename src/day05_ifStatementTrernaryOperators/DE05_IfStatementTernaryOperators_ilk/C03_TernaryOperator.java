package day05_ifStatementTrernaryOperators.DE05_IfStatementTernaryOperators_ilk;

import java.util.Scanner;

public class C03_TernaryOperator {
    public static void main(String[] args) {

          /*
            If else ile yapabilecegimiz
            basit islemleri
            daha kisa olarak yazabilmek icin ternary kullanilir
            (boolean sart?  sart true ise : sart false ise)
         */
        int sayi = 42;
        System.out.println(sayi % 2 == 0 ? "Cift sayi" : "Tek Sayi");
        int i1 = 35;
        int i2 = 53;

        String sonuc = i1>i2 ? "Buyuktur":"kucuktur";
        System.out.println("sonuc = " + sonuc);
        System.out.println("Sonuc2 = " +( i1<i2 ? "Kucuktur":"Buyuktur"));








    }
}
