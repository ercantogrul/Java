package asya_hoca_.asya_hoca_25_10;

import java.util.Scanner;

public class s13_asal_sayi {
    public static void main(String[] args) {
        /*

        Task->
                Girilen sayının asal olup olmadığını kontrol eden code create ediniz.
                For Loop
        */


        Scanner input = new Scanner(System.in);
        System.out.println("lutfen sayi  giriniz: ");
        int sayi = input.nextInt();
        int sayac=0;

        int counter = 0;
        for (int i = 1; i <= sayi; i++) {
            if (sayi % i == 0) {
                counter++;}
        }
        if (counter > 2) {
            System.out.println("Asal sayi degildir");
        } else {
            System.out.println("Asaldir");
        }
        //========================================================

            if (sayi==1||sayi==0){
            System.out.println("girilen sayi asal dagildir");
        }else
        {
            for (int i = 2; i<sayi ; i++) {
                if(sayi%i==0) {
                    sayac++;
                }
            }
        }
        if(sayac==0){
            System.out.println("sayi asaldir : ");
        }else System.out.println("sayi asal degildir :");


        //==================ikinci yöntem=========================
        boolean flag = true;
        for (int i = 2; i <sayi; i++) {
            if (sayi%i==0){
                System.out.println("Asal degildir.");
                flag=false;
                break;
            }
        }

        if (flag){
            System.out.println("Asaldir");
        }










        }
    }

























