package asya_hoca_.sorular_19_09;

import java.util.Scanner;

public class s8_iki_defa_sifre_dogrulama {
    public static void main(String[] args) {
        /* Kullanıcıdan içinde boşluk içermeyen bir password girmesini isteyin.
   Girilen passwordu **** şeklinde çıktı alın.
   Ardından tekrar passwordu doğrulamasını isteyin
   Eğer girilen şifreler aynı ise "Pass"
   Değilise "Try Again" yazdırın*/

        System.out.println("Lütfen bosluk icermeyen  bir passWord  giriniz");
        Scanner scanner = new Scanner(System.in);
        String passWord = scanner.next();

        String a= passWord.replaceAll("[^\\s]","*");
        System.out.println(a);

        System.out.println("Lütfen tekrar passWord  giriniz");
        String dogrulama = scanner.next();

        if (passWord.equals(dogrulama))
            System.out.println("Pass");
        else System.out.println("Try Again");

        //=========================for döngüsü ile =======
        String str3= scanner.next();
        int sonDeger = str3.length();
        String yeni = "";

        if (str3.length() == str3.replaceAll(" ", "").length()) {

            for (int i = 1; i <= sonDeger; i++) {
                System.out.print("*");
            }
            System.out.println(yeni);

            System.out.println("Password u tekrar giriniz");
            String strGiris2 = scanner.nextLine();
            if (str3.equals(strGiris2)) {
                System.out.println("dogru giris yaptiniz");
            } else
                System.out.println("tekrar deneyiniz");

        } else System.out.println("Password da bosluk vardir, tekrar giriniz");














    }
}
