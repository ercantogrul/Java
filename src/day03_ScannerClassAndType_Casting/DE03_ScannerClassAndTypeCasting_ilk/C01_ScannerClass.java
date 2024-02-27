package day03_ScannerClassAndType_Casting.DE03_ScannerClassAndTypeCasting_ilk;


import java.util.Scanner;

public class C01_ScannerClass {
    public static void main(String[] args) {
        /*
        //Kodlarımızı yazdığımız Intellig veya benzeri ideallere dışarıdan bilgi almak için
        Java until kütüphanesinden Scanner Class'ina  ihtiyacımız var.
        1. adim: Scanner Class'inda var olan hazır method'ları kullanabilmek için Scanner Class'indan bir obje oluşturmalıyız.
            -----Scanner scan = new Scanner(System.in);------buradaki scan variable dir ve ismi degisebilir.---
        2. adim: Scanner çalışınca kullanıcıdan bir bilgi bekleyecektir.Kullanıcının kendisinden ne istediğini bilmesi için bir açıklama yazdıralım.
             ----System.out.print("Lufen bir tam sayi giriniz : ");----gibi-------
        3.adim: istediginiz data turune uygun bir variable olusturunuz.
                --ve Scanner objesini kullanarak uygun method'la kullanicinin girdigi degeri alir.
            -----int sayi = scan.nextInt();----
       // yani bu----scan.nextInt();--  konsoldan veriyi aliyor. Mesela ben 44 girdiysem o bilgiyi bu alıyor.Sonrada girilen sayıVariable'sine  atamış oluyor
       // Artık Kullanıcının girdiği sayı kod ortamımıza kaydedildi.Bu variable'i istediğimiz şekilde kullanabiliriz.
      --ORNEK__
      // kullanicidan bir tam sayi alip, karesini yazdiriniz
      1.adim--Scanner scan = new Scanner(System.in);
      2.adim--System.out.print("Lufen bir tam giriniz : ");
      3.adim--int sayi = scan.nextInt();
      sonuc---System.out.print( "girilen sayininkaresi : " + sayi*sayi);
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("Sayıyı giriniz : ");
        int s1 = scan.nextInt();

        String str="a10";
        System.out.println("Klavyeden girdiğiniz sayının 2 katı  = "+s1*2);

        //=============================//

        Scanner sc = new Scanner(System.in);
        System.out.println("ad soyad yas  bilgilerinizi giriniz");  // talep edilen tum veriler icin sadece bir tane aciklama yazilabilir.
        String adi = sc.nextLine();
        String soyad = sc.nextLine();
        int yas = sc.nextInt();

        System.out.println("adi :" + adi+ "\nsoyad :"+ soyad + "\nyas: "+ yas);





    }
}
