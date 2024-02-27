package asya_hoca_.asya_hoca_30_10;

import java.util.Scanner;

public class s1_rakkamlar_toplami {
    public static void main(String[] args) {
        // girilen sayının basamaklarındaki rakamların toplamını bulunuz.
        //1453 ---1+4+5+3= 13

        Scanner input = new Scanner(System.in);
        System.out.println("lutfen sayi  giriniz: ");
        int sayi = input.nextInt();
        int toplam =0;

        while (sayi>0){
            int rakam =sayi%10;
            sayi = sayi/10;
            toplam =toplam+rakam;


        }
        System.out.println(toplam);


    }
}
