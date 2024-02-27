package Faruk_hoca_yeni_ilk5gun.DE05_IfStatementTernaryOperators.DE05_IfStatementTernaryOperators.tasks;

import java.util.Scanner;

public class _20_ticket_price {

    public static void main(String[] args) {

        /* Task->
        Trafik cezasının değerini hesaplayın code create ediniz
45 hız sınırıdır.

Eğer hızınız 55-74 arasında ise:
Ceza 100 $'dır.

Eğer hızınız 75 - 84 arasında ise:
Ceza 150 $'dır.

Eğer hızınız 85 -94 arasında ise:
Ceza 320 $'dır.

Eğer hızınız 94'den daha fazla ise:
Ceza 500 $'dır.

ve ayrıca,
Eğer sürücünün ehliyeti yoksa cezaya 200 $ eklenir.

Örn: Hızınız 77 iken cezanız 150$'dır ama ehliyetiniz yoksa ceza 350 $ olur.


-----------------------------------------


Örn;

currentSpeed(Hızınız) 87
ve isDriverLicenceAvailable(Ehliyeti var mı?) = true;

sonuç 320 olmalıdır.

currentSpeed(Hızınız) 65
ve isDriverLicenceAvailable(Ehliyeti var mı?) = false;

sonuç 300 olmalıdır.  */

        Scanner scan = new Scanner(System.in);

        int hiz = scan.nextInt();

        boolean isDriverLicenceAvailable = scan.nextBoolean();

//Kodu aşağıya yazınız. BU SATIRIN YUKARISINI DEĞİŞTİRMEYİNİZ.
        int ceza = isDriverLicenceAvailable ? 0 : 200;
        int ceza2=ceza;
        int ceza3;
        ceza = hiz>94? ceza+500 : hiz>85 ? ceza+320 : hiz>75 ? ceza+150 : hiz>55? ceza+100:ceza;

        System.out.println("ceza : " + ceza + " dolardır");

        // cozum2
        if (hiz>94) ceza2+=500;
        else if (hiz>85) ceza2+=320;
        else if (hiz>75) ceza2+=150;
        else if (hiz>55) ceza2+=100;
        System.out.println("ceza2 : " + ceza2 + " dolardır");

        // cozum3
        if (hiz>94) ceza3=500;
        else if (hiz>85) ceza3=320;
        else if (hiz>75) ceza3=150;
        else if (hiz>55) ceza3=100;
        else ceza3=0;
        // ehliyet cezasını da ekleyelim
        ceza3 = isDriverLicenceAvailable ? ceza3 : ceza3+200;

        System.out.println("ceza3 : " + ceza3 + " dolardır");



    }
}


