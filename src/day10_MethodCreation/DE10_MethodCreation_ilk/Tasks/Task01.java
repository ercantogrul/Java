package day10_MethodCreation.DE10_MethodCreation_ilk.Tasks;

import java.util.Scanner;

public class Task01 {

    public static void main(String[] args) {
        //task-> girilen iki sayının eşitliğini control eden METHOD create ediniz
        Scanner input = new Scanner(System.in);
        System.out.print("1. sayıyı giriniz : ");
        int num1 = input.nextInt();

        System.out.print("2. sayıyı giriniz : ");
        int num2 = input.nextInt();

        if (esitMi(num1,num2)) System.out.println("eşittir");
        else System.out.println("eşit değildir");

        if (buyukMu(num1,num2)) System.out.println("num1 buyuktur");
        else System.out.println("num1 buyuk değildir");

    }//main sonu

    private static boolean buyukMu(int num1, int num2) {
        return num1>num2;
    }

    private static boolean esitMi(int num1, int num2) {
        return num1 == num2;
    }


}//class sonu
