package day07_StringManuplation.DE07_StringManuplation.tasks;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        // Task->  Girilen  bir stringde boşluk karakterinin olup olmadığını kontrol eden code create ediniz
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir string giriniz = "); // Java ogren
        String text = scan.nextLine();
        String arananMetin = " ";
        System.out.println(text.contains(arananMetin)); // textin içinde aranan metin var mı?

        // veya
        if (text.contains(arananMetin)) System.out.println("vardır");
        else System.out.println("yoktur");

        // 2.yol
        if (text.length() == text.replace(" ","").length()) System.out.println("boşluk yoktur");
        else System.out.println("bosluk vardır");

        // 3.yol
        if (text.indexOf(" ")==-1) System.out.println("boşluk yoktur");
        else System.out.println("bosluk vardır");



    }
}

