package day10_MethodCreation.C01_Method;

import java.util.Scanner;

public class s3_return {
    public static void main(String[] args) {
        //soru 3: topla3 adinda bir metod yaziniz, bu method scanner class ile main methotta okuttugunuz iki double variabla parametre olarak alsin,
        // ve bunlari toplayip retorn etsin ve main method ta yazdirsin

        Scanner scan = new Scanner(System.in);
        System.out.println("bir double sayi giriniz");
        double d1 = scan.nextDouble();
        System.out.println("bir double sayi giriniz");
        double d2 = scan.nextDouble();
        double sonuc = topla3(d1,d2);  // parametre bu kisim oluyor (d1,d2)
        System.out.println(sonuc);

    }

    private static double topla3(double d1, double d2) { // yukarida parametre d1,d2 olarak gönderilmis,
        // burada (s1,s2) s1=d1, s2 =d2 seklinde islem girebilir
        // method icerisindeki parametre adlari cagrildigi yer ile ayni olmak zorunda degildir.
        // ancak veri tipi ve sirasi ve sayisi önemlidir

        return d1+d2;


    }
}
