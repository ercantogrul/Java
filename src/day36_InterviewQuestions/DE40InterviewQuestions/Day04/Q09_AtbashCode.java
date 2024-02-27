package day36_InterviewQuestions.DE40InterviewQuestions.Day04;

import java.util.Scanner;

public class Q09_AtbashCode {
    /*
      AtbashCode ; bir metni şifrelemek veya şifresini çözmek için İbrani alfabesine temelli basit bir yöntemdir.
      Alfabenin ilk harfi son harfi yerine kullanilmaktadir..
      "abcdefghijklmnopqrstuvwxyz"; 26 harf
      "zyxwvutsrqponmlkjihgfedcba";
      atry
      zgib
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("sifrelenecek ifadeyi giriniz :");

        String ifade = scan.nextLine().toLowerCase();
        // şifrele
        String yeniIfade = sifre(ifade);
        System.out.println(yeniIfade);
        // şifre çöz
        yeniIfade = sifre(yeniIfade);
        System.out.println(yeniIfade);
        /*
         "abcdefghijklmnopqrstuvwxyz"; 26 harf
         "zyxwvutsrqponmlkjihgfedcba";
         cdz
         */
    }
    private static String sifre(String ifade){
        String yeniIfade="";
        for (int i = 0; i <ifade.length() ; i++) {
            int fark = 'z'-ifade.charAt(i);
            yeniIfade += (char)('a'+fark);

        }
        return yeniIfade;
    }


}