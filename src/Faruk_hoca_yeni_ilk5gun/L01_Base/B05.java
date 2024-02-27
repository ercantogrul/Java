package Faruk_hoca_yeni_ilk5gun.L01_Base;

import java.util.Scanner;

public class B05 {
    public static void main(String[] args) {
        /* Scanner class yardımı ile klavyeden bir metin giriniz
        Örnek metinler
        "ali taş"
        "ece"
        "36.cadde 25.sokak no:42"
        "Hasan Yanal"
        tüm çözümlerinizi yukarıdaki örnek metinler ile test edin */

        Scanner scan = new Scanner(System.in);
        System.out.println("metin giriniz:");
        String str = scan.nextLine();
        //1) Bu metin içerisinde boşluk var ise kaçıncı indextedir ekrana yazdırın
        int uzunluk = str.length();
        int bosluksuzU = str.replace(" ","").length();
        int bsayisi = uzunluk-bosluksuzU;
        System.out.println("bosluk sayisi : "+(uzunluk-bosluksuzU));
        int birinciB = str.indexOf(" ");
        int ikinciB = str.lastIndexOf(" ");

        if(str.contains(" ")){
            if (bsayisi>1){
                System.out.println("birinciB "+birinciB+" ve ikinci bosluk "+ikinciB+" . indextedir.");
            }else System.out.println("birinciB "+birinciB+" . indextedir.");
        }else System.out.println("bosluk yoktur ");


        //2) Bu metin içerisinde 3.index deki karekteri (tabi varsa) ekrana yazdırın
        if (uzunluk>=2) {
            System.out.println(str.charAt(2));
        }else System.out.println("metin uc karakterden azdir :");

        //3) Bu metnin, ilk 3 Karekterini ekrana yazdırın (substring)
        System.out.println("metnin ilk uc karakteri :" +str.substring(0,1)+str.substring(1,2)+str.substring(2,3));
        System.out.println("metnin ilk uc karakteri :" +str.charAt(0)+str.charAt(1)+str.charAt(2));

        //4) Bu metin son 2 karekteri "al" ise ekrana "bingo" yazdırın (substring kullanın)
        String sonIKik = str.substring(uzunluk-2);
        if (sonIKik.toLowerCase().equalsIgnoreCase("al")) {
            System.out.println("bingo");
        }else System.out.println("nicht bingo");

        //5) Bu metin son 2 karekteri "al" ise ekrana "bingo2" yazdırın (endsWith kullanın)
        if (str.toLowerCase().endsWith("al")) {
            System.out.println("bingo");
        }else System.out.println("nicht bingo");

        //6) Bu metnin uzunluğunu ekrana yazdırın
        System.out.println("metnin uzunlugu : "+str.length());

        //7) Bu metin içerisindeki tüm "a" ları "*" yapın ve ekrana yazdırın
        System.out.println(str.toLowerCase().replaceAll("a","*"));

        //8) Bu metin içerisindeki tüm rakamları silin ve ekrana yazdırın
        System.out.println("tüm rakkamlar haric : "+ str.replaceAll("[0-9]",""));

        //9) Bu metin içerisindeki kaç adet harf vardır(a..z , A..Z) ekrana yazdırın
        int harfsizU = str.replaceAll("[a-zA-Z]","").length();
        System.out.println(str.length()-harfsizU +" adet harf vardir");


    }
}
