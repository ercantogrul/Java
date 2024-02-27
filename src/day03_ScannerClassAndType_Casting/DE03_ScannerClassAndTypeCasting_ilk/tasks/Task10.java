package day03_ScannerClassAndType_Casting.DE03_ScannerClassAndTypeCasting_ilk.tasks;

import java.util.Scanner;

public class Task10 {
    /*
    Task->
    Write a Java program to convert temperature from Fahrenheit to Celsius degree.
    formula :  c = (f-32)*5/9
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("sicakligi fahrenheit cinsinden giriniz: ");
        double f = scan.nextDouble();
        System.out.println("Celsius degree= "+ ( (f-32)*5/9));



    }


}
