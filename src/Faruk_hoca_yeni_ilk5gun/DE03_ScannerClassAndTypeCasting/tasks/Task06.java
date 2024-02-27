package Faruk_hoca_yeni_ilk5gun.DE03_ScannerClassAndTypeCasting.tasks;

import java.util.Scanner;

public class Task06 {

    public static void main(String[] args) {

    /* Task->
        Bir dik üçgenin iki dik kenarını alarak hipotenüsünü hesaplayan kod yazınız.

        Örnek Ekran Çıktısı
        birinci kenar: 12
        ikinci kenar: 5
        hipotenus: 13      */


        Scanner scanner = new Scanner(System.in);
        System.out.print("Birinci dik kenar ? : "); int kenar1= scanner.nextInt();
        System.out.print("İkinci  dik kenar ? : "); int kenar2= scanner.nextInt();

        double hipotenus = Math.sqrt(kenar1*kenar1+kenar2*kenar2);
        System.out.println(hipotenus);





    }
}
