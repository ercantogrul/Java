package day05_ifStatementTrernaryOperators.DE05_IfStatementTernaryOperators_ilk;

import java.util.Scanner;

public class C02_if_ElseElfstatements {
    public static void main(String[] args) {

        // Soru 4- Kullanicidan bir karakter girmesini isteyin,
        //         girilen karakterin buyuk harf olup olmadigini yazdirin.


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz");
        char girilenKarakter = scanner.next().charAt(0);
        // kullanici ne kadar uzun kelime veya kelimeler girse de ilk karakteri alir

        if (girilenKarakter >= 'A' && girilenKarakter<='Z'){
            System.out.println("Girilen karakter buyuk harf");
        }else{
            System.out.println("Girilen karakter buyuk harf degil");
        }


        // Kullanicidan bir tam sayi isteyin
        // Sayi 3' e bolunuyorsa 3'un kati
        // sayi 5'e bolunuyorsa 5'in kati
        // ikisine birden bolunuyorsa super sayi
        // ikisine de bolunmuyorsa yaramaz sayi yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz");
        int girilenSayi = scan.nextInt();

        if (girilenSayi%3==0 && girilenSayi%5==0) System.out.println("super sayi");
        else if (girilenSayi % 5 == 0) System.out.println("5'in kati");
        else if (girilenSayi % 3 == 0) System.out.println("3'un kati");
        else System.out.println("Yaramaz sayi");

        //============================================================
        // Ogrenciden notunu isteyin ve harf olarak basari notunu yazdirin
        //Ogrencinin notu 85 ve ustu ise AA,
        //(85 ve ustu  degilse) 65 ve ustu ise BB,
        //(65 ve ustu  de degilse) 50 ve ustu ise CC,
        //(geriye kalanlar) DD
        /*
            Bir if - else if - else.... statement else ile bitmek zorunda degildir
            else ile biten kodlar, her durum icin mutlaka bir sonuc uretirler
            else ile bitmezse tum durumlari kapsamaz
            yani bazi degerler icin sonuc uretmeyebilir
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen notunuzu giriniz");
        double not = input.nextDouble();

        if (not>=85) {
            System.out.println("AA");
        } else if (not>=65) {
            System.out.println("BB");
        }else if(not>=50){
            System.out.println("CC");
        }else{
            System.out.println("DD");
        }




    }
}
