package projects.BilgisayarProje;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Runner {
    static int ID = 1000;
    static Map<Integer, Islemler> computers = new HashMap<>();

    public static void main(String[] args) {
        satinAlmaMenusu();

    }

    public static void satinAlmaMenusu() {
        String secim = "";
        do {
            System.out.println(RenkFormat.BOLD + RenkFormat.c_BLACK + """
                    =================HOSGELDINIZ=================
                    Hangi model PC almak istiyorsunuz?
                    1. HP
                    2. Apple
                    3. Casper
                    4. Cikis
                    """);
            Scanner scanner = new Scanner(System.in);
            secim = scanner.next();
            switch (secim) {
                case "1":
                    HP.HPIslem();
                    break;
                case "2":
                    Apple.AppleIslem();
                    break;
                case "3":
                    Casper.CasperIslem();
                    break;
                case "4": {
                    System.out.println("Menuden cikis yaptiniz.");
                    System.exit(0);

                }
                default: {
                    System.out.println("Yanlis secim yaptiniz. Tekrar deneyiniz.");
                    break;
                }
            }
        } while (!secim.equals("4"));


    }
}
