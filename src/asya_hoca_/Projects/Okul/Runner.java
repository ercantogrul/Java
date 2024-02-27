package asya_hoca_.Projects.Okul;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Runner {
    static Map<Integer, OgrenciKisiler> ogrenciListe = new HashMap<>();
    static Map<Integer, OgretmenKisiler> ogretmenListe = new HashMap<>();
    public static void main(String[] args) {

        menu();



    }
    public static void menu(){

        Scanner scanner = new Scanner(System.in);
        String secim;
        do {
            System.out.println(" ÖĞRENCİ VE ÖĞRETMEN YÖNETİM PANELİ\n" +
                    "    ====================================\n" +
                    "     1- ÖĞRENCİ İŞLEMLERİ\n" +
                    "     2- ÖĞRETMEN İŞLEMLERİ\n" +
                    "     Q- ÇIKIŞ");

            secim = scanner.next().toUpperCase().substring(0,1);
            switch (secim) {
                case "1": Ogrenci.ogrenciIslemleri();    break;
                case "2": Ogretmen.OgretmenIslemleri(); break;
                case "Q": System.out.println("Cikis yaptiniz");break;
                default:
                    System.out.println("Hatali giris yaptiniz. Tekrar giris yapiniz:");break;
            }
        }while (!secim.equalsIgnoreCase("Q"));


    }
}
