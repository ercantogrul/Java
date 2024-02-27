package day07_StringManuplation.DE07_StringManuplation_ilk;

import java.util.Scanner;

public class C15_Practice___ {
    public static void main(String[] args) {
        /*
        Task->  girilen bir password için aşagıdaki şartları sağlarsa "gayet başarılı DEWAMKEEE :)"
        sağlamazsa "Çok başarısız :( agam yeni paaword giresen" print eden code create ediniz.
        1-en az 8 karakter uzunlugunda,
        2-ilk harf buyuk,
        3-son harf kucuk,
        4-boşluk içermemeli
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("sifrenizi giriniz: ");
        String str1 = scan.nextLine();

        boolean b1 = str1.length() >= 8;
        boolean b2 = Character.isUpperCase(str1.charAt(0));
        boolean b3 = Character.isLetter(str1.length() - 1);
        boolean b4 = str1.contains(" ");

        boolean sonuc = b1 && b2 && b3;

        String durum = b1 && b2 && b3 ? (b4? "fals":"true"  )   : "false";
        System.out.println(durum);


    }


}
