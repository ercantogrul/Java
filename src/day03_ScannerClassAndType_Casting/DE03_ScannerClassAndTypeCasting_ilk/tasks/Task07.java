package day03_ScannerClassAndType_Casting.DE03_ScannerClassAndTypeCasting_ilk.tasks;

import java.util.Scanner;

public class Task07 {

    public static void main(String[] args) {

    /*  Task->
        Mesafeyi ve hızı alıp süreyi hesaplayan bir kod yazınız.
        Örneğin:İstanbul ile Ankara arası 400km olarak ölçülmektedir. Bu yolu ortalama
        120 km/saat hızla giden bir araç ne kadar sürede hedefe varır?

        Örnek Ekran Çıktısı
        Mesafeyi giriniz: 400
        Hızı giriniz: 100
        Süre 4 saattir.
     */
        Scanner scan = new Scanner(System.in);
        System.out.print("mesafeyi giriniz: ");
        double mesafe = scan.nextDouble();

        System.out.print("hizi giriniz:");
        double hiz = scan.nextDouble();
        System.out.println("süre= "+ (int)(mesafe/hiz)+" saattir");







    }
}
