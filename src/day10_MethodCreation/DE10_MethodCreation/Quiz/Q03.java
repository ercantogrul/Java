package day10_MethodCreation.DE10_MethodCreation.Quiz;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        ekrandan okuttuğunuz bir string, her bir karekterinin ascII karşılıklarını,
        toplatıp yazdırın. char ın ascıı rakam karşılığı metot ta hesaplansın.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir metin giriniz: "); // adana
        String str = scan.nextLine();

        asciiKarsiligiTopla(str);

    }

    private static void asciiKarsiligiTopla(String str) {

        int toplamAscii =0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            toplamAscii += ch;
        }
        System.out.println(toplamAscii);

    }


}
