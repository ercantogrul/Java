package day03_ScannerClassAndType_Casting.DE03_ScannerClassAndTypeCasting_ilk.Sorular;

import java.util.Scanner;

public class S01 {
    // ekran dan 2 adet byte sayı okutun ve toplamlarını yazdırın
    public static void main(String[] args) {
        Scanner oku =new Scanner(System.in);
        byte notVize1 = oku.nextByte();
        byte notVize2 = oku.nextByte();
        byte notFinal = oku.nextByte();
        double ortalama = 1.0*(notVize1+notVize2+notFinal) / 3;

        System.out.println(ortalama);
        //======================================

        Scanner scan = new Scanner(System.in);
        System.out.println("vize notunuzu giriniz");
        int vize = scan.nextInt();

        System.out.println("proje notunuzu giriniz");
        int proje = scan.nextInt();

        System.out.println("sonSinav notunuzu giriniz");
        int sonSinav = scan.nextInt();

        double greade = ((vize*0.3)+(proje*0.2)+(sonSinav*0.5));
        System.out.println("not ortalamasi = "+ greade);




    }
}
