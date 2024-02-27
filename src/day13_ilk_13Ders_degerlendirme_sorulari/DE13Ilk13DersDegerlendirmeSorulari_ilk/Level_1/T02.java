package day13_ilk_13Ders_degerlendirme_sorulari.DE13Ilk13DersDegerlendirmeSorulari_ilk.Level_1;

import java.util.Scanner;

public class T02 {
    public static void main(String[] args) {
        // rastgele 1 ile 20 arasında 100 adet sayı üretin ve en büyüğünü dizi kullanmadan bulun

        Scanner scan = new Scanner(System.in);
        System.out.println("1 ile 20 arasında 100 adet sayı üretin");

        int enB=0;
        int girilenSyai ;

        for (int i = 0; i < 100; i++) {
            System.out.println(i+" . sayi");
            girilenSyai= (int) (Math.random()*20+1);

            System.out.print(girilenSyai+",");

            if (enB<girilenSyai) enB=girilenSyai;

        }
        System.out.println();
        System.out.println("girilen en büyük sayi : "+enB);




    }
}
