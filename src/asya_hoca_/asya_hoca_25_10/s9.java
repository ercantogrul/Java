package asya_hoca_.asya_hoca_25_10;

import java.util.Scanner;

public class s9 {
    public static void main(String[] args) {
         /*   Kullanıcıdan 1'den büyük bir tam sayı girmesini isteyin
        ve 1'den girilen tam sayıya kadar olan sayıların karelerinin toplamını
        hesaplayan kodu yazın
        Örnek Ekran Çıktısı
        Girilen sayı=4               1 -> 1  2-> 4  3->9
        Kareler toplamı=14
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("birden büyük birtam sayi giriniz");
        int gs = scan.nextInt();
        int toplam =0;

        for (int i = 1; i <gs ; i++) {
            toplam = toplam+i*i;

        }
        System.out.println(toplam);























    }
}
