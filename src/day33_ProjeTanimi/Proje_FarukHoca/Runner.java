package day33_ProjeTanimi.Proje_FarukHoca;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Runner {
    public static Map<Integer, Kisiler> liste = new HashMap<>();
    static int adresSonID = 0;

    public static void main(String[] args) {
        // dosyan veriyi oku listeye al
        IslemKisiler.veriOku(); // aldık

         menu();



    }

    public static void menu() {
        IslemKisiler.veriOku(); // aldık

        String secim = "";
        do {
            System.out.println("""
                    ==========MÜSTERI EKLEME MODÜLÜNE HOSGELDINIZ===========
                    1. Veri Ekleme
                    2. Veri Silme
                    3. Veri Degistirme
                    4. Veri Listeleme
                    5. Silinmis Verileri Listeleme
                    X. Ana Menü""");
            Scanner scanner = new Scanner(System.in);
            secim = scanner.next();

            switch (secim) {
                case "1": IslemKisiler.veriAdd();break;
                case "2": IslemKisiler.veriDelete();break;
                case "3": IslemKisiler.veriUpdate();break;
                case "4": IslemKisiler.veriList();break;
                case "5": IslemKisiler.veriListSilinmisler();break;
                case "x", "X": break;
                default:
                    System.out.println("Hatali giris yaptiniz. Tekrar giris yapiniz:");
                    break;
            }

        } while (!secim.equalsIgnoreCase("x"));


    }
}
