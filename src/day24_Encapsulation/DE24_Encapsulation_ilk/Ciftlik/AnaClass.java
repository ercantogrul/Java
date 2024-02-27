package day24_Encapsulation.DE24_Encapsulation_ilk.Ciftlik;

import java.util.Scanner;

public class AnaClass {
    public static void main(String[] args) {
        Ciflik hyv;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print("cins  : ");
            String cins = scanner.next();
            System.out.print("yas   : ");
            int yas = scanner.nextInt();
            System.out.print("atak sayısı:");
            int ayakS = scanner.nextInt();
            hyv = new Ciflik(cins, yas, ayakS);
            if (!hyv.isBasari())
                System.out.println("ayak sayısı yanlış tekrar girin");
        } while (!hyv.isBasari());
        System.out.println(hyv);
    }
}
