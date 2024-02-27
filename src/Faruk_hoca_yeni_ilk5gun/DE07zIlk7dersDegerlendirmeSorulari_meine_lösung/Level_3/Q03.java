package Faruk_hoca_yeni_ilk5gun.DE07zIlk7dersDegerlendirmeSorulari_meine_lösung.Level_3;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
        //  dd/MM/yyyy formatında string olarak iki tarih verisini okutun,
        //  2. tarih daha ileri bir tarih olsun
        //  2. tarih ile birinci tarih arasında kaç gün fark vardır
        //  ( yıllar 365, aylar 30 gün olarak hesaplanacak)

        Scanner scan = new Scanner(System.in);
        System.out.print("dd/MM/yyyy formatinda String iki tarih giriniz ");
        String tarih1= scan.nextLine();
        String tarih2= scan.nextLine();

        int t1gun = Integer.parseInt(tarih1.substring(0,2));
        int t1ay = Integer.parseInt(tarih1.substring(3,5));
        int t1yil = Integer.parseInt(tarih1.substring(6));

        int t2gun = Integer.parseInt(tarih2.substring(0,2));
        int t2ay = Integer.parseInt(tarih2.substring(3,5));
        int t2yil = Integer.parseInt(tarih2.substring(6));

        if ( t2yil>t1yil ) {
            int sonuc = ((t2yil-t1yil)*365) + ((t2ay-t1ay)*30) + (t2gun-t1gun);
            System.out.println((t2yil-t1yil)*365 + (t2ay-t1ay)*30 + (t2gun-t1gun));

        }else System.out.println("hatali giris yaptiniz");










    }
}
