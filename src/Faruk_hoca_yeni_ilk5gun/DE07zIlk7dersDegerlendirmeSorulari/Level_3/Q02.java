package Faruk_hoca_yeni_ilk5gun.DE07zIlk7dersDegerlendirmeSorulari.Level_3;

public class Q02 {
    public static void main(String[] args) {
        // dd/MM/yyyy formatında string olarak iki tarih verisini okutun,
        // hangi tarih daha eski ekrana yazdırın.
        String tarih1 = "10/12/2022";
        String tarih2 = "10/12/2022";

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

        if (yil2>yil1) System.out.println("tarih 2 ileri tarihtir");
        else {
            if (yil2<yil1) System.out.println("tarih 1 ileri tarihtir");
            else {
                if (ay2>ay1) System.out.println("tarih 2 ileri tarihtir");
                else {
                    if (ay2<ay1) System.out.println("tarih 1 ileri tarihtir");
                    else {
                        if ( gun2>gun1) System.out.println("tarih 2 ileri tarihtir");
                        else if (gun2<gun1) System.out.println("tarih 1 ileri tarihtir");
                        else System.out.println("aynı tarihtir");
                    }
                }
            }
        }



    }
}
