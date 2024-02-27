package Faruk_hoca_yeni_ilk5gun.DE07zIlk7dersDegerlendirmeSorulari.Level_3;

public class Q03 {
    public static void main(String[] args) {
        //  dd/MM/yyyy formatında string olarak iki tarih verisini okutun,
        //  2. tarih daha ileri bir tarih olsun
        //  2. tarih ile birinci tarih arasında kaç gün fark vardır
        //  ( yıllar 365, aylar 30 gün olarak hesaplanacak)
        // dd/MM/yyyy formatında string olarak iki tarih verisini okutun,
        // hangi tarih daha eski ekrana yazdırın.
        String tarih1 = "11/12/2022";
        String tarih2 = "01/01/2023";
        // 730 + (-60) + (-9)

        int slash1 = tarih1.indexOf("/");
        int slash2 = tarih1.lastIndexOf("/");
        int gun1 = Integer.parseInt(tarih1.substring(0,slash1));
        int ay1  = Integer.parseInt(tarih1.substring(slash1+1,slash2));
        int yil1 = Integer.parseInt(tarih1.substring(slash2+1));

        slash1 = tarih2.indexOf("/");
        slash2 = tarih2.lastIndexOf("/");
        int gun2 = Integer.parseInt(tarih2.substring(0,slash1));
        int ay2  = Integer.parseInt(tarih2.substring(slash1+1,slash2));
        int yil2 = Integer.parseInt(tarih2.substring(slash2+1));

        int gunFarki = (yil2-yil1)*365+(ay2-ay1)*30+(gun2-gun1);
        System.out.println(gunFarki);
        System.out.println((yil2-yil1)*365+(ay2-ay1)*30+(gun2-gun1));

    }
}
