package day06_SwitchCase.DE06_SwitchCase_ilk.tasks;

import java.util.Scanner;

public class Task07__charToAscii {
    public static void main(String[] args) {
// Task-> Girilen 3 basamaklı bir sayıyı hardf karakteri ile print eden code create ediniz.

        Scanner scan = new Scanner(System.in);
        System.out.print("sayi giriniz :");
        int sayi = scan.nextInt();
        char hk= (char) sayi;
        System.out.print(sayi+" sayısına karşılık gelen karakter : "+hk);
        int birlerB = sayi%10;
        int onlarB = (sayi/10)%10;
        int yuzlerB = sayi/100;

        switch (yuzlerB) {
            case 0: System.out.print("" );break;
            case 1: System.out.print("yüz " );break;
            case 2: System.out.print("Ikiyüz ");break;
            case 3: System.out.print("Ücyüz ");break;
            case 4: System.out.print("Dörtyüz ");break;
            case 5: System.out.print("Besyüz ");break;
            case 6: System.out.print("Altiyüz ");break;
            case 7: System.out.print("yediyüz ");break;
            case 8: System.out.print("Sekizyüz ");break;
            case 9: System.out.print("Dokuzyüz ");break;
           
        }
        switch (onlarB) {
            case 0: System.out.print(" ");break;
            case 1: System.out.print("on ");break;
            case 2: System.out.print("yirmi ");break;
            case 3: System.out.print("otuz ");break;
            case 4: System.out.print("kirk ");break;
            case 5: System.out.print("elli ");break;
            case 6: System.out.print("altmis ");break;
            case 7: System.out.print("yetmis ");break;
            case 8: System.out.print("seksen ");break;
            case 9: System.out.print("doksan ");break;
        }
        switch (birlerB) {
            case 0: System.out.print("");break;
            case 1: System.out.print("Bir ");break;
            case 2: System.out.print("Iki ");break;
            case 3: System.out.print("Üc ");break;
            case 4: System.out.print("Dört ");break;
            case 5: System.out.print("Bes ");break;
            case 6: System.out.print("Alti ");break;
            case 7: System.out.print("yedi ");break;
            case 8: System.out.print("Sekiz ");break;
            case 9: System.out.print("Dokuz ");break;
        }











    }
}
