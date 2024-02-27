package day07_StringManuplation.DE07_StringManuplation;

import java.util.Scanner;

public class C04_Contains {
    public static void main(String[] args) {
             /*
        String iersinde istenen stringini varlığını kontrol eder boolean değer return eder..
         */

        String str = "başarı gayrete aşıktır :) javaCAN'lara selam olsun";

        if (str.contains(" :) ")) System.out.println("içerir");
        else System.out.println("içermez");



    }


}
