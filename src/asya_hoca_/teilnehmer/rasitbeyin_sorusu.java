package asya_hoca_.teilnehmer;

import java.util.Scanner;

public class rasitbeyin_sorusu {
    public static void main(String[] args) {
         /*1. Ögrencinin 0 ile 100 arasinda aldigi nota göre yil sonu notunu hesapliyoruz.

- Proje ödevine katilmadiysa notlari dikkate alinmaz ve ögrenim yilini tekrarlamasi gerekir.
- (yil sonu notu icin vize 40%, final %60 etkiye sahiptir.)

-Proje ödevini teslim etmis ve gecerli not almisa sa;
-100>=notOrt.>=90 = AA
-90>notOrt.>=80 = BB
-80>notOrt.>=70 = CC
-70>notOrt.>=60 = DD
-60>notOrt. = FF
-Proje ödevini teslim etmis ama gecerli not alinamamis sa, sinav notlarinin degerlendirmeye alinmasi icin projesindeki eksikleri 10 gün icinde tamamlamalidir.*/

        Scanner scan = new Scanner(System.in);
        System.out.println("proje odevi teslim ettimi?");
        String pOdevi = scan.next();
        System.out.println("proje odevi gecerli mi?");
        String pNotu = scan.next();
        System.out.println("vize notu giriniz");
        int vize = scan.nextInt();
        System.out.println("finalNotu giriniz");
        int finalN = scan.nextInt();
        int notOrt ;
        notOrt = (int) (vize*0.4 + finalN*0.6);

        if (pOdevi.equalsIgnoreCase("evet") && pNotu.equalsIgnoreCase("evet") ) {
            System.out.println("notlariniz hesaplanacak");
            if (notOrt>=90) {
                System.out.println("AA");
            } else if (notOrt>=80 ) {
                System.out.println("BB");
            } else if (notOrt>=70 ) {
                System.out.println("CC");
            } else if (notOrt>=60) {
                System.out.println("DD");
            } else if (notOrt<60 ) {
                System.out.println("FF");
            } else System.out.println("hatali not girdiniz");
        } else if (pOdevi.equalsIgnoreCase("evet") && pNotu.equalsIgnoreCase("hayir")) {
            System.out.println( "sinav notlarinin degerlendirmeye alinmasi icin projesindeki eksikleri 10 gün icinde tamamla");
        }else System.out.println("ögrenim yilini tekrarlamasi gerekir");








    }
}
