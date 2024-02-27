package day10_MethodCreation.DE10_MethodCreation_ilk.Tasks;

import java.util.Scanner;

public class Task09_saat_saniye {

    public static void main(String[] args) {

    /*
   Task->  Saati saniyeye çeviren  method create ediniz


    */
        Scanner input = new Scanner(System.in);
        System.out.print("lütfen saniyeye cevirmek istediginiz saat dilimini giriniz : ");
        String str1 = input.nextLine().toLowerCase();//14.25

        String saniye = saatSaniye(str1);
        System.out.println("verilen saat dilimi :"+saniye+ " saniye dir");

    }
    private static String saatSaniye(String str) {
        int saat = Integer.parseInt(str.substring(0,2))*3600;
        int dakika = Integer.parseInt(str.substring(3))*60;
        str= saat+dakika+"";
        return str;
    }


}
