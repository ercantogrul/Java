package asya_hoca_.B02_Methodlar_2;

import java.util.Scanner;

public class S06 {
    public static void main(String[] args) {
/* task ->
   Girilen iki integer sayının eşitliğini kontrol eden java methodunu yazınız.
    num1 = num2 => true
    */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz");
        int sayi1 = scan.nextInt();
        System.out.println("Lütfen ikinci sayiyi giriniz");
        int sayi2 = scan.nextInt();

        esitlikKontrolu(sayi1, sayi2);

        System.out.println(check(sayi1, sayi2));  // ikinci yol boolean

    }
    private static void esitlikKontrolu(int s1, int s2) {

        if ((s1 == s2)) {
            System.out.println("sayilar esit");
        } else System.out.println("sayilar esit degildir");
    }
    private static boolean check(int num1, int num2) {
        return (num1 == num2);
    } //ikinci yol
}