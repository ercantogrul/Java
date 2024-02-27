package Faruk_hoca_yeni_ilk5gun.DE03_ScannerClassAndTypeCasting.tasks;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        /* TASK ->
        Clarusway spor salonu için kullanıcıdan isim soyisim, yaş, kilo, boy, salona devam edeceği ay süresini
        bilgilerini alıp aylık $20 olarak toplam ücretini hesplayıp print eden code create ediniz.
         */
        Scanner scan = new Scanner(System.in);
        Scanner scanNL = new Scanner(System.in);

        System.out.print("Adınızı giriniz : ");
        String adSoyad = scanNL.nextLine();
        System.out.print("Yaşınızı giriniz : ");
        int yas = scan.nextInt();;
        System.out.print("Boyunuzu giriniz :");
        int boy = scan.nextInt();

        System.out.println("Adı : "+adSoyad+", Boyu : "+boy+", Yaşı : "+yas +", Aidatı : 20Euro");


    }
}








/*



*
* *
* * *
* * * *
* * * * *
* * * * * *
* * * * * * *






 */



















