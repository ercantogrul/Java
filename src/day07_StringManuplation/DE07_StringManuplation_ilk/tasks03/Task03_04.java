package day07_StringManuplation.DE07_StringManuplation_ilk.tasks03;

import java.util.Scanner;

public class Task03_04 {
    public static void main(String[] args) {
        // verilen String de ki rakamlar haricindeki karekter sayısını yazdırınız

        Scanner scan = new Scanner(System.in);
        System.out.println("bir veri giriniz: ");
        String str1 = scan.nextLine();
        str1 = str1.replaceAll("[0-9]","");                // rakkamlar silindi

        System.out.println(str1.replaceAll("[0-9]","").length());


    }
}
