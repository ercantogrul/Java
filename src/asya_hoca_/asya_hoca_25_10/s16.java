package asya_hoca_.asya_hoca_25_10;

public class s16 {
    public static void main(String[] args) {
        /*
         Girilen bir sayı kadar satır ve sütünu olan ve
        sağ kenara dayalı üçgeni basan kodu yazınız.
                Ekran Çıktısı
        Bir sayi giriniz: 5
                *
          **
         ***
        ****
       *****

         */

        for (int i = 0; i < 5; i++) {
            for (int j = 4; j>=i ; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


















    }
}
