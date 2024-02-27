package asya_hoca_.sorular20_09;

import java.util.Scanner;

public class s9_barkod_olusturma {
    public static void main(String[] args) {
        /* Barkod oluşturma:
        Kullanıcıdan alınan ürün isim ve markasını girip iki
        basmaklı rondom bir sayı ile birleştirerek barkod numarası oluşturun
        Örn:
            ürünadı=makarna
            markası=poli
            random =23
            çıktı barkod : mapo23
            */

        Scanner scan =new Scanner(System.in);
        System.out.print("almak istediginiz ürün adini giriniz: ");
        String uismi = scan.nextLine();
        System.out.print("ürünün markasini giriniz: ");
        String marka = scan.nextLine();
        System.out.println("random bir sayi üretin");
        int rand = (int) (Math.random()*90+10);
        System.out.println("   ");
        String barklod =uismi+"\n"+marka+"\n"+rand;
        String barkod = uismi.substring(0,2)+marka.substring(0,2)+rand;

        System.out.println(uismi+"\n"+marka+"\n"+rand+"\n"+"cikti barkod :"+barkod);








    }
}
