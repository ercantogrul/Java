package day10_MethodCreation.DE10_MethodCreation_ilk.Tasks;

import java.util.Scanner;

public class Task07_ucSayinin_enK {
    static Scanner input = new Scanner(System.in);//gunes eyledim ki herkeşler erişebile

    public static void main(String[] args) {
        //Task-> Girilen 3  sayıdan en küçüğünü print eden METHOD  create ediniz

        Scanner scan = new Scanner(System.in);
        System.out.println("bir double sayi giriniz");
        double sayi1 = scan.nextDouble();
        System.out.println("bir double sayi giriniz");
        double sayi2 = scan.nextDouble();
        System.out.println("bir double sayi giriniz");
        double sayi3 = scan.nextDouble();

        double sonuc = enK(sayi1, sayi2,sayi3);  // parametre bu kisim oluyor (d1,d2)
        System.out.println("Girilen 3  sayıdan en küçüğünü : " + sonuc);




    }//main sonu

    private static double enK(double d1, double d2, double d3) {
    return d1<d2 && d1<d3 ? d1 : d2<d1 && d2<d3? d2 :d3;

    }


}
