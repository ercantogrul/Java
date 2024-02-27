package Faruk_hoca_yeni_ilk5gun.DE07zIlk7dersDegerlendirmeSorulari_meine_lösung.Level_1;

import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {
        // Klavyeden isim ve soyisim tek variable olarak okunuyor giriliyor
        // isim ve soy ismi alt alta yazdırınız

        Scanner scan = new Scanner(System.in);
        System.out.println("isim ve soyisminizi giriniz: ");
        String str = scan.nextLine();
        int bosluk = str.indexOf(" ");
        System.out.println(str.substring(0,bosluk)+"\n"+str.substring(bosluk+1));

        // bu soruda ad soy adi buyuk harfle yazdirmak

        System.out.println(str.substring(0,1).toUpperCase()+str.substring(1,bosluk).toLowerCase());
        System.out.println(str.substring(bosluk+1).toLowerCase()+str.substring(bosluk+2).toLowerCase());


    }
}
