package asya_hoca_.Projects.KahveMakinasi_yasinHoca;

import java.util.ArrayList;
import java.util.Scanner;


    public class Kahve {
        static Scanner scanner = new Scanner(System.in);
        static ArrayList<String> kahveListesi = new ArrayList<>();
        static String c_RED = "\u001B[31m";
        static String BOLD = "\033[0;1m";
        static String c_PURPLE = "\u001B[35m";
        static String c_GREEN = "\u001B[32m";

        String secim;
        String boy;
        String seker;
        int sekerSayisi;
        String sut;
        String kahveTuru;
        int ucret;
        int sutucreti = 10;
        int bardakOrtaUcreti = 10;
        int bardakBuyukUcreti = 20;
        int odenen = 0;
        int sayac = 0;

        public Kahve() {

        }

        public void secim() {
            do {
                System.out.println("Hangi kahveyi istersiniz?");
                secim = scanner.next();
                switch (secim) {
                    case "1": {
                        System.out.println("Türk kahvesi sectiniz. Kahveniz hazirlaniyor.");
                        ucret = 30;
                        kahveTuru = "Turk kahvesi";break;
                    }
                    case "2": {
                        System.out.println("Latte sectiniz. Kahveniz hazirlaniyor.");
                        ucret = 35;
                        kahveTuru = "Latte";break;
                    }
                    case "3": {
                        System.out.println("Espresso sectiniz. Kahveniz hazirlaniyor.");
                        ucret = 40;
                        kahveTuru = "Espresso";break;
                    }
                    case "4": {
                        System.out.println("Cikis yaptiniz.");break;
                    }
                    default: System.out.println("Hatali giris yaptiniz.Tekrar deneyiniz");break;
                }

            } while (!(secim.equalsIgnoreCase("1") || secim.equalsIgnoreCase("2") ||
                    secim.equalsIgnoreCase("3") || secim.equalsIgnoreCase("4")));
        }

        public void boy() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Hangi boy kahve istiyormusunuz?\nBuyuk=B\nOrta=O\nKucuk=K");
            String boySecimi;
            boySecimi = scanner.next().toLowerCase().substring(0, 1);
            switch (boySecimi) {
                case ("b"): {
                    ucret += bardakBuyukUcreti;
                    boy = "Büyük";
                    break;
                }
                case ("o"): {
                    ucret += bardakOrtaUcreti;
                    boy = "Orta";
                    break;
                }
                case ("k"): {
                    boy = "Kücük";
                    break;
                }
                default: {
                    System.out.println("Yanlis secim yaptiniz.Tekrar seciminizi yapiniz.");
                    boy();
                    break;
                }
            }
        }

        public void sut() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Süt istiyormusunuz?\nEvet ya da Hayir seklinde cevap veriniz");
            String sutSecimi;
            sutSecimi = scanner.next().toLowerCase().substring(0, 1);
            if (sutSecimi.equalsIgnoreCase("e")) {
                ucret = ucret + sutucreti;
                System.out.println("Sutunuz ekleniyor.");
                sut = "sutlu";
            } else if (sutSecimi.equalsIgnoreCase("h")) {
                System.out.println("Sut eklenmiyor.");
                sut = "sutsuz";
            } else sut();

        }

        public Kahve(String secim, String boy, String seker, int sekerSayisi, String sut, String kahveTuru, int ucret, int sutucreti, int bardakOrtaUcreti, int bardakBuyukUcreti, int odenen) {
            this.secim = secim;
            this.boy = boy;
            this.seker = seker;
            this.sekerSayisi = sekerSayisi;
            this.sut = sut;
            this.kahveTuru = kahveTuru;
            this.ucret = ucret;
            this.sutucreti = sutucreti;
            this.bardakOrtaUcreti = bardakOrtaUcreti;
            this.bardakBuyukUcreti = bardakBuyukUcreti;
            this.odenen = odenen;
        }

        public void seker() {
            System.out.println("Seker istermisiniz?");
            String secSeker = scanner.next().toLowerCase().substring(0, 1);
            if (secSeker.equalsIgnoreCase("e")) {
                seker = "sekerli";
                System.out.println("Kac seker istersiniz?");
                sekerSayisi = scanner.nextInt();
                System.out.println(sekerSayisi + " adet sekeriniz ekleniyor");
            } else if (secSeker.equalsIgnoreCase("h")) {
                seker = "sekersiz";
                sekerSayisi = 0;
            } else {
                System.out.println("Yanlis secim yaptiniz.Tekrar seciminizi yapiniz.");
                seker();
            }
        }

        @Override
        public String toString() {
            return "Kahve{" +
                    "secim=" + secim +
                    ", boy='" + boy + '\'' +
                    ", seker='" + seker + '\'' +
                    ", sekerSayisi=" + sekerSayisi +
                    ", sut='" + sut + '\'' +
                    ", kahveTuru='" + kahveTuru + '\'' +
                    ", ucret=" + ucret +
                    '}';
        }

        public void parahesapla() {
            if (sayac == 0) {
                System.out.println(ucret + " toplam ucretinizi odeyiniz");
            }
            odenen += scanner.nextInt();
            int paraustu = odenen - ucret;
            if (odenen < ucret) {
                System.out.println(Math.abs(paraustu) + " TL eksik odediniz.");
                System.out.println(Math.abs(paraustu) + " TL ucretinizi odeyiniz.");
                sayac++;
                parahesapla();
            } else if (odenen >= ucret) {
                System.out.println(paraustu + " TL para ustunuzu aliniz. ");
            } else {
                System.out.println("Yanlis deger girdiniz.");
                parahesapla();
            }
        }
    }
