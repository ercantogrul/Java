package day07_StringManuplation.DE07_StringManuplation_ilk.tasks03;

import java.util.Scanner;

public class Task03_03 {
    public static void main(String[] args) {
        // verilen String de kaç adet rakam vardır yazdırınız

        Scanner scan = new Scanner(System.in);
        System.out.println("bir veri giriniz: ");
        String str1 = scan.nextLine();
        System.out.println(str1);
        String str2 = str1.replaceAll("[0-9]","");
        System.out.println(str2);
        System.out.println("strinde : "+ (str1.length()-str2.length()+" adet rakkam vardir"));




    }
}
