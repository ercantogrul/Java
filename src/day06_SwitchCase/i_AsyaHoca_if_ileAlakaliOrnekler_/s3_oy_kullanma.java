package day06_SwitchCase.i_AsyaHoca_if_ileAlakaliOrnekler_;

import java.util.Scanner;

public class s3_oy_kullanma {
    public static void main(String[] args) {

/*
Kullanıcıdan alınan bilgilere göre vatandaşı ve 18 yaşından büyük ise oy
kullanabilir.Değilse kullanmaz
//Use if else statement
 */

     // ==if li cözüm ===========================
        Scanner scanner = new Scanner(System.in);
        System.out.println(" vatandas mi : ");
        String vatandas = scanner.nextLine();
        System.out.println("yasini giriniz");
        int yas = scanner.nextInt();

        if (yas>=18 && vatandas.equalsIgnoreCase("evet")) {
            System.out.println( "oy kullanabilir ");
        }else System.out.println( "oy kullanamaz ");

        //== boolean ile cözüm daha kolay==================
        Scanner scan = new Scanner(System.in);
        System.out.println("vatandaslik var mi");
        String str = scanner.next();
        System.out.println("yasinizi giriniz");
        int yas1 = scan.nextInt();

        boolean a = yas1>=18 && str.equalsIgnoreCase("evet");
        if (a) {
            System.out.println("oy kulllanabilir");
        } else System.out.println("oy kullanamaz");

      //============bu yol daha karisik=============
        Scanner scanne = new Scanner(System.in);
        int yas3 = scanne.nextInt();
        boolean vatandas4= scanner.nextBoolean();

        if (vatandas4 && yas3>18) {
            System.out.println("oy kulllanabilir");
        } else
            System.out.println("oy kullanamaz");

        // ternary ===ile cözüm===============================
        Scanner sc = new Scanner(System.in);
        System.out.println( "tc vatandasi misiniz?");
        String vat = sc.next();
        System.out.println("yasinizi giriniz");
        int yas5 = sc.nextInt();

        String durum = vat.equalsIgnoreCase("evet") && yas5>=18? "oy kullanabilir" : "oy kullanamaz";
        System.out.println(durum);









    }
}
