package Faruk_hoca_yeni_ilk5gun.DE07zIlk7dersDegerlendirmeSorulari_meine_lösung.Level_2;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
        /*
        "Bir web sitesi alışveriş sepet toplamı 500TL den fazla olan siparişler için kargo bedeli almıyor ,
        450 tl nin altı için 50 Tl kargo bedeli alıyor ama  alış veriş 450-500 arası ise 500 e tamamlanıyor
        Alış veriş bedeli girildiğinde, kargo dahil toplam ödenecek tutarı ekrana yazdıran proğram"
        Önnekler    input : 540 , output 540
                    input : 480 , output 500
                    input : 420 , output 470
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("yapilan siparis ücreti : ");
        int uUcret = scan.nextInt();
        int kUcreti = 0;

        if (uUcret>500){
            System.out.println("Toplam ödenen ücret: "+ (uUcret));

        } else if (uUcret<450) {
            System.out.println("toplam ödenen ücret :"+ (uUcret+50));

        } else if (uUcret>450 && uUcret<500) {
            System.out.println("Toplam ödenen ücret: "+(uUcret+500-uUcret));

        }else System.out.println("hatali giris yaptiniz");


    }
}
