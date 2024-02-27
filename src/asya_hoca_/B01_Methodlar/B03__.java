package asya_hoca_.B01_Methodlar;

import java.util.Scanner;

public class B03__ {
    public static void main(String[] args) {
         /*
        Verilen yılda hangi yaşta olduğunu belirten method oluşturunuz
        *void ve parametre kullanarak
          age2(2050,1990);
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("hangi yilda oldugunuzu giriniz");
        int yil =scanner.nextInt();
        System.out.println("dogum tarihinizi giriniz");
        int dogTarihi =scanner.nextInt();

        yasHesaplama(yil,dogTarihi);

        int anne= yasHesaplama(2050,1990);
        int cocuk =yasHesaplama(2050,2010);
        int toplam =anne+cocuk;
        System.out.println(toplam);


    }

    private static int yasHesaplama(int yil,int dTar) {

        int yas = yil-dTar;
        System.out.println(yas);
        return yas;

    }

}
