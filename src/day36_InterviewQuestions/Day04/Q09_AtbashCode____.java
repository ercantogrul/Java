package day36_InterviewQuestions.Day04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q09_AtbashCode____ {
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
        List<String> sifre = new ArrayList<>((List.of(scan.next().split(""))));

        String str = "abcdefghijklmnopqrstuvwxyz";
        List<String> list = List.of(str.split(""));

        StringBuilder yeniSifre = new StringBuilder();

        for (int i = 0; i < sifre.size(); i++) {
            for (int j = 0; j < str.length(); j++) {
                if (sifre.get(i).equals(list.get(j))) {
                    yeniSifre.append(list.get(str.length()-1 - j));
                }
            }
        }
        System.out.println(yeniSifre.toString());

        //ikinci yol======================

        sifreliMetin();

    }

    private static void sifreliMetin() {
        Scanner scan = new Scanner(System.in);
        System.out.print("sifrelenecek ifadeyi giriniz :");
        String ifade = scan.nextLine();
        String yeniIfade="";

        for (int i = 0; i < ifade.length(); i++) {
            int index = 'z'-ifade.charAt(i);
            yeniIfade+=(char)('a'+index);

        }
        System.out.println(yeniIfade);

    }


}