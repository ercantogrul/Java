package day03_ScannerClassAndType_Casting.DE03_ScannerClassAndTypeCasting_ilk.Sorular;


import java.util.Scanner;

public class S02 {
    // 1 string ve 1 inter veriyi klavyeden okuyup birleştiriniz
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        Scanner scanNL =new Scanner(System.in);

        System.out.print("Metni giriniz : ");
        String metin = scanNL.nextLine();

        System.out.print("Sayıyı giriniz : ");
        int sayi= scan.nextInt();

        System.out.print("2.Metni giriniz : ");
        String metin2 = scanNL.nextLine();

        System.out.println(metin+metin2+sayi);
    }
}
