package day10_MethodCreation.DE10_MethodCreation_ilk.Tasks;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        //task-> girilen ad ve soyadın ilk harfleri buyuk diğer harflerini küçük print eden METHOD create ediniz
        Scanner input = new Scanner(System.in);
        System.out.print("AGAM adını   giresin : ");
        String  ad = input.nextLine();

        System.out.print("AGAM soyadını   giresin : ");
        String  soyad = input.nextLine();
        ad      = ilkHarfiBuyut(ad);
        soyad   = ilkHarfiBuyut(soyad);
        System.out.println(ad);
        System.out.println(soyad);

    }//main sonu

    private static String ilkHarfiBuyut(String ad) {
        ad = ad.substring(0,1).toUpperCase()+ad.substring(1).toLowerCase();
        return ad;
    }


}
