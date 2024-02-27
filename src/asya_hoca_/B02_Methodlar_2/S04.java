package asya_hoca_.B02_Methodlar_2;

import java.util.Scanner;

public class S04 {
    public static void main(String[] args) {
        /* Task->
         * girilen String icinde "xyz" dizimi var ise true degilse false return eden metod create ediniz.
         *
         * input      output
         * axyzm  ==   true
         * xyz    ==   true
         * x.yz   ==   false
         * xyaz   ==   false
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir ifade giriniz");
        String str = scan.nextLine();

        dizilimKontrolu(str); // return olmadan
        System.out.println(kontrolson(str)); // return ile

    }
    private static boolean kontrolson(String str) {
        return (str.contains("xyz")) ;
    }
    //===============ikinci yöntem==================================
    private static void dizilimKontrolu(String str) {
        if (str.contains("xyz")) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }



}