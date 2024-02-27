package day06_SwitchCase.DE06_SwitchCase_ilk.tasks;

import java.util.Scanner;

public class Task02__ {
    public static void main(String[] args) {

        // Task-> Girilen güne  göre 100 gün sonraki hangi günü print eden code create ediniz.
        //  hafta başlangıcı:pazartesi alınız
        Scanner scan = new Scanner(System.in);
        System.out.println("Pazartesi 0.gün olarak kabul sarti ile haftanin hangi günündesiniz");
        int gun = scan.nextInt();
        System.out.println("kac gün sonra: ");
        int sayi = scan.nextInt();

        int sayi1 = (gun+sayi) % 7;

            switch (sayi1) {
                case 0 : System.out.println(sayi+("gün sonraki hangi gün:  pazartesi")); break;
                case 1 : System.out.println (sayi+ (" gün sonraki  gün:  sali")); break;
                case 2 : System.out.println(sayi+ (" gün sonraki  gün:  carsamba")); break;
                case 3 : System.out.println(sayi+ (" gün sonraki  gün:  persembe")); break;
                case 4 : System.out.println(sayi+ (" gün sonraki  gün:  cuma")); break;
                case 5 : System.out.println(sayi+ (" gün sonraki  gün:  cumartesi")); break;
                case 6 : System.out.println(sayi+ (" gün sonraki  gün:  pazar")); break;
                default:
                    System.out.println("hatali bilgi girdiniz");

            }





    }
}

