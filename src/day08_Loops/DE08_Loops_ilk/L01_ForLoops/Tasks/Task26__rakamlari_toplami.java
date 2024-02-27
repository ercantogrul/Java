package day08_Loops.DE08_Loops_ilk.L01_ForLoops.Tasks;

import java.util.Scanner;

public class Task26__rakamlari_toplami {
    public static void main(String[] args) {
        //task -> verilen bir long tam sayinin rakamlari toplamini print eden code create ediniz


        Scanner input = new Scanner(System.in);

        System.out.println("bizim oolann bi sayi gir bakennn : ");
        long sayi = input.nextLong();
        String s = String.valueOf(sayi);
        System.out.println(s);
        long toplam=0;

        for (int i = 0; i < s.length(); i++) {
            String rakam= s.substring(i,i+1);
            long rk = Long.parseLong(rakam);    //
            toplam= toplam+rk;

        }
        System.out.println(toplam);

        // ikinci yöntem==========================

        toplam=0;
        long sayi2 =sayi;
        for (int i = 0; 0<sayi2 ; i++) {
            int rakam = (int) (sayi2%10);
            toplam+=rakam;
            sayi2=sayi2/10;

        }
        System.out.println("\n"+sayi+"nin rakkamlari toplami= "+ toplam);







    }
}
