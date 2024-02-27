package day06_SwitchCase.DE06_SwitchCase_ilk.tasks;

import java.util.Scanner;

public class Task04 {

    public static void main(String[] args) {
		/*
		Task-> Girilen ay simine göre   ayin kac cektigini print eden code create ediniz.
		 */
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir ay numarasi giriniz:");
        String ay = scan.next().toLowerCase();

        switch (ay) {
            case "ocak": System.out.println(31);break;
            case "subat": System.out.println(29);break;
            case "mart": System.out.println(31);break;
            case "nisan": System.out.println(30);break;
            case "mayis": System.out.println(31);break;
            case "haziran": System.out.println(30);break;
            case "temmuz": System.out.println(31);break;
            case "agustos": System.out.println(31);break;
            case "eylul": System.out.println(30);break;
            case "ekim": System.out.println(31);break;
            case "kasim": System.out.println(30);break;
            case "aralik": System.out.println(31);break;
            default:
                System.out.println("yanlis girdiniz");

        }
    }
}