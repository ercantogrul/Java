package Faruk_hoca_yeni_ilk5gun.DE04zIlk4dersDegerlendirmeSorulari;

import java.util.Scanner;

public class C04_Wapper {
    public static void main(String[] args) {
        // Klavyeden girilen biri int, diğeri double, iki sayıdan büyük olanını Wapper
        // class kullanarak ekrana yazdırınız
        Scanner scanner = new Scanner(System.in);
        int s1 = scanner.nextInt();
        double d1 = scanner.nextDouble();
        System.out.println(Double.max(s1,d1));

    }
}
