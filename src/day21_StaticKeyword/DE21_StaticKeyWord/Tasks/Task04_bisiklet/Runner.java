package day21_StaticKeyword.DE21_StaticKeyWord.Tasks.Task04_bisiklet;

import java.util.Scanner;

public class Runner {
    /*
    Task 04->
     Bisiklet Class :Properties(fields) : hiz, vites
     method  :hizdegistir(int yeniHiz), vitesArtir()-> 1 değer vites artırıyor,
     vitesAzalt() -> 1 deger vites azaltıyor, durumGoster -> O andaki hızı ve vitesi gösteriyor
     vites 5 den büyük ve 1 den küçük olamaz.
     yukarıdaki methodları seçtirilen islemYap methodu ile Runner class'da obj ile methodları çalıştırınız
    Trick -> Kullanıcıya metodlarla iligli bir menü veriniz.
     */



    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Bisiklet bisiklet = new  Bisiklet();
        bisiklet.hiz=0;
        bisiklet.vites=1;

        int secim =0;
        do {
            System.out.println("Bisiklet kontrol panelinden yapacaginiz islemi seciniz : ");
            System.out.println("1- Yeni hiz giriniz \n2- Vites Yükselt \n3- Vites Azalt \n4- Durum Göster \n5- Cikis yapiniz" );
            secim =scan.nextInt();
            switch (secim){
                case  1 : {
                            System.out.println("Yeni hiz giriniz ");
                            bisiklet.hiz = scan.nextInt();
                            System.out.println("Yeni hiziniz : " + bisiklet.hiz);break;
                }
                case  2 :   bisiklet.vitesArttir(); break;
                case  3 :   bisiklet.vitesAzalt(); break;
                case  4 :   bisiklet.durumGoster(); break;
                case  5 :   System.out.println("cikis yapiniz"); break;
            }

        }while (secim!=5);





    }










}
