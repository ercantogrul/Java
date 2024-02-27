package day07_StringManuplation.DE07_StringManuplation_ilk.tasks;

import java.util.Scanner;

public class Task14_ {
    public static void main(String[] args) {
        /*
         /* Harflerden oluşan bir stringin içindeki tüm "a" leri, "e" ve
        tüm "e" leri "a" yapınız
         */

        Scanner scan = new Scanner(System.in);   // Germany Deutschland
        System.out.println("bir veri giriniz");
        String str1 = scan.nextLine();

        String str2 = str1.replaceAll("a","*");
        System.out.println(str2);
        String str3 = str2.replaceAll("e","a");
        System.out.println(str3);

        String str4 = str2.replace("*","e");  // replaceAll  replace arasindaki fark
        System.out.println(str4);

        // replace i her seyle replaceAll ise belli karakterlerle calisir.










    }
}
