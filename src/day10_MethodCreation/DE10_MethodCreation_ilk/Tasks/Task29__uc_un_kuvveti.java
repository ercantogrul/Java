package day10_MethodCreation.DE10_MethodCreation_ilk.Tasks;

import java.util.Scanner;

public class Task29__uc_un_kuvveti {

    /*
    powerOfThree isminde bir method oluşturun.
        Parametre olarak int
        Return tipi boolean
        Bir tamsayı verildiğinde, 3 üssü olup olmadığını teyit edin. 3'ün üssü(kuvveti) ise true, değilse false döndürün.
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
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir tamsayi giriniz: ");
        int sayi = scan.nextInt();

        boolean sonuc =powerOfThree(sayi);
        System.out.println("sonuc " + sonuc);

    }

    private static boolean powerOfThree(int sayi) {
        boolean ucunkuvvetidir=true;
        int sayac =0;
        for (int i = 0; i < sayi; i++) {
            if (Math.pow(3,i)==sayi){
                sayac++;
            }
        }
        if (sayac>0) {
            ucunkuvvetidir =true;
            System.out.println();
        }
        else
            ucunkuvvetidir =false;
        System.out.println(sayi +" 3ün üssü (kuvveti) değildir");

        return ucunkuvvetidir;
    }


}
