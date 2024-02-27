package day33_FileReaderWriter.NotDefteri;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Kayit> liste = new ArrayList<>();
    public static void main(String[] args) throws IOException {

        VeriOkuYaz.verioku();
        String secim="";
        Scanner scanner = new Scanner(System.in);
        do {
            menu();
            secim = scanner.next().substring(0,1).toLowerCase();
            switch (secim) {
                case "1" : veriEkle(); break;
                case "2" : veriSil(); break;
                case "3" : veriListele(); break;
                case "4" : veriGuncelle(); break;
                case "x" : break;
                default:
                    System.out.println("hatalı seçim tekrar şeiniz");
            }

        } while (!secim.equals("x"));
        System.out.println("Program sonlandı ");
    }

    private static void veriGuncelle() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hangi veriyi güncellemek istiyorsunuz?  ");
        System.out.println(liste);
        int idxguncelle = scanner.nextInt();
        VeriOkuYaz.veriyaz();
        System.out.println(liste);
    }


    private static void veriListele() {
        System.out.println("Veri Listesi");
        for (int i = 0; i <liste.size() ; i++) {
            System.out.println(i+"- "+liste.get(i));
        }
    }

    private static void veriSil() throws IOException {
        Scanner scanner = new Scanner(System.in);
        veriListele();
        System.out.print("Hangi veriyi silmek istiyorsunuz?  ");
        int idxSil = scanner.nextInt();
        liste.remove(idxSil);
        VeriOkuYaz.veriyaz();
        System.out.println(liste);



    }

    private static void veriEkle() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("No yu giriniz : ");
        int no = scanner.nextInt();
        System.out.print("Not u giriniz : ");
        String not = scanner.next();
        Kayit kayit = new Kayit(no,not);
        liste.add(kayit);
        VeriOkuYaz.veriyaz();
    }

    private static void menu() {
        System.out.println("\n\n\n ISLEM MENUSU");
        System.out.println(" 1 : veri ekle" );
        System.out.println(" 2 : veri sil" );
        System.out.println(" 3 : verilistele" );
        System.out.println(" 4 : veriGüncelle" );
        System.out.println(" x : Çıkış " );
        System.out.print("Seciminiz .... : ");
    }
}
