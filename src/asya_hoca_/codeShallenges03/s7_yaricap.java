package asya_hoca_.codeShallenges03;

import java.util.Scanner;

public class s7_yaricap {
    public static void main(String[] args) {
        //  Girilen yarıcap değeri için Çemberin cevresini ve
        //  Dairenin alanını print eden code create ediniz. (pi =3.14)
        //  Çemberin Çevresi: 2*pi*r
        //  Çemberin Alanı pi*r*r //

        System.out.println("cemberin yari capini giriniz:");
        Scanner scan = new Scanner(System.in);
        double r = scan.nextDouble();
        double p = 3.14;

        System.out.println("cemberin cevresi :" +(2*r*p));
        System.out.println("cemberin alani :" +(r*r*p));




    }
}
