package asya_hoca_.asya_hoca_25_10;

import java.util.Scanner;

public class s12__continue {
    public static void main(String[] args) {
        /*
    // break ve continue sadece içinde bulunduğu döngüyü etkiler.
    Program, bir loop içerisinde continue komutu ile karşılaşılırsa, ondan sonraki komutları
    atlar ve loop’un bir sonraki değerinden devam eder.
     */
        // Girilen bir stringin harflerini teker teker ekrana alt alta olacak
        // sekilde yazdiriniz, bosluk veya a harfi geldiginde bunlari yazmasin

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen girmek istediginiz sayi adedini giriniz");
        String str = "merhaba dunya";
        int n = str.length();
        String harf="";

        for (int i = 0; i < n; i++) {
            harf =""+str.charAt(i);
            if (harf.equals(" ") || harf.equals("a")){
                continue;
            }else System.out.println(harf);

        }

        //============================ikinci yöntem  ========
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen metin giriniz : ");
        String str1 = scanner.nextLine();

        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            if (ch == 'a' || ch == ' ') {
                continue;
            }
            System.out.println(ch);
        }

















    }
}
