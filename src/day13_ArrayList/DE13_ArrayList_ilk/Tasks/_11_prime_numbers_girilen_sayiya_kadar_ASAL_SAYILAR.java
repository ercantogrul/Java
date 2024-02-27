package day13_ArrayList.DE13_ArrayList_ilk.Tasks;

import java.util.ArrayList;
import java.util.Scanner;

public class _11_prime_numbers_girilen_sayiya_kadar_ASAL_SAYILAR {

    /*
    negatif olmayan bir n sayısı girin ve bu sayıya kadar olan kaç asal sayı var ise yazdırın.

        Örnek 1:
        n = 20

        cevap: 8      ==   (2,3,5,7,11,13,17,19)  20 ye kadar 8 adet asal sayı vardır.
        Örnek2:
        Input(Girdi): 10
        Output(Çıktı): 4
        Explanation(Açıklama): 10'dan küçük 4 adet asal sayı vardır. (2,3,5,7)
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("negatif olmayan bir sayi giriniz");
        int girilenSayi = scan.nextInt();

        ArrayList<Integer> list = new ArrayList<>();

        sayiyaKadarOlanAsalSayilar(girilenSayi,list);

    }
    private static void sayiyaKadarOlanAsalSayilar(int girilenSayi, ArrayList<Integer> list) {
        int counter =0;
        for (int i = 2; i < girilenSayi; i++) {
            boolean asal=true; //int sayac =1;

            for (int j = 2; j< i; j++) {
                if (i % j == 0) {
                    asal =false; //sayac=0;
                    break;
                }
            }
            if (asal){  //asal==true----sayac==1
                list.add(i);
                counter++;
            }
        }
        System.out.println(list);
        System.out.println("counter : "+counter);

    }


}





