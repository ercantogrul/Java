package day07_StringManuplation.DE07_StringManuplation_ilk.tasks;

import java.util.Scanner;

public class Task05___ {
    public static void main(String[] args) {
             /* Task->
        Girilen ad soyad bilgilerinin ilk harflerini buyuk harf print eden code create ediniz..
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("adinizi soyadinizi giriniz");
        String str1 = scan.nextLine();
        String str1SonKisim = str1.substring(1);


        System.out.println("soyadinizi giriniz");
        String str2 = scan.nextLine();
        String str2SonKisim = str2.substring(1);

        System.out.println((Character.toUpperCase(str1.charAt(0))+str1SonKisim)+" "+ (Character.toUpperCase(str2.charAt(0))+str2SonKisim ));


    }
}