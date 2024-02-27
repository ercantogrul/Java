package day33_ProjeTanimi.Proje_1;

import java.io.IOException;
import java.util.Scanner;

public class Islemler extends FileHelper implements IslemlerInterface {

    @Override
    public Adres veriEkle() throws IOException {
        Scanner scanner = new Scanner(System.in);
        int idNo = ++Runner.sonID;
        System.out.print("Ad soyad giriniz : ");
        Scanner scan = new Scanner(System.in);
        String adSoyad = scan.nextLine();
        String telefon ;
        long tel=0;
        int a =0;
        do {
            System.out.println("Telefon Numarasi giriniz :");
            telefon = scan.next();
            if (telefon.substring(0,3).contains("+49") && telefon.length()>11 || telefon.length()<14) {
                System.out.println("Telefon numarasi kabul edilmistir");
                tel = Long.parseLong(telefon);
                break;
            }else {
                System.out.println("Telefon numarasi +49 ile baslanmali ve 14 rakamdan az olmalidir.");
            }
            a++;
        }while (a<3);

        System.out.println("Adres giriniz :");
        scanner = new Scanner(System.in);
        String adres = scanner.nextLine();

        String str;
        String eMail="";
        int secim=0;
        do {
            System.out.println("Email giriniz :");
            scan = new Scanner(System.in);
            str = scan.nextLine();
            char ilkHarf = str.charAt(0);
            if ((ilkHarf>='a' && ilkHarf<='z') && str.contains("@") && str.contains(".com") && str.indexOf("@")<str.indexOf(".com")){
                System.out.println("eMail kabul edilmistir ");
                eMail=str;break;
            }else {
                System.out.println("Ilk karakter kucuk harf olmali ayrica @ ve.com icermemelidir");
            }
            secim++;
        }while (secim<3 );

        boolean statu = true;
        Adres bilgiler = new Adres(idNo,adSoyad,tel,adres,eMail,statu);
        Runner.rehberListe.add(bilgiler);
        System.out.println("rehber listesi :"+ Runner.rehberListe);

        dosyayaYaz(Runner.rehberListe);
        return bilgiler;
    }

    @Override
    public void veriSil() throws IOException {
        Scanner scanner = new Scanner(System.in);
        aktifVeriListe();
        System.out.print("\nHangi ID nolu veriyi silmek istiyorsunuz? \nSecim....: ");
        int secilenID = scanner.nextInt();
        if (Runner.rehberListe.size()>0){
            for (int i = 0; i < Runner.rehberListe.size(); i++) {
                if (secilenID==Runner.rehberListe.get(i).getID()){
                    Runner.rehberListe.get(i).setStatu(false);
                    Runner.kaydiSilinenListe.add(Runner.rehberListe.get(i));
                    Runner.rehberListe.remove(Runner.rehberListe.get(i));
                    dosyayaYaz(Runner.rehberListe);
                }
            }
        }else {
            System.out.println("Rehber liste bos, silinecek veri yok");
        }
        dosyayaYaz(Runner.rehberListe);
    }

    @Override
    public void veriDegistir() throws IOException {
        Scanner scanner = new Scanner(System.in);
        aktifVeriListe();
        System.out.print("\nHangi ID nolu veriyi degistirmek istiyorsunuz? \nSecim....:  ");

        if (Runner.rehberListe.size()>0){
            int secilenID = scanner.nextInt();
            for (int i = 0; i < Runner.rehberListe.size(); i++) {
                if (secilenID==Runner.rehberListe.get(i).getID()) {
                    System.out.println("Ad soyad degistirmek icin :1 \nTelefon Dgiestirmek icin  :2 \n" +
                            "eMail Degistirmek icin    :3 \nAdres Degistirmek icin    :4  \nCikis icin\t\t\t\t  :5  \nSecim...:");
                    String sec = scanner.next();
                    switch (sec){
                        case "1" : adsoyadDegistir(secilenID);break;
                        case "2" : telefonDegistir(secilenID);break;
                        case "3" : eMailDegistir(secilenID);break;
                        case "4" : adresDegistir(secilenID);break;
                        case "5" : System.out.println("Cikis yaptiniz");break;
                        default:
                            System.out.println("Hatali giris tekrar deneyiniz");
                    }
                }
            }
        }else {
            System.out.println("Rehber liste bos, silinecek veri yok");
        }
        dosyayaYaz(Runner.rehberListe);
        System.out.println(Runner.rehberListe);
    }

    private void adresDegistir(int secilenID) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < Runner.rehberListe.size(); i++) {
            if (secilenID == Runner.rehberListe.get(i).getID()) {
                System.out.println("Yeni adres giriniz");
                String adres =scanner.nextLine();
                Runner.rehberListe.get(i).seteMail(adres);
                dosyayaYaz(Runner.rehberListe);
            }
        }

    }
    private void eMailDegistir(int secilenID) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < Runner.rehberListe.size(); i++) {
            if (secilenID == Runner.rehberListe.get(i).getID()) {
                System.out.println("Yeni eMail giriniz");
                String eMail =scanner.nextLine();
                Runner.rehberListe.get(i).seteMail(eMail);
                dosyayaYaz(Runner.rehberListe);
            }
        }
    }
    private void telefonDegistir(int secilenID) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < Runner.rehberListe.size(); i++) {
            if (secilenID == Runner.rehberListe.get(i).getID()) {
                System.out.println("Yeni telefon giriniz");
                long telefon =scanner.nextLong();
                Runner.rehberListe.get(i).setAdSoyad(String.valueOf(telefon));
                dosyayaYaz(Runner.rehberListe);
            }
        }
    }
    private void adsoyadDegistir(int secilenID ) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < Runner.rehberListe.size(); i++) {
            if (secilenID == Runner.rehberListe.get(i).getID()) {
                System.out.println("Yeni Ad Soyad giriniz");
                String adSoyad =scanner.nextLine();
                Runner.rehberListe.get(i).setAdSoyad(adSoyad);
                dosyayaYaz(Runner.rehberListe);
            }
        }
    }
    @Override
    public void veriListele() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nAktif veri listesi icin\t\t :1 \nPasif olan veri listesi icin :2 \nCikis icin :y  \nSeciminiz....:");
        String sec = scanner.next();
        switch (sec){
            case "1" : aktifVeriListe();break;
            case "2" : pasifVeriListe();break;
            case "y" : System.out.println("Cikis yaptiniz");break;
            default:System.out.println("hatalı seçim tekrar deneyiniz ");
        }
    }

    private void pasifVeriListe() {
        // verileri ekrana yaz ama durum  = true olanları
        String line = String.format("%5s","  No ");
        line  = line + String.format("%11s"," ID ");
        line  = line + String.format("%25s","Ad Soyad");
        line  = line + String.format("%25s","Telefon");
        line  = line + String.format("%25s","eMail");
        line  = line + String.format("%30s","Adress");
        System.out.println(line);
        line = String.format("%5s","-----");
        line  = line + String.format("%11s","-----");
        line  = line + String.format("%25s","------------");
        line  = line + String.format("%25s","------------");
        line  = line + String.format("%25s","------------");
        line  = line + String.format("%30s","------------");
        System.out.println(line);
        for (int j = 0; j < Runner.kaydiSilinenListe.size(); j++) {
            System.out.println("No:"+(j+1)+ Runner.kaydiSilinenListe.get(j));
        }
    }

    private void aktifVeriListe() {
        // verileri ekrana yaz ama durum  = true olanları
        String line = String.format("%5s","  No ");
        line  = line + String.format("%11s"," ID ");
        line  = line + String.format("%25s","Ad Soyad");
        line  = line + String.format("%25s","Telefon");
        line  = line + String.format("%25s","eMail");
        line  = line + String.format("%35s","Adress");
        System.out.println(line);
        line = String.format("%5s","-----");
        line  = line + String.format("%11s","-----");
        line  = line + String.format("%25s","------------");
        line  = line + String.format("%25s","------------");
        line  = line + String.format("%25s","------------");
        line  = line + String.format("%35s","------------");
        System.out.println(line);
        for (int i = 0; i < Runner.rehberListe.size() ; i++) {
            System.out.println("No:"+(i+1)+ Runner.rehberListe.get(i));
        }
    }


}
