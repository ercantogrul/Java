package day26_Exception.j26_Exceptions.Tasks.Task04___;

import java.util.Scanner;
import static day26_Exception.j26_Exceptions.Tasks.Task04___.Ogrenci.ogrenciList;
import static day26_Exception.j26_Exceptions.Tasks.Task04___.Okul.okulList;


public class OkulMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Okul okul1 = new Okul();
        System.out.print("Okul adi giriniz : ");
        okul1.setOkulAd(scan.nextLine());
        System.out.print("Ogrenci kontenjanı giriniz : ");
        okul1.setMaxOgrSayisi(scan.nextInt());

        for (int i = 0; i < okul1.getMaxOgrSayisi(); i++) {
            Ogrenci ogrenci1 = new Ogrenci();
            ogrenciEkleMethodu(i,ogrenci1,okul1);

            scan.nextLine(); //dummy scan
            System.out.print(i+1 + ".Ogrenci ad : ");
            ogrenci1.setAd(scan.nextLine());
            System.out.print(i+1 + ".Ogrenci soyad : ");
            ogrenci1.setSoyad(scan.nextLine());

            while (true) {
                try {
                    System.out.print(i+1 + ".Ogrenci yas : ");
                    ogrenci1.setYas(scan.nextInt());
                    if (ogrenci1.getYas() < 8 || ogrenci1.getYas() > 15)
                        throw new Exception();
                    else break;
                } catch (Exception e) {
                    System.out.println("Ogrenci yasi 8 ile 15 arasında olmalıdır. Tekrar giriniz.");
                    break;//AHAN DA TRICK....bu komut olmazsa code sonsuz loop ...
                }
            }
            Ogrenci ogrenci = new Ogrenci(ogrenci1.getAd(), ogrenci1.getSoyad(), ogrenci1.getYas());
            ogrenciList.add(ogrenci);
        }
        Okul okul = new Okul(okul1.getOkulAd(), okul1.getMaxOgrSayisi(), ogrenciList);
        okulList.add(okul);

        System.out.println(okulList.toString()); // okul listini, içindeki ogrenci listi ile beraber yazdırır.
    }

    private static void ogrenciEkleMethodu(int i, Ogrenci ogrenci1, Okul okul1) {
        Scanner scan = new Scanner(System.in);
        scan.nextLine(); //dummy scan
        System.out.print(i+1 + ".Ogrenci ad : ");
        ogrenci1.setAd(scan.nextLine());
        System.out.print(i+1 + ".Ogrenci soyad : ");
        ogrenci1.setSoyad(scan.nextLine());
        System.out.print(i+1 + ".Ogrenci yas : ");
        ogrenci1.setYas(scan.nextInt());

    }

}
