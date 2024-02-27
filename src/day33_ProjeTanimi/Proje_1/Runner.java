package day33_ProjeTanimi.Proje_1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Runner {
    static  int sonID =0;
    static ArrayList<Adres> rehberListe = new ArrayList<>();
    static ArrayList<Adres> kaydiSilinenListe = new ArrayList<>();
    public static void main(String[] args) throws IOException {

        FileHelper obj = new FileHelper();
        obj.dosyadanOku();

        Islemler islemler = new Islemler();
        String secim="";
        Scanner scanner = new Scanner(System.in);
        do {
            menu();
            secim = scanner.next();
            switch (secim) {
                case "1" : islemler.veriEkle(); break;
                case "2" : islemler.veriSil(); break;
                case "3" : islemler.veriDegistir(); break;
                case "4" : islemler.veriListele(); break;
                case "x" : System.out.println("Cikis yaptiniz");break;
                default:
                    System.out.println("hatalı seçim tekrar deneyiniz ");
            }
        } while (!secim.equalsIgnoreCase("x"));
        System.out.println("Program sonlandı ");

    }
    private static void menu() {
        System.out.println("\nREHBER LISTESI ISLEM MENÜSÜ");
        System.out.println(" 1 : Veri Ekle" );
        System.out.println(" 2 : Veri sil" );
        System.out.println(" 3 : Veri Degistir" );
        System.out.println(" 4 : Veri Listele" );
        System.out.println(" x : Çıkış " );
        System.out.print("Seciminiz .... : ");
    }
}
