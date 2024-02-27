package Faruk_hoca_yeni_ilk5gun.DE03_ScannerClassAndTypeCasting.Sorular;

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
    }
}
