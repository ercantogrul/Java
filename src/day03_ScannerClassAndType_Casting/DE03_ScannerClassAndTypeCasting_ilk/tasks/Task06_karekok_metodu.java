package day03_ScannerClassAndType_Casting.DE03_ScannerClassAndTypeCasting_ilk.tasks;

import java.util.Scanner;

public class Task06_karekok_metodu {

    public static void main(String[] args) {

    /* Task->
        Bir dik üçgenin iki dik kenarını alarak hipotenüsünü hesaplayan kod yazınız.

        Örnek Ekran Çıktısı
        birinci kenar: 12
        ikinci kenar: 5
        hipotenus: 13      */

        Scanner scan = new Scanner(System.in);
        System.out.println("dik ucgenin 1. kenarini giriniz");
        int a = scan.nextByte();
        System.out.println("dik ucgenin 2. kenarini giriniz");
        int b = scan.nextByte();

        double hipotenus = Math.sqrt((a*a)+(b*b));
        System.out.println(hipotenus);








    }
}
