package day08_Loops.DE08_Loops.L01_ForLoops.Tasks;

import java.util.Scanner;

public class Task26 {
    public static void main(String[] args) {
        //task -> verilen bir long tam sayinin rakamlari toplamini print eden code create ediniz


        Scanner input = new Scanner(System.in);

        System.out.print("bizim oolann bi sayi gir bakennn : ");
        long sayi = input.nextLong();
        // 1.yol
        String str = ""+sayi;
        int toplam=0;
        for (int i = 0; i <str.length() ; i++) {
            int rakam = Integer.parseInt(str.substring(i,i+1));
            toplam += rakam;
            System.out.printf("%2d",rakam);
        }
        System.out.println("\n"+sayi+" nin Rakamları Toplamı="+toplam);

        //2.yol , 67841
        toplam=0;
        long sayi2=sayi;
        for (int i = 0; 0 <sayi2 ; i++) {
            int rakam = (int) (sayi2%10);
            toplam += rakam;
            sayi2 = sayi2/10;
        }
        System.out.println("\n"+sayi+" nin Rakamları Toplamı="+toplam);
    }
}
