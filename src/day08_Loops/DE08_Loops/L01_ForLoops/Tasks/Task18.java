package day08_Loops.DE08_Loops.L01_ForLoops.Tasks;

import java.util.Scanner;

public class Task18 {

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
      //  System.out.print("Sayı giriniz: ");
        int sayi = 27;
        int ucKuv=1;
        boolean ucunkuvvetidir=false;// 0
        for (int i = 1; ucKuv <sayi ; i++) {
            ucKuv=ucKuv*3;

            if (ucKuv==sayi) {
                ucunkuvvetidir=true; // +1
            }

        }

        if (sayi==1) ucunkuvvetidir=true; // tüm sayıların sıfırıncı kuvveti 1 dir

//        if (ucunkuvvetidir) System.out.println("3 un kuvvetidir");
//        else System.out.println("ucun kuvveti değildir");
//        if (ucunkuvvetidir) System.out.println("ucun kuvvetidir");
//        if (!ucunkuvvetidir) System.out.println("ucun kuvveti değildir");
         if (ucunkuvvetidir==false) System.out.println("ucun kuvveti değildir");
         else  System.out.println("ucun kuvvetidir");


        //2.yol
        ucKuv=1;
        int sayac  = 0;
        for (int i = 0; i <sayi ; i++) {

            if (Math.pow(3,i)==sayi){
                sayac++;
            }

        }
        if (sayac>0) System.out.println("3 un kuvvetidir");
        else System.out.println("ucun kuvveti değildir");




    }
}
