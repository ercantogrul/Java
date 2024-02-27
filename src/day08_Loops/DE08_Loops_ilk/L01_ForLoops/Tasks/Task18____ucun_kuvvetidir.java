package day08_Loops.DE08_Loops_ilk.L01_ForLoops.Tasks;

import java.util.Scanner;

public class Task18____ucun_kuvvetidir {

    /*
    task-> Girilen bir tamsayının  3 üssü olup olmadığınıkontrol eden code create ediniz.
        Örnek 1:
        Girdi: 27
        Çıktı: true
        Açıklama: 3*3*3 =27
        Sonuç= true

        Örnek 2:
        Girdi: 0
        Çıktı: false
        Örnek 3:
        Girdi: 9
        Çıktı: true
        Açıklama: 3*3 = 9
        Sonuç= true

        Örnek 4:
        Girdi: 45
        Çıktı:: false
        Açıklama: 3*3*3*3 =81
        Sonuç= false
        45, 3ün üssü (kuvveti) değildir.
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int sayi = input.nextInt(); //27
        int uck =1;
        boolean ucunkuvvetidir=false;

        for (int i = 1; uck <= sayi; i++) {
            uck=uck*3;
            if (uck==sayi) {
                ucunkuvvetidir = true;
                break;
            }
        }
        if (sayi==1)ucunkuvvetidir=true;  // tüm sayilarin sifirinci kuvveti 1 dir

        if (ucunkuvvetidir) System.out.println("uc un kuvvetidir: ");
        else System.out.println("ucun kuvveti degildir");


        //=======================================================
        System.out.println("=================ikinci yöntem=======================");

        int sayac =0;
        for (int i = 0; i < sayi; i++) {
            if (Math.pow(3,i)==sayi){
                sayac++;
            }
        }
        if (sayac>0) System.out.println("3'ün kuvvetidir");
        else System.out.println("3'ün kuvveti degildir");















    }
}
