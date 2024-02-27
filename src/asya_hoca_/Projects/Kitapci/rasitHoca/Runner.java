package asya_hoca_.Projects.Kitapci.rasitHoca;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Runner {

    static int BUCHNUMMER = 1000;
    static Map<Integer, Buch> mapBuch = new LinkedHashMap<>();

    public static void main(String[] args) {
        menu();

        }
    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        String wahl ;
        do {
            System.out.println("""
                    Yapmak istediginiz islemi seciniz :\s
                         \t * 1-Kitap ekle
                    \t\t * 2-Numara ile kitap goruntule
                    \t\t * 3-Kitap ismi ile kitap goruntule
                    \t\t * 4-Numara ile kitap sil
                    \t\t * 5-Tum kitaplari listele
                    \t\t * 6-Cikis""");
            System.out.print("Secim : ");
            wahl = scanner.next().substring(0, 1);
            switch (wahl) {
                case "1" -> Rechner.kitapEkle();
                case "2" -> Rechner.numaraIleKitapGoruntule();
                case "3" -> Rechner.kitapAdiIleGoruntule();
                case "4" -> Rechner.kitapSil();
                case "5" -> Rechner.kitapListe();
                case "6" -> System.out.println("Cikis yapiliyor....");

            }

        } while (!wahl.equalsIgnoreCase("6"));
    }
    }

