package day13_ilk_13Ders_degerlendirme_sorulari.DE13Ilk13DersDegerlendirmeSorulari_ilk.Level_2;

import java.util.Scanner;

public class T11_sayi_yi_yazi_ile_yazma___ {
    public static void main(String[] args) {
        /*
        klavyeden iki basamaklı bir sayı giriliyor, ekrana yazı ile yazdırın
        input : 27
        output: yirmi yedi
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("iki basamakli bir sayi giriniz");
        int sayi = scan.nextInt();

        int onlarBasamagi= sayi/10;
        String onB = String.valueOf(onlarBasamagi);

        int birlerBasamagi= sayi%10;
        String birB = String.valueOf(birlerBasamagi);


        switch (onB){
            case "1" : onB= "on";break;
            case "2" : onB= "yirmi";break;
            case "3" : onB= "otuz";break;
            case "4" : onB= "kirk";break;
            case "5" : onB= "elli";break;
            case "6" : onB= "atmis";break;
            case "7" : onB= "yetmis";break;
            case "8" : onB= "seksen";break;
            case "9" : onB= "doksan";break;
            default:
                System.out.println("hatali");
        }

        switch (birB){
            case "0" : birB= "";break;
            case "1" : birB= "bir";break;
            case "2" : birB= "iki";break;
            case "3" : birB= "uc";break;
            case "4" : birB= "dort";break;
            case "5" : birB= "bes";break;
            case "6" : birB= "alti";break;
            case "7" : birB= "yedi";break;
            case "8" : birB= "sekiz";break;
            case "9" : birB= "dokuz";break;
            default:
                System.out.println("hatali");
        }
        System.out.println("sayi : "+ onB+" "+birB);



    }
}
