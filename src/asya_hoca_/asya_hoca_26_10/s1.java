package asya_hoca_.asya_hoca_26_10;

import java.util.Scanner;

public class s1 {
    public static void main(String[] args) {

        //Kullanıcıdan alınan satır ve sütun sayısına göre duvar örünüz:)
//Karakter []
//Bir tuğlanın maliyeti 27.5 Tl ise duvarın mailiyetini hesaplayınız

        Scanner scan =new Scanner(System.in);
        System.out.println("sutun sayisi girin");
        int satirS= scan.nextInt();
        System.out.println("satir sayisi girin");
        int sutunS= scan.nextInt();
        double ucret;
        int sayac=0;
        for (int i = 0; i <= satirS; i++) {
            for (int j = 0; j <=sutunS ; j++) {

                System.out.print("[]");
                sayac++;


            }
            System.out.println();

        }
        ucret= (sayac*27.5);
        System.out.println(ucret);



















    }
}
