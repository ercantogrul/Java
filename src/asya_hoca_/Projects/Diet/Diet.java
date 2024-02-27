package asya_hoca_.Projects.Diet;

import java.util.Scanner;

public class Diet {
    String ad;
    int yas;
    int kilo;
    char cinsiyet;
    double hareketSeviyesi;
    double boy;
    double vucutKitleIndeks;
    double BMH;
    double kalori;

    @Override
    public String toString() {
        return "Diet{" +
                "ad='" + ad + '\'' +
                ", yas=" + yas +
                ", kilo=" + kilo +
                ", cinsiyet=" + cinsiyet +
                ", hareketSeviyesi=" + hareketSeviyesi +
                ", boy=" + boy +
                ", vucutKitleIndeks=" + vucutKitleIndeks +
                ", BMH=" + BMH +
                ", kalori=" + kalori +
                '}';
    }
    public Diet(String ad, int yas, int kilo, char cinsiyet, double hareketSeviyesi, double boy) {
        this.ad = ad;
        this.yas = yas;
        this.kilo = kilo;
        this.cinsiyet = cinsiyet;
        this.hareketSeviyesi = hareketSeviyesi;
        this.boy = boy;
    }

    public static void main(String[] args) {
        Diet kisi;
        System.out.println("Diyetisyene hoş geldiniz");
        kisi=bilgiAlma();  // parametreye "kisi"  yi ekleseydik bilgi alma methodunda int, String gibi veri türünü tanimlamak zorunda olmazdik
        System.out.println(kisi);

        //kitleIndexMetodu(kisi); // parametre ye "kisi" eklendi
        //bazalMetobolizmaMethodu(kisi);
        kaloriMethodu(kisi);






    }

    public static void kaloriMethodu(Diet kisi) {
        kitleIndexMetodu(kisi);
        bazalMetobolizmaMethodu(kisi);
        /*
         *** Zayif ve normaller icin ***
         1) BMI < 25 ise = Bazal Metabolizma Hizi * Hareket Seviyesi (alması gereken kalori)
         */
        if (kisi.vucutKitleIndeks <= 25) {
            System.out.println("Gayet sagliksiniz");
            kisi.kalori =kisi.BMH*kisi.hareketSeviyesi;

        }else {
            // A = Bazal Metabolizma Hizi * Haretet Seviyesi - 500
            double a=kisi.BMH*kisi.hareketSeviyesi-500;
            kisi.kalori = Math.max(kisi.BMH, a); // hangisi büyükse onu alalim

        }
        System.out.println("Zayıflamak için kisi günlük olarak \"Bazal metabolizma\" hizindan dusuk kalori alamaz.");
        System.out.println("Almaniz gereken kalori miktari :"+kisi.kalori);




    }

    public static void bazalMetobolizmaMethodu(Diet kisi) {

        if (kisi.cinsiyet=='E'){
            kisi.BMH=((10*kisi.kilo) + (6.25)-(5*kisi.yas)+5);
        }else {
            kisi.BMH= ((10*kisi.kilo) + (6.25*kisi.boy)-(5*kisi.yas)-161);
        }
        System.out.println("Bazal metobolizma hiziniz : "+kisi.BMH);
    }

    public static void kitleIndexMetodu(Diet kisi) {
        //kilo/(boy*boy)  --- boy "metre" cinsinden hesaplamaya dahil edilecek
        kisi.boy =kisi.boy/100; //boy metreye cevrildi
        kisi.vucutKitleIndeks=kisi.kilo/(kisi.boy*kisi.boy);
        System.out.println("Sayin "+kisi.ad+ " Vüvut kitle Indeksiniz : "+kisi.vucutKitleIndeks);

    }

    public static Diet bilgiAlma() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Adınızı girin:");
        String ad=scanner.next();
        System.out.println("Cinsiyetinizi giriniz: K veya E olarak giriniz");
        char cinsiyet=scanner.next().charAt(0);

        System.out.println("Boyunuzu santim olarak giriniz:Örneğin 180 cm");
        int boy=scanner.nextInt();
        System.out.println("Yaşınızı girin:");
        int yas= scanner.nextInt();
        System.out.println("Kilonunuzu giriniz");
        int kilo= scanner.nextInt();
        System.out.println("Hareket seviyenizi seçini:");
        System.out.println("*** Hareket / Aktivite seviyeleri ***\n" +
                "\n" +
                "    1 - Masa basi is / cak az - Hareketsiz  = 1.2\n" +
                "    2 - Az Aktif / haftada 1-2 egzersiz     = 1.3\n" +
                "    3 - Orta Aktif / haftada 3-5 egzersiz   = 1.55\n" +
                "    4 - Cok aktif / haftada 6-7agir egzersiz= 1.7\n" +
                "    5 - Cok agir egzesiz agir is            = 1.9");
        int hareketSecim= scanner.nextInt();
        double hareketSeviyesi=hareketSeviyesiMethodu(hareketSecim);
        Diet kisi=new Diet(ad,yas,kilo, cinsiyet, hareketSeviyesi,boy);

        return kisi;
    }

    public static double hareketSeviyesiMethodu(int hareketSecim) {
        double hareketSeviye=0;
        switch (hareketSecim){
            case 1: hareketSeviye=1.2;break;
            case 2: hareketSeviye=1.3;break;
            case 3:hareketSeviye=1.55;break;
            case 4:hareketSeviye=1.7;break;
            case 5:hareketSeviye=1.9;break;
            default:
                System.out.println("Hatalı giriş yaptınız");

        }
        return hareketSeviye;
    }


}
